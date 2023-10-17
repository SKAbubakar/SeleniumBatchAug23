package MyPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreTests extends Annotation {

	@Test(groups = {"FunctionalTest"})
	public void test1() {
		System.out.println("Test1");
	}
	@Test(groups = {"FunctionalTest"})
	public void test2() {
		System.out.println("Test2");
	}
	@Test(groups = {"RegressionTest"})
	public void test3() {
		System.out.println("Test3");
	}
	@Test(groups= {"RegressionTest"})
	public void test4() {
		System.out.println("Test4");
	}
	
}
