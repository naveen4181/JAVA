package Upload.Annotation;

import org.springframework.stereotype.Component;

@Component
public class Oracle implements Database {
	
	
	public void data() 
	{
		
		String s="Painkiller";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
{
	
		char c[]=s.toCharArray();

	System.out.println(c[i]);	
		
			
			
}
	}

}
