package com.qualiprobdd.e2etests.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomValue {

	static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom rnd = new SecureRandom();

	public static String randomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
	
	public static int randomInt(int len) {
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 

		int randomNum = rand.nextInt(len);
		return randomNum;
	}

}
