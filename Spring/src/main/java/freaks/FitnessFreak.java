package freaks;

import exercise.*;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 8:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class FitnessFreak
{
    Exerciser exerciser;

    public FitnessFreak(Exerciser exerciser) {
        this.exerciser = exerciser;
    }

    public void exercise()
    {
        exerciser.doExercise();
    }

    public Exerciser getExerciser() {
        return exerciser;
    }
}
