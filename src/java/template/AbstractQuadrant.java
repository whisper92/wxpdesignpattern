package com.wxp.dp.template;

public abstract class AbstractQuadrant {

	protected abstract void sortContent(int[] array);

	public void showContent(int[] array) {
		sortContent(array);
        for (int i = 0; i < array.length; i++){
            System.out.printf("%3s", array[i]);
        }

	}

}
