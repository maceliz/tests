package com.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ForLoop {

	static String findNumber(int[] arr, int k) {
		String result = "NO";
		for(int x=0;x<arr.length;x++){
			if(k==arr[x]){
				result = "YES";
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		final  String regularExpression = "^([a-z]+)@([a-z]+).([a-z])$";

	}
}
