
package reflectionapi.setaccessible;

import java.lang.reflect.Field;

/**
 * Modification of a visibility( in a certain way ) of private declared class
 * members nameOfTheItem and quantityOfTheItem from class Item using Field.setAccessible() 
 * as an example of powerful and useful feature such as Java Reflection API.
 *
 * @author Momir Sarac
 */
public class ReflectionAPISetAccessible {

    /**
     *
     *
     * @param args the command line arguments
     * @throws NoSuchFieldException
     * @throws java.lang.IllegalArgumentException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Item item = new Item("", 599.99, 0);
        final Field itemName = item.getClass().getDeclaredField("nameOfTheItem");
        itemName.setAccessible(true);
        itemName.set(item, "Iphone 6s");
        final Field itemQuantity = item.getClass().getDeclaredField("quantityOfTheItem");
        itemQuantity.setAccessible(true);
        itemQuantity.set(item, 5);
        System.out.println(item);

    }

}
