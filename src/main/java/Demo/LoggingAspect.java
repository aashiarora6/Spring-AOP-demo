package Demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* Demo.ShoppingCart.checkOut(..))")
    public void beforelogger() {
        System.out.println("Before Logger");
    }

    @After("execution(* *.*.checkOut(..))")
    public  void Afterlogger(){
        System.out.println("After Logger");
    }
}
