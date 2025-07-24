package dayfour.secondassignment;

import dayfour.firstassingment.Base;

public class Executor {
	//Program to demonstrate accessing classes and methods of different package


	
		public static void main(String[] args) {
			// accessing different package class
			Base b1 = new Base();

			// private, default and protected members can't access

			/*
			 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
			 * b1.varProtected=31; b1.methodProtected();
			 */

			b1.defaultone();
			b1.pubnormal = 41;
			b1.publicone();
		}
	}
