package RunApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.JasyptTest;
import test.PropertyPlaceHolderTest;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 7/9/13
 * Time: 8:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestApp {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("RunApp/test.xml");
        JasyptTest test = applicationContext.getBean("PropertyAdder",JasyptTest.class);
        test.showPassword();
    }
}
