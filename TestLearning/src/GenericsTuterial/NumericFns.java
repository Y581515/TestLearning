package GenericsTuterial;

public class NumericFns<T extends Number> {
	
	private T ob;
	
	public NumericFns(T ob){
		this.ob=ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public double square() {
		return ob.intValue()*ob.doubleValue();
	}
	
	boolean absEqual(NumericFns<?> ob2) {
		if(Math.abs(ob.doubleValue())==Math.abs(ob2.getOb().doubleValue())) {
			return true;
			
		}else {
			return false;
		}
	}
	
	

}
