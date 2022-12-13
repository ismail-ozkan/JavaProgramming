package MySelf.InharitancePracticeMyHome;

public class Saloon extends Room{

    public int numberOfCarpet;
    public boolean hasLibrary;
    public double numberOfCouch;
    public double numberOfBergere;

    public Saloon(double width, double depth, String directionOfWindow, double numberOfWindow, String material, int numberOfCarpet, boolean hasLibrary, double numberOfCouch, double numberOfBergere) {
        super(width, depth, directionOfWindow, numberOfWindow, material);
        this.numberOfCarpet = numberOfCarpet;
        this.hasLibrary = hasLibrary;
        this.numberOfCouch = numberOfCouch;
        this.numberOfBergere = numberOfBergere;
    }
}
