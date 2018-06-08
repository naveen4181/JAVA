package Spring.CoreAnnotation;

import java.text.Annotation;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	
    	
    	ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	
    	conton cn=ap.getBean(array.class);
    	
    	cn.data();
    	
    	
    }
}
