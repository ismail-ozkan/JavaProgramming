package MySelf.InharitancePracticeMyHome;

public class Home {

    public SittingRoom sittingRoom;
    public DinnerRoom dinnerRoom;
    public Saloon saloon;
    public Kitchen kitchen;

    public Home(SittingRoom sittingRoom, DinnerRoom dinnerRoom, Saloon saloon, Kitchen kitchen) {
        this.sittingRoom = sittingRoom;
        this.dinnerRoom = dinnerRoom;
        this.saloon = saloon;
        this.kitchen = kitchen;
    }

    public double homeVolume(){
        double volume = 0;
        volume = sittingRoom.roomVolume()+
                dinnerRoom.roomVolume()+
                saloon.roomVolume()+
                kitchen.roomVolume();
        return volume;
    }


}
