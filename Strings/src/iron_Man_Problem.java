
public class iron_Man_Problem {
//	 public static boolean saveIronman (String s) {
//	        String X="";
//	        for(int i=0; i< s.length();i++){
//	            if((int) s.charAt(i) >= 65 && (int)s.charAt(i) <=90 || (int)s.charAt(i)>=97 && (int)s.charAt(i)<=122 ){
//	                X= X + Character.toLowerCase(s.charAt(i));
//	            }
//	        }
//	    //     String rev="";
//	    //   // String Y=X.toLowerCase();
//	    //   //int Z=Y.length();
//	        
//	    //     for(int i=X.length()-1;i>=0;i--)
//	    //     {
//	    //         rev=rev + X.charAt(i);
//	    //     }
//	    //     if(X.equals(rev)){
//	    //     return true;
//	    //     }
//	    //  return false;
//	    
//	    int k=0;
//	    int j=X.length()-1;
//	    while(k < j){
//	        if(X.charAt(k) != X.charAt(j))
//	        return false;
//	        k++;
//	        j--;
//	    }
//	    return true;
//	    }
	
	 
	 /// Modified code Not Done by me
	  public static boolean saveIronman (String s) {
	 String str = s.replaceAll("[^a-zA-Z0-9]", "");
     str = str.toLowerCase();
     int i = 0;
     int j = str.length() - 1;
     
     while(i<j){
         if(str.charAt(i) != str.charAt(j))
             return false;
         i++;
         j--;
     }
     return true;
	 
}

	 
	 
	public static void main(String[] args) {
		
		boolean ans=saveIronman("I am :IronnorI Ma, i");
	if(ans == true) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	}

}
