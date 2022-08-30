package MyPackage3;
 

class Questions{
	static void que1(int num) {
		if(num>0) {
			System.out.println("Positive");
		}else if(num<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
	}

	void que2(double a,double b,double c) {
		double formula1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
		double formula2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println("Roots are: "+formula1+" "+formula2);
	}
	
	void que3(int num1,int num2,int num3) {
		int result = num1>num2 && num1>num3?num1:num2>num3?num2:num3;
		System.out.println("Greates num is: "+ result);
	}
	
	void que4(int n) {
		switch(n){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Enter valid num of week!!");
				break;
		}
	}
	
	boolean que5(double d1,double d2) {
		d1 = Math.round(d1*1000);
		d1 /= 1000;
		d2 = Math.round(d2*1000);
		d2 /= 1000;
		if(d1 == d2) {
			return true;
		}else {
		return false;
	}
	}
	void que6(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U') {
			System.out.println("Vowel");
		}else {
		System.out.println("Consonant");
	}
	}
	
	 void que7(int year) {
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
	
	 void que8() {
		int n = 1;
		 while(n<=10) {
			 System.out.println(n);
			 n++;
		 }
}
	 
	 void que9(int n) {
		 int sum = 0;
		 for(int i = 1;i <= n;i++) {
			 sum += i;
		 }
		 System.out.println(sum);
	 }
	 
	 void que10(int n) {
		 for(int i = 1;i <= n;i++) {
			 int res = i;
			 System.out.println(res*res*res);
		 }
	 }
}
public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Questions q = new Questions();
		Questions.que1(25);
		q.que2(1, 5, 2);
		q.que3(23,25,24);
		q.que4(5);
		System.out.println(q.que5(2.543,2.542));
		q.que6('O');
		q.que7(2016);
		q.que8();
		q.que9(7);
		q.que10(4);
	}

}
