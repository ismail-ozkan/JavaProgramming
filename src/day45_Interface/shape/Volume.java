package day45_Interface.shape;

public interface Volume {

    boolean hasVolume = true;

    public final static double pi = 3.14;
    public abstract double volume();

    /*public default double volumme(){// It works like a static method

        return 100;
    }*/

}
