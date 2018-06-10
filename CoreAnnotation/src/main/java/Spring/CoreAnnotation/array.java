package Spring.CoreAnnotation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class array implements conton {

	@Autowired
	conton c1;
	
	public conton getC1() {
		return c1;
	}

	public void setC1(conton c1) {
		this.c1 = c1;
	}

	@Autowired


	Collection c;
	
	public Collection getC() {
		return c;
	}

	public void setC(Collection c) {
		this.c = c;
	}
	
	public void data() {
		
	c.data();
	c1.data();
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		a.add(1);
		a.add(12);
		a.add(13);
		a.add(1);
		a.add(1);
				

		
		for(int a1:a)
		{
			
			System.out.println(a1);
			
			
		}
	
	}

}
