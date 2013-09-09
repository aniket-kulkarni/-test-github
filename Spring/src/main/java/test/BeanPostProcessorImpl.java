package test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 6/26/13
 * Time: 7:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("In Impl class of Bean Post Processor before method "+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("In Impl class of Bean Post Processor after method "+s);
        return o;
    }
}
