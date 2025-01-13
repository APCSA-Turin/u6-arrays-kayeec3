import java.util.Arrays;
import java.util.Collections;


public class FlowerShop {


   private Flower[] flowerInventory;


   // ADDED TO ENABLE TESTING
   public FlowerShop(Flower[] flowerInventory) {
       this.flowerInventory = flowerInventory;
   }


   // ADDED TO ENABLE TESTING
   public Flower[] getFlowerInventory() {
       return flowerInventory;
   }


   // IMPLEMENTATION ADDED TO ENABLE TESTING
   public Flower[] sortByQuantity(Flower[] arr) {
       Flower[] sortedCopy = new Flower[arr.length];
       for (int i = 0; i < sortedCopy.length; i++) {
           sortedCopy[i]= arr[i];
       }
       Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
       Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
       return sortedCopy;
   }


   // part a
   public void updateInventory(Flower[] newInventory) {
        for (int i = 0; i<newInventory.length; i++) {
            int newInv = newInventory[i].getQuantity() + flowerInventory[i].getQuantity();
            flowerInventory[i].setQuantity(newInv);
        }
   }


   // part b
   public boolean topNSame(int n, Flower[] otherInventory) {
    Flower sortFlower[] = sortByQuantity(flowerInventory);
    Flower sortOther[] = sortByQuantity(otherInventory);
    int count = 0;
    for (int i = 0; i<n; i++) {
    if (sortFlower[i].getName().equals(sortOther[i].getName())) {
        count++;
    }
    }
    if (count==n) {
        return true;
    }
    else {
        return false;
    }
    }
}


