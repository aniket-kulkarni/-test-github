package test;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 7/9/13
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class JasyptTest {

    String password;

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showPassword()
    {
        System.out.println("Password="+password);
    }
}
