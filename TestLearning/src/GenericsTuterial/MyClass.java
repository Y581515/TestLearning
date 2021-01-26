package GenericsTuterial;

public class MyClass<T> {

	private T ob;

	public MyClass(T ob){
		this.ob=ob;
	}

	public T getOb1() {
		return ob;
	}

	public void setOb1(T ob) {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println(ob.getClass().getName());
	}

	
}
