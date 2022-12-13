package MySelf.InharitancePracticeMyHome;

public class SittingRoom extends Room{

    public double numberOfCouch;
    public boolean hasTV;

    public SittingRoom(double width, double depth, String directionOfWindow, double numberOfWindow, String material, double numberOfCouch, boolean hasTV) {
        super(width, depth, directionOfWindow, numberOfWindow, material);
        this.numberOfCouch = numberOfCouch;
        this.hasTV = hasTV;
    }
}
