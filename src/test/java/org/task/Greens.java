package org.task;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class Greens {
@BeforeClass
public static void beforeClass() {
System.out.println("beforeclass");
}
@AfterClass
public static void afterclass() {
System.out.println("afterclass");
}
@Before
public void beforeclass() {
System.out.println("before");
}
@After
public void aftermethod() {
System.out.println("after Method");
}

@Test
public void test1() {
System.out.println("test2");
}
}
