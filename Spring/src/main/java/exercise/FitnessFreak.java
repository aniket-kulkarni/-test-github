package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 8:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class FitnessFreak
{
    AerobicsExerciser aerobicsExerciser;

    public FitnessFreak(AerobicsExerciser aerobicsExerciser) {
        this.aerobicsExerciser = aerobicsExerciser;
    }

    public void exercise()
    {
        aerobicsExerciser.doExercise();
    }

}
