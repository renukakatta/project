import java.util.*;

public class matrixmul{

	public static void main(String[] arg) {
		int r1,r2,c1,c2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows in 1st matrix");
		r1=s.nextInt();
		System.out.println("enter numbr of columns in 1st matrix");
		c1=s.nextInt();
		System.out.println("enter number of rows in 2st matrix");
		r2=s.nextInt();
		System.out.println("enter number of columns in 2st matix");
		c2=s.nextInt();
		int [][]a=new int[r1][c1];
		int [][]b=new int [r2][c2];
		int [][]c=new int[r1][c2];
		if(r1==c2)
		{
			System.out.println("enter the matrix 1 values");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
			System.out.println("enter the matrix 2 values");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=s.nextInt();
				}
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					c[i][j]=0;
					for(int k=0;k<c1;k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}