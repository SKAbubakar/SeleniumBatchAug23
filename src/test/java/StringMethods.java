
public class StringMethods {

	public static void main(String[] args) {
	String s = "Selenium";
	System.out.println(s.toUpperCase());
	System.out.println(new String("Selenium").toLowerCase());
	System.out.println(new String("   Program   ").trim());
	System.out.println(new String("java ").length());
	System.out.println("First"+ "Second");
	String s1 = "This is a java selenium class java";
	System.out.println(s1.substring(3,10));
	System.out.println(s1.substring(3));
	System.out.println(s1.isEmpty());
	String s2 = "   t    ";
	System.out.println(s2.isBlank());
	System.out.println(s1.contains("java"));
	s1 = s1.replace('j', 'Y');
	System.out.println(s1);
	System.out.println(s1.indexOf('s', 5));
	System.out.println("sample" == "sample");
	String s3 = "test";
	System.out.println(s3.equalsIgnoreCase("Test"));
	String str1 = "xyz";
	String str2 = "xyZ";
	System.out.println(str1==str2); //String interning 
	int a = 1500;
	
	String s9 = String.valueOf(a);
	System.out.println(s9);
	
	
	
	}

}
