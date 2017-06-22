package io.robusta.java.classic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

	int[] buildArray(int a, int b, int c) {
		int result[] = { a, b, c };

		return result;
	}

	boolean equality(int[] array1, int[] array2) {
		boolean b = true;
		if (array1.length != array2.length){
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				b = false;

			} else {
				b = true;
				return true;
			}

		}
		return b;
	}

	String asString(int[] numbers) {
		String result = new String();
		for(int i=0; i< numbers.length; i++){
			result = "" + numbers[i];
			System.out.println(result);
		}
		
		return result;
	}

	String asStringJoin(int[] numbers) {
		return null;
	}

	String asString(String[] strings) {
		return null;
	}

	String asString(Card[] cards) {
		return null;
	}

}
