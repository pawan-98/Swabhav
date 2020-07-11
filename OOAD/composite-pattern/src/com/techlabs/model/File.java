package com.techlabs.model;

public class File implements IDiskItem{
	private String name;
	private int size;
	private String extension;
	
	public File(String name,int size,String extension) {
		this.name= name;
		this.size= size;
		this.extension=extension;
	}

	@Override
	public String show(int count) {
		
		return "|->"+this.name+this.extension+"("+this.size+")";
	}

}
