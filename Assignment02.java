package MyPackage3;
import java.util.*;
import java.io.*;
class Programs02{
	void arraySort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
			}
		System.out.println("Array before sorting: "+ Arrays.toString(arr));
				for(int i=0;i<n-1;i++) {
			 int j = 0;
			while(j<n-1) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					j++;
				}
				j++;
			}
		}         
			System.out.println("Array after sorting: "+Arrays.toString(arr));
	}
	
	void avgArray() {
		int[] arr = new int[] {3,4,5,7,9};
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Avg is: "+ (float)sum/arr.length);
	
}
	
	void minMax() {
		int[] arr = new int[] {23,54,21,140,56};
		int min = arr[0];
		int max = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}if(arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("Smallest ele: "+ min+" Largest ele: "+ max);
	}
	
	void dupli() {
		int[] arr = new int[] {2,5,5,6,8,9,8,12,23,34,43,12,44,23};
		
		for(int i = 0;i < arr.length;i++) {
			int count = 0;
			for(int j = i;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void secLargest() {
		int[] arr = new int[] {23,14,54,45,16,55};
		int lar = arr[0];
		int secLar = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > lar) {
				lar = arr[i];
			}
		}
		System.out.println("Largest ele: "+ lar);
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > secLar && secLar < lar) {
				secLar = arr[i];
			}
		}
		System.out.println("Second largest: "+ secLar);
	}
}
public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs02 p = new Programs02();
		//p.arraySort();
		p.avgArray();
		p.minMax();
		p.dupli();
		p.secLargest();
	
	}

}
