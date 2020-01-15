package com.javaquake.app.environment;

import static org.junit.Assert.*;

import org.junit.Test;

public class screenTest {

	@Test
	public void testScreenWidth() {
		ScreenDesktop testScreen = new ScreenDesktop();
		int height = testScreen.GetScreenWorkingHeight(); 
		int width  = testScreen.GetScreenWorkingWidth(); 
		String out = String.format("Height = %d \nWidth = %d", height, width);
		System.out.println(out);
		
		
	}

}
