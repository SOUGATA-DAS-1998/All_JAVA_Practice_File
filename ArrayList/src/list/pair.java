package list;

public class pair<T1 ,T2> {
	T1 x;
	T2 y;
	public  pair(T1 x,T2 y) {
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println(x +" "+y);
	}
}
