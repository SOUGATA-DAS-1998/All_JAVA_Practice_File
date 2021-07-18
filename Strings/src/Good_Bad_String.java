
public class Good_Bad_String {

	static boolean isVouwl(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'|c=='u') {
			return true;
		}
		return false;
	}
	static int isGoodorBad(String s) {
		for(int i=0;i<s.length()-3;i++) {
			if(!isVouwl(s.charAt(i)) && !isVouwl(s.charAt(i+1)) && 
					!isVouwl(s.charAt(i+2)) && !isVouwl(s.charAt(i+3)))
			
				return 0;
		}
		for(int i=0;i<s.length()-4;i++) {
			if(isVouwl(s.charAt(i)) && isVouwl(s.charAt(i+1)) && 
					isVouwl(s.charAt(i+2)) && isVouwl(s.charAt(i+3)) && isVouwl(s.charAt(i+4)) && isVouwl(s.charAt(i+5)))
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		String s="ae??";
		
		System.out.println(isGoodorBad(s));

	}

}
