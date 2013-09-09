package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 8:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class ZumbaExerciser implements Exerciser
{
    public void doWarmUp()
    {
        System.out.println("Warming Up!!!");
    }

    public void doCoolDown()
    {
        System.out.println("Cooling Down!!!!");
    }

    public void doExercise()
    {
        System.out.println("Doing Zumba!!! Move It");
    }

}
