
public class StrBuilder {

	public static void main(String[] args) {
		
		String s = "I Love Java";
		String s1 = new String("I Love JAva");
		StringBuilder sb = new StringBuilder("this is java method");
		System.out.println(sb.append('c'));
		System.out.println(sb.insert(5, 'x'));
		System.out.println(sb.reverse());
		System.out.println(sb.hashCode());
		System.out.println(sb.delete(4, 10));
		System.out.println(sb.toString());
	}

}
