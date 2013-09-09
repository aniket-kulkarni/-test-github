package RunApp;
import freaks.FitnessFreak;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 8:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class App
{
    public static void main(String[] args)
    {
        //ApplicationContext applicationContext = new FileSystemXmlApplicationContext("I:\\Intellij WorkSpace\\Spring\\src\\main\\java\\RunApp\\freaks.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("RunApp/freaks.xml");
        FitnessFreak aniket = (FitnessFreak)applicationContext.getBean("aniket");
        aniket.exercise();
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

}
