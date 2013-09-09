package test;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.ObjectUtils;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Aniket
 * Date: 7/9/13
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class DecryptPropertyConfigurer extends PropertyPlaceholderConfigurer
{
    @Override
    protected void convertProperties(Properties properties)
    {
        Enumeration propertiesEnumeration = properties.propertyNames();
        while (propertiesEnumeration.hasMoreElements()) {
            String propertyName = String.class.cast(propertiesEnumeration.nextElement());
            String propertyValue = properties.getProperty(propertyName);
            int convertedValue = Integer.parseInt(propertyValue) - 10;
            String conVal = String.valueOf(convertedValue);
            if(!ObjectUtils.nullSafeEquals(propertyValue,conVal)) {
                properties.setProperty(propertyName,conVal);
            }

        }
    }
//    @Override
//    protected String convertPropertyValue(String originalValue) {
//
//
//
//// Perform processing of the encrypted file
//
//        // if(originalValue is encrypted){
//
//        // return decrypt(originalValue)
//
//        // }
//
//        return originalValue+"aa";
//
//    }

}
