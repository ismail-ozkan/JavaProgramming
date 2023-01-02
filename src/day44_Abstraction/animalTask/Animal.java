package day44_Abstraction.animalTask;

public abstract class Animal {


    private String name;

    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

        // 3 setter, 6 getter
    public final static boolean canBreathe;

    static {
        canBreathe = true;
        if (canBreathe == false ){
            throw new RuntimeException("Invalid");
        }
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        if (breed.isEmpty()||breed.isBlank()||breed==null) {
            throw new RuntimeException("Invalid breed " + breed);
        }
        this.breed = breed;
        if (!(gender=='M'||gender=='F')){
            throw new RuntimeException("Invalid gender: "+ gender);
        }
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()||name==null) {
            throw new RuntimeException("Invalid name " + name);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(getName() + " drinks water");
    }

    public static void staticMet(){
        System.out.println("static try");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
