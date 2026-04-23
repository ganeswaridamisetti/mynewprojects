package com.fundment.methods;

import java.util.Scanner;

public class Assignment {
	static int marksofstudents(int telugu, int english, int maths, int science, int social) {

		return telugu + english + maths + science + social;
	}
		static double marksofstudent(int total) {
			
		double percantage = total / 5.0;
		return percantage;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the telugu marks");
        int telugu=sc.nextInt();
        System.out.println("enter the english marks");
        int english=sc.nextInt();
        System.out.println("enter the maths marks");
        int maths=sc.nextInt();
        System.out.println("enter the science marks");
        int science=sc.nextInt();
        System.out.println("enter the social marks");
        int social=sc.nextInt();
        int tot =marksofstudents(telugu,english,maths,science,social);
        double per = marksofstudent(tot);
        System.out.println("total marks:"+tot);
        System.out.println("total percentage is"+per+"%");
        
	}

}
