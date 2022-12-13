package day35_Encapsulation.Tasks.carpet;

public class Carpet {

    private double width;
    private double length;
    private double unitPrice;
    private boolean isPerisan;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0) {
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0) {
            return;
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public boolean getIsPerisan() {
        return isPerisan;
    }

    public void setPerisan(boolean perisan) {
        isPerisan = perisan;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPerisan) {
        setWidth(width);
        setLength(length);
        setPerisan(isPerisan);
        setUnitPrice(unitPrice);
    }

    public double calcCost(){
        return (isPerisan)? (/*nested if*/ (width*length>0)? width*length*unitPrice+200 : 0 ) : (width*length)*unitPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ", unitPrice=" + getUnitPrice() +
                ", isPerisan=" + getIsPerisan() +
                ", Cost=" + calcCost() +
                '}';
    }
}
/*
3. Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			length can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet
                         including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */