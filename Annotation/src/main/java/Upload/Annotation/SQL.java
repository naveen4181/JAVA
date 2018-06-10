package Upload.Annotation;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class SQL implements Database{
	

	public void data() 
	{
		Random r= new Random();
		System.out.println("This is the SQL"+r.nextInt(500));
		
		
		String name[]= {"Telseko","Durga"};
		
		
		for(String names:name)
		{
			
			System.out.println(names);
			
		}
		
		
		
		
		
	}

}
