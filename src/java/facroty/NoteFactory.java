package com.wxp.dp.facroty;

public class NoteFactory implements INoteFactory {

	@Override
	public INote createNote() {
		
		Quadrant quadrant = new Quadrant("HELLOWORLD");
		INote birdNote = new Note(1,quadrant);
		
		return birdNote;
	}

}
