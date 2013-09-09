package equipments;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Equipment
{
    private int calories;
    private int weight;
    private String type;


    public Equipment(String type) {
        this.type = type;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void useEquipment()
    {
        if(type.equalsIgnoreCase("cardio"))
            System.out.println("Doing Cardio.Will burn "+calories+" calories");
        else
            System.out.println("Strengthening Muscles.Lifting "+weight+" Kgs");
    }
}
