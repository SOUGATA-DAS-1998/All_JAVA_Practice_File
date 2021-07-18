import java.util.Stack;

public class Parenthesis_Check {

	static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
                continue;
            }
            
            if(s.isEmpty()){
                return false;
            }
            
            if(c == ')'){
                if(s.peek() == '(' ){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
             if(c == '}'){
                if(s.peek() == '{' ){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
             if(c == ']'){
                if(s.peek() == '[' ){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
        }
        if( !s.isEmpty() ){
            return false; 
        }
        return true;
    }

	
	public static void main(String[] args) {
		String str="{([])}{}";
		
		boolean a=ispar(str);
		
		if(a) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}

	}

}
