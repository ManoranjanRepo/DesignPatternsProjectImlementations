package com.manu.patterns.singleton;

public class DateUtil {
  private static DateUtil instance;
	private DateUtil() {
		
	}
	public static DateUtil getInsance() {
		if(instance==null) {
			instance=new DateUtil(); 
		}
		return instance;
	}
}
