package Arrays;

import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values: ");
		int arr[]=new int[5];
		int min,temp = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}}for(int i=0;i<arr.length-1;i++) {
			System.out.print(" "+arr[i]);
	}System.out.println(arr[arr.length-1]);
	}
}
