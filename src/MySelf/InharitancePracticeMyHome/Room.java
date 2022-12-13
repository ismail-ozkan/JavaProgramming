package MySelf.InharitancePracticeMyHome;

public class Room {

    public double width;
    public static double length = 2;
    public double depth;
    public String directionOfWindow;
    public double numberOfWindow;
    public String material;

    public Room(double width, double depth, String directionOfWindow, double numberOfWindow, String material) {
        this.width = width;
        this.depth = depth;
        this.directionOfWindow = directionOfWindow;
        this.numberOfWindow = numberOfWindow;
        this.material = material;
    }

    public double roomVolume(){
        return width*length*depth;
    }

}
