package org.midas.java8.lambda;

import java.util.Comparator;

public class ComparatorLambda implements Comparator<SmartPhoneBean> {

	@Override
	public int compare(SmartPhoneBean o1, SmartPhoneBean o2) {

		return o1.getName().compareTo(o2.getName());
	}
	
	

}
