package com.test;

import java.lang.reflect.Field;

import com.payment.UPI;
import com.service.BillCollector;

public class Test {
	public static void main(String[] args) throws Exception {
          Class<?> clz = Class.forName("com.service.BillCollector");
          Object obj = clz.newInstance();
          BillCollector bc=(BillCollector)obj;
          Field f = clz.getDeclaredField("p");
          f.setAccessible(true);
          f.set(bc, new UPI());
          bc.payment(1500.00);
          
	}
}
