package org.Frameworkday1;



import java.util.List;

import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)

@SuiteClasses({Frameworkday11JunitSuite.class,Frameworkday10JunitAssert.class, Frameworkday10Junit.class })
//suite ---> collection of classes
public class SuiteLevelExecution {
	
	//If the main method is given in Suite, then run as java application or else run as junit application
public static void main(String[] args) {
	Result runClasses = JUnitCore.runClasses(SuiteLevelExecution.class);
	
	int runCount = runClasses.getRunCount();
	System.out.println("Total Method Executing Count :" +runCount);
	
	int ignoreCount = runClasses.getIgnoreCount();
	System.out.println("Total Method Ignored:" + ignoreCount);
	
	int failureCount = runClasses.getFailureCount();
	System.out.println("Total Failure Count:" +failureCount);
	
	List<Failure> failures = runClasses.getFailures();
	for(int i=0;i<failures.size();i++) {
		
		String string = failures.get(i).toString();
		System.out.println("Failure Methods NAme:" +string);
	}
	
	
	
	
	
}
	
	

}
