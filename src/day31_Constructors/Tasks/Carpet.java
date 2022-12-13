package day31_Constructors.Tasks;

public class Carpet {

    public int width, length;
    public double unitPrice;
    public boolean isPerisan;

    public Carpet(int width, int length, double unitPrice, boolean isPerisan) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPerisan = isPerisan;
    }

    public double calcCost(){
        double totalPriceOfCarpet = (width*length)*unitPrice;
        if (isPerisan){
            totalPriceOfCarpet+=200;
        }
        return totalPriceOfCarpet;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPerisan=" + isPerisan +
                ", totalCostOfCarpet=" + calcCost() +
                '}';
    }
}
/*
5. Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

		Add a constructor to set all the instances

                instance methods:

                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */