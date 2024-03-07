package Demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* Demo.ShoppingCart.checkOut(..))")
    public void beforelogger(JoinPoint jp) {
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Logger with Argument: " + arg);
    }

    @After("execution(* *.*.checkOut(..))")
    public void Afterlogger() {
        System.out.println("After Logger");
    }

    @Pointcut("execution(* Demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning : " + retVal);
    }
}
