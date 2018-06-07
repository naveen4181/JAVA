package Upload.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	ApplicationContext cf=new ClassPathXmlApplicationContext("Upload/Annotation/Data.xml");
    	
    	Database db= (Database) cf.getBean("oracle");
    	db.data();
    	
    }
}
