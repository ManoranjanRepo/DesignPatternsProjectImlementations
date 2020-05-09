package com.manu.patterns.singleton;

public class Test {

	public static void main(String[] args) {
      DateUtil dateUtil1 =DateUtil.getInsance();
      DateUtil dateUtil2 =DateUtil.getInsance();
      DateUtil dateUtil3 =DateUtil.getInsance();
      System.out.println(dateUtil1==dateUtil2);
      System.out.println(dateUtil2=dateUtil1);
	}

}
