
public class Test {

	public void print(int number) {
		if(number == 0) {
			return;
		}
		System.out.print(number+" ");
		print(number-1);
		print(number-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t = new Test();
        
        t.print(5);
	}

}
