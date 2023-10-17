import org.testng.annotations.Test;

public class TestNGExamples {
	
	@Test(priority=2, description = "this is regaring shopping")
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority=3, invocationCount=3)
	public void abc() {
		System.out.println("abc");
	}
	@Test(priority=1, timeOut=2000)
	public void wwe() throws InterruptedException {
		System.out.println("WWE");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void CheckingFollowers() {
		
	}

}
