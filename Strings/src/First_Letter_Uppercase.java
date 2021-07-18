
public class First_Letter_Uppercase {

	public static void main(String[] args) {
		String s="i love programming";
	        String title = "";
	        title += Character.toUpperCase(s.charAt(0));
	        for(int i = 1; i<s.length(); i++){
	            if(s.charAt(i-1) == ' '){
	            	 title += Character.toUpperCase(s.charAt(i));  
	            }
	            else{
	                title += s.charAt(i);
	            }
	        }
	       System.out.println(title);
	    
	
	}
	
}


