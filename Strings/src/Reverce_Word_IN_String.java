
public class Reverce_Word_IN_String {
	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";

		String rev = "";
		String a[] = str.split("\\.");
		int i = 0;

		for (i = a.length - 1; i > 0; i--) {
			rev = rev + a[i] + ".";

		}

		rev = rev + a[i];
		System.out.println(rev);
	}
}
