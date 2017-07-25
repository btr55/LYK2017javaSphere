package tr.org.linux.kamp;

import java.util.Scanner;

public class sprehe {
	public static void main(String[] args) {
		System.out.println("Yarıçapı giriniz:");
		Scanner input= new Scanner(System.in);
		double r=input.nextDouble();
		System.out.println("Hacim:"+hacimBul(r));
		
	}
	public static double hacimBul(double r) {
		double hacim=4.0/3.0*Math.PI*Math.pow(r, 3);
		return hacim;
	}
}


