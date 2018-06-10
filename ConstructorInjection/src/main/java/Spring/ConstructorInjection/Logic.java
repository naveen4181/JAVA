package Spring.ConstructorInjection;

public class Logic {
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Logic [num=" + num + "]";
	
	

	
	
	
	}

	public Logic(int num) {
		super();
		this.num = num;
		
		
	}
	
	
	
	
	

}
