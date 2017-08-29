import java.util.Scanner;
public class StringOpertaion {
	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s=sc.next();
		System.out.println("Enter second String");
		String s1=sc.next();
		System.out.println("Length of string:"+s.length());
		System.out.println("Hashcode of string object:"+s.hashCode());
		System.out.println("First string is equal to second string:"+s.equals(s1));
		System.out.println("Replace a element from b in first string:"+s.replace("a","b"));
		System.out.println("trim first string:"+s.trim());
		System.out.println("Get substring from 2 index to 3 index first string:"+s.substring(2, 3));
		System.out.println("Concatinate first and second string:"+s.concat(s1));
		System.out.println("Get character from particular index:"+s.charAt(3));
		
		
	}

} 
