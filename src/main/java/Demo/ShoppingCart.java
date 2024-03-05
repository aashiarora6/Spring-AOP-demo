package Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(String status){
        //Business logic
        //Logging
        //Authentication & authorization
        //Sanitize the data
        //The above all are cross-cutting aspects we need to separate out the logic of aspects
        System.out.println("Checkout Method for Shopping Cart Running");
    }

}
