import java.util.*;

class InventoryManager {

    HashMap<String,Integer> stock = new HashMap<>();

    public void addProduct(String id,int quantity){
        stock.put(id,quantity);
    }

    public void purchaseItem(String productId){

        int qty = stock.getOrDefault(productId,0);

        if(qty>0){
            stock.put(productId,qty-1);
            System.out.println("Purchase successful. Remaining: "+(qty-1));
        } else {
            System.out.println("Out of stock");
        }
    }
}

public class InventoryManagerApp {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct("IPHONE15",100);

        manager.purchaseItem("IPHONE15");
        manager.purchaseItem("IPHONE15");
    }
}