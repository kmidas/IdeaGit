package org.midas.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest {
	
	public static void main(String args[]){
		
		SmartPhoneBean androidLG = new SmartPhoneBean(); 
		SmartPhoneBean testApple = new SmartPhoneBean(); 
		
		androidLG.setName("Droiden"); 
		testApple.setName("FoxConn");
		
		List<SmartPhoneBean> phoneList = new ArrayList<>();
		phoneList.add(testApple);
		phoneList.add(androidLG);
		
		System.out.println("Before sorting: " + phoneList.get(0).getName() + "," + phoneList.get(1).getName());
		
		Collections.sort(phoneList,(p1,p2)->p1.getName().compareTo(p2.getName()));
		
		System.out.println("After sorting : " + phoneList.get(0).getName() + "," + phoneList.get(1).getName());
		
		phoneList.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
		
	}
	

}
