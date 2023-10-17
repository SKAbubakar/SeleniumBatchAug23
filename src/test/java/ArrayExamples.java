

public class ArrayExamples {

	public void method1() {        // 1 Unit
		int a[]=new int[5];    // dataType variableName[] = new dataType[size];
		a[0] = 5;
		a[1] = 4;
		a[2] = 6;
		a[3] = 77;
		a[4] = 65;
		System.out.println(a[4]);
		int x[] = {4,5,7,8,11,45};
		System.out.println(x[3]);
		int[] arr={33,3,4,5}; 
		String[] str = {"abc", "def", "ghi", "1212"};
		System.out.println(str[3]);
		System.out.println(str.length);
		String[] str1 = str.clone();
		System.out.println(str1);
		
	}

}
