package com.BikkadIT;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Shop shop = context.getBean("shop",Shop.class);
		System.out.println(shop);
		
		System.out.println("************List*****************");
		
		List<String> books = shop.getBooks();
		System.out.println(books);
		Iterator<String> iterator = books.iterator();
		System.out.println("by using itretor");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("by using foreach loop");
		for(String b : books) {
			System.out.println(b);
			
		}
		
		System.out.println("*****************Set****************");
		
		Set<String> mobiles = shop.getMobiles();
		System.out.println(mobiles);
		Iterator<String> iterator2 = mobiles.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("by using for each loop");
		
		for(String m : mobiles) {
			System.out.println(m);
		}
		
		
		System.out.println("***************Map*************");
		
		Map<String,String> pens = shop.getPens();
		System.out.println(pens);
		
		Set<String> keySet = pens.keySet();
		Iterator<String> iterator3 = keySet.iterator();
		
		while(iterator3.hasNext()) {
			String key = iterator3.next();
			String value = pens.get(key);
			System.out.println(key +" "+value);
		}
		
	
		
		
		
		
		
	}

}
