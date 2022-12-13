package MySelf.InharitancePracticeMyHome;

public class Kitchen extends Room{

    public double lengtOfStand;

    public Kitchen(double width, double depth, String directionOfWindow, double numberOfWindow, String material, double lengtOfStand) {
        super(width, depth, directionOfWindow, numberOfWindow, material);
        this.lengtOfStand = lengtOfStand;
    }
}
