package MyPackage3;
import java.util.*;

class Programs{

	public void smallestNum(int n1, int n2,int n3) {
		int result = n1<n2 && n1<n3 ? n1:n2<n3 ? n2:n3;
		System.out.println("Smallest number is: "+result);
	}
	public void avgOfThree(int n1,int n2,int n3) {
		System.out.println("Avg of the numbers is: "+ (n1+n2+n3)/3);
	}
	public void midEle(String str) {
		int mid = str.length()/2;
		System.out.println("Mid ele is: "+ str.charAt(mid));
	}
	public void countAllWords(String str) {
		int count = 0;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Total words: "+ (count+1));
	}
	public void sumOfDigits(int digit) {
		int sum = 0;
		while(digit>0) {
			int rem = digit%10;
			sum = sum + rem;
			digit /= 10;
		}
		System.out.println("Sum of Digits are: "+sum);
	}
	public void leapYearCheck(int year) {
		boolean check = false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					check = true;
				else
					check = false;
			}
			else {
				check = true;
			}
	
	}
		else {
			check = false;
		}
		System.out.println(check);
	}
	public void areaOfTri(double base,double height) {
		System.out.println("Area of Triangle: "+ (0.5*base*height));
	}
	public void areaOfPent(double peri, double apo) {
		float area = (float)(peri*apo)/2;
		System.out.println("Area of pentagon: "+area);
	}
}


public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs p = new Programs();
		p.smallestNum(120,173,116);
		p.avgOfThree(25, 45, 65);
		p.midEle("350");
		p.countAllWords("The quick brown fox jumps over the lazy dog.");
		p.sumOfDigits(25131);
		p.leapYearCheck(1908);
		p.areaOfTri(9.234, 10);
		p.areaOfPent(23.21, 45.11);

	}

}
