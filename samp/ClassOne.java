package org.samp;

import java.util.Iterator;

public class ClassOne {
public static void main(String[] args) {
	int [] ar= {6,10,12,22,4};
	int temp ;
	for (int i = 0; i < ar.length; i++) {
		for (int j = i+1; j < ar.length; j++) {
			if (ar[i]>ar[j]) {
				temp = ar[i];
				ar[i] =ar[j];
				ar[j]=temp;
			}
		}
	}
	int  large=ar.length;
	System.out.println(ar[large-1]);
}
}
