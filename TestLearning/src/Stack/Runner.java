package Stack;

public class Runner {
	
	public static void main(String[] args) {
	
		Dstack nums = new Dstack(5);
		nums.push(15);
		nums.push(8);
		nums.push(10);
		nums.push(11);
		nums.push(14);
		nums.push(21);
		
		nums.show();
		nums.pop();
		nums.push(22);
		nums.push(21);
		nums.pop();
		nums.pop();
		nums.show();
		
		
	
	}

}
