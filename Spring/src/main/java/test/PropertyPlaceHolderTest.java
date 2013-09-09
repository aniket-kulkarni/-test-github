package test;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 7/9/13
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyPlaceHolderTest
{

    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add() {

        System.out.println("Addition="+(a+b));
    }

}
