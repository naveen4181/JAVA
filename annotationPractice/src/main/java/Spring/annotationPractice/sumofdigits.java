package Spring.annotationPractice;

import org.springframework.stereotype.Component;

@Component
public class sumofdigits implements inter {

	
	
	
	public void logic() 
	{
		
		
	int n=12;
	
	int sum=0;
	while(n>0) 
	{
		
		sum=sum+n%10;
		
		n=n/10;
		
		
		System.out.println(sum);
	}
		
		
	
	}
}
