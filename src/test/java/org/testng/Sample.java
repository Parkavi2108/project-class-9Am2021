package org.testng;

import org.testng.annotations.Test;

public class Sample {
	
@Test(priority=5)
private void tc1() {
	System.out.println("Method 1");

}
@Test(priority=8)
private void tc2() {
	System.out.println("Method 2");

}
@Test(priority=5)
private void tc3() {
	System.out.println("Method 3");

}
}
