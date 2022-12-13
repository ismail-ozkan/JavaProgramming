package MySelf;

public class FamilyObject {

    public static void main(String[] args) {


        Family member1 = new Family("ismail");
        Family member2 = new Family("kübra",31);
        Family member3 = new Family("bebik");





        member1.who();
        String sirname = Family.lastName2();
        int ageOfmember1 = member1.age;
        member1.ageOfMember();

    }

}
