package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 8:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class GymExerciser implements Exerciser {

    private int weight;

    public GymExerciser() {

    }

    public void setWeights(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void doWarmUp()
    {
        System.out.println("Warming Up!!!");
    }

    public void doCoolDown()
    {
        System.out.println("Cooling Down!!!!");
    }

    public void doExercise() {
        System.out.println("Doing GYM."+weight+" Kgs. CLang and BanG!!!");
    }
}
