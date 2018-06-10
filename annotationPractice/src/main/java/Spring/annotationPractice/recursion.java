package Spring.annotationPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class recursion {

	@Autowired
	 inter r;
	

	public inter getR() {
		return r;
	}



	public void setR(inter r) {
		this.r = r;
	}

public void display() {r.logic();}



	static int aplha(int n)
	
	{
	
		if(n<=1)
		{
			return n;
			
		}
		
		
		return aplha(n-1)+aplha(n-2);
	}
	
}
