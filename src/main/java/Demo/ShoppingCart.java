package Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(){
        //Business logic
        System.out.println("Checkout Method for Shopping Cart Running");
    }

}
