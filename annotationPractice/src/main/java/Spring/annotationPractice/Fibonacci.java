package Spring.annotationPractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Fibonacci implements inter {
	
	public void logic() {
		
		
	System.out.println("Fibonacci");
		
	
int a=0;int
b = 1;
int c=0;
	
for(int i=0;i<5;i++) 
{
	
c=a+b;
System.out.println(c);
a=b;
b=c;



}	
	
	
	
	
		
	}
	
	

}
