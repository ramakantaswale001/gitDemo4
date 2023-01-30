package com.BikkadIT;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shop {
	
	private int sid;
	private List<String> books;
	private Set<String> mobiles;
	private Map<String,String> pens;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, String> getPens() {
		return pens;
	}
	public void setPens(Map<String, String> pens) {
		this.pens = pens;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", books=" + books + ", mobiles=" + mobiles + ", pens=" + pens + "]";
	}
	

}
