package fr.Maxime3399.MaxParticles.utils;

import java.util.Random;

public class RandomUtils {
	
	public static int randomColor(){
		
		int result = 0;
		
		Random r = new Random();
		result = r.nextInt(256);
		
		return result;
		
	}

}
