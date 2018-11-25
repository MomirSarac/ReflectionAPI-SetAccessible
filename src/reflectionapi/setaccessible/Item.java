
package reflectionapi.setaccessible;

/**
 *
 * @author Momir Sarac
 */
public class Item {

    private String nameOfTheItem;
    private double priceOfTheItem;
    private int quantityOfTheItem;

    public Item() {
    }

    public Item(String nameOfTheItem, double priceOfTheItem, int quantityOfTheItem) {
        this.nameOfTheItem = nameOfTheItem;
        this.priceOfTheItem = priceOfTheItem;
        this.quantityOfTheItem = quantityOfTheItem;
    }

    /**
     * @return the nameOfTheItem
     */
    public String getNameOfTheItem() {
        return nameOfTheItem;
    }

 
   // no setter method for quantityOfTheItem for purpose of testing Java Reflection API methods

    /**
     * @return the priceOfTheItem
     */
    public double getPriceOfTheItem() {
        return priceOfTheItem;
    }

    /**
     * @param priceOfTheItem the priceOfTheItem to set
     */
    public void setPriceOfTheItem(double priceOfTheItem) {
        this.priceOfTheItem = priceOfTheItem;
    }

    /**
     * @return the quantityOfTheItem
     */
    public int getQuantityOfTheItem() {
        return quantityOfTheItem;
    }

   // no setter method for quantityOfTheItem for purpose of testing Java Reflection API methods

    @Override
    public String toString() {
        return "Item: " + getNameOfTheItem() + ", Value: " + getPriceOfTheItem() + ", Quantity: " + getQuantityOfTheItem();
    }

}

