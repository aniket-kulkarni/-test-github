package diet;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/25/13
 * Time: 8:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Diet
{
   public void eatMeal(ProceedingJoinPoint joinPoint) throws Throwable
   {
       System.out.println("Eating a banana");
       joinPoint.proceed();
       System.out.println("Eating 5 Egg Whites!! Whey Protein Shake and carbs!!!");
   }

    public void eatPreWorkOutMeal()
    {
        System.out.println("Eating a banana");
    }

}
