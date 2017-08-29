package com.user;
import java.util.Random;
public class Advisor {
	String []arg=new String[5];
public Advisor(){
		arg[0]="Never Stop Fighting for What You Believe In!";
		arg[1]="Never Be Afraid to Speak Your Mind!";
		arg[2]="Forget About the Past!";
		arg[3]="The Only Person You Can Truly Trust Is Yourself!";
		arg[4]="Seize the Moment! Live Each Day as if It Were Your Last!";
		}
public void getAdvice(){
	Random random = new Random();
	String advice = arg[random.nextInt(arg.length)];
	System.out.println(advice);
	}
}
