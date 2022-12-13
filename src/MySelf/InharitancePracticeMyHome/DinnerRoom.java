package MySelf.InharitancePracticeMyHome;

public class DinnerRoom extends Room{

    public boolean hasTable;
    public boolean hasChair;
    public double numberOfChair;

    public DinnerRoom(double width, double depth, String directionOfWindow, double numberOfWindow, String material, boolean hasTable, boolean hasChair, double numberOfChair) {
        super(width, depth, directionOfWindow, numberOfWindow, material);
        this.hasTable = hasTable;
        this.hasChair = hasChair;
        this.numberOfChair = numberOfChair;
    }
}
