package arithmeticOperation;

import java.util.*;

public class matrixMul {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("input the row size:");
	int r=input.nextInt();
	System.out.println("input the col size:");
	int c=input.nextInt();
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];
	int d[][]=new int[r][c];
	System.out.println("input the elements of matrix 1");
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			a[i][j]=input.nextInt();
		}
	}
	System.out.println("input the elements of matrix 2");
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			b[i][j]=input.nextInt();
		}
	}
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			for(int k=0;k<r;k++){
				d[i][j]=a[i][k]*b[k][j];
			}
		}
	}
	System.out.println("output is"); 
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			System.out.print(d[i][j]+ "\t");
	}
		System.out.println();
	}
	}
}

