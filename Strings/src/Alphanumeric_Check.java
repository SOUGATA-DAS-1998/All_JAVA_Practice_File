
public class Alphanumeric_Check {

	public static void main(String[] args) {
		//String s="GeeksforGeeks";
		String s="GeeksforGeeks123";
		boolean temp=s.contains("[a-zA-Z]");
		if(temp) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
	}

}
