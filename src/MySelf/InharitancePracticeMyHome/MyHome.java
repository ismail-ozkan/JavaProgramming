package MySelf.InharitancePracticeMyHome;

public class MyHome {

    public static void main(String[] args) {

        Saloon mySaloon = new Saloon(4,5,"East",2,"Brick",1,true,2,1);
        DinnerRoom dinnerRoom = new DinnerRoom(3,4,"East",1,"brick",true,true,4);
        SittingRoom sittingRoom = new SittingRoom(4,3,"West",1,"Brick", 2,true);
        Kitchen kitchen = new Kitchen(3.1,2,"North",1,"Brick",2.3);



        Home myHome = new Home(sittingRoom,dinnerRoom,mySaloon,kitchen);

        System.out.println(myHome.homeVolume());


    }
}
