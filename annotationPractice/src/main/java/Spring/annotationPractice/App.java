package Spring.annotationPractice;

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
        ApplicationContext ap= new AnnotationConfigApplicationContext(Appconfig.class);
        
        recursion r=ap.getBean(recursion.class);
        
        r.display();
       int a= r.aplha(12);

       System.out.println(a);
    
    
    }
}
