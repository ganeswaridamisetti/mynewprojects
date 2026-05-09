package com.operators;
//Assignment operates(+=,-=,*=,/=,%=)-->compound assignment operators
//=
public class Operator3 {
	
	public static void main(String[] args) {
		int result=0;
result = result+5;
System.out.println(result);//5
//Type mismatch: cannot convert from double to int
//result=result+5.5;
result=(int)(result+5.5);
System.out.println(result);//10
result+=5.5;
System.out.println(result);//15
//result=result-5.5;
//result=(int)(result-5.5);
//System.out.println(result);
result-=5.5;
System.out.println(result);//9
//result=result*5.5;
//result=(int)(result*5.5);
//System.out.println(result);
result*=5.5;
System.out.println(result);//49
//result=result+5.5;
//result=(int)(result/5.5);
//System.out.println(result);
result/=5.5;
System.out.println(result);//8
//result=result%5.5;
//result=(int)(result%5.5);
//System.out.println(result);
result%=5.5;
System.out.println(result);//2
	}

}
