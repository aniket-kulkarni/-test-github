package exercise;

import equipments.Equipment;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/23/13
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class HeavyGymExerciser implements Exerciser{

    private Map<String,Equipment> equipmentMap;

    public HeavyGymExerciser()
    {

    }

    public void setEquipmentMap(Map<String, Equipment> equipmentMap) {
        this.equipmentMap = equipmentMap;
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
        Iterator iterator = equipmentMap.entrySet().iterator();
        Map.Entry entry;
        while (iterator.hasNext()) {
            entry = (Map.Entry)iterator.next();
            String name = (String)entry.getKey();
            Equipment equipment = (Equipment)entry.getValue();
            System.out.println("Using "+name);
            equipment.useEquipment();
        }
    }


//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("In before post process before init "+beanName);
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("In post process after init "+beanName);
//        return bean;
//    }
}
