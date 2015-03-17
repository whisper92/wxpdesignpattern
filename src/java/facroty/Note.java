package com.wxp.dp.facroty;

public class Note implements INote {

	int id;
	Quadrant quadrant;
	public Note(int id,Quadrant quadrant){
		this.id = id;
		this.quadrant = quadrant;
	}
	@Override
	public void showNote() {
		System.out.println("笔记:"+id+" ; Quadrant:"+quadrant.getQuadrant());	
	}
	

}
