package Spring.Intialize;

import java.applet.AppletContext;

import org.omg.CORBA.portable.ApplicationException;
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
        
    	ApplicationContext  pn=new ClassPathXmlApplicationContext("Spring/Intialize/Spring.xml");
    	
    	
    	
    	qun r=(qun) pn.getBean("mobiles");   
    	r.mob();
    	
    	
}}