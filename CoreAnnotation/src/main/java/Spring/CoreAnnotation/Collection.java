package Spring.CoreAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Collection implements conton{

	
	public void data() 
	{
		
		int num=7;
		int sum=1;
		for(int i=1;i<=num;i++) 
		{
		
			sum=sum*i;
			
			System.out.println(sum);
					
			
		}
		
		
		
		
	}
	
	
}
