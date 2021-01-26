package GenericsTuterial;

public class MyClassTV<T, V> {
	private T ob;
	private V ob2;

	public MyClassTV(T ob,V ob2){
		this.ob=ob;
		this.ob2=ob2;
	}

	public T getOb1() {
		return ob;
	}
	public void setOb1(T ob) {
		this.ob = ob;
	}
	
	public V getOb2() {
		return ob2;
	}

	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}
	
	public void showType() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}

}
