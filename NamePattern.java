import java.util.Scanner;
class NamePattern
{
	public static void A(int n)
	{
		System.out.println("\n");

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void B(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || i==(n/2)+1 || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void C(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void D(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void E(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || i==(n/2)+1 || j==1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void F(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 | i==(n/2)+1 || j==1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void G(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || i==(n/2)+1 && (i+j)>n || j==1 || j==n && i>=(n/2)+1 )
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void H(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==(n/2)+1 || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void I(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==(n/2)+1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void J(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1||j==(n/2)+1 || i==n && j<=(n/2)+1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void K(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j<=(n/2)+1 && i==(n/2)+1 || j==1 || i<=(n/2)+1 && j==(n-i+1) || i>=(n/2)+1 && i==j && j==i )
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void L(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==n || j==1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}											public static void M(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j== (n/2)+1 && i==(n/2)+1 || j==1 || j==n || (i+j)>=2 && i<(n/2)+1 && (i+j)%2==0 && i==(1*j)&& j==(i*1) || j==(n-i+1) && i>1 && i<(n/2)+1)
				{
				System.out.print("* ");
}
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void N(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1 || j==n || i==j && j==i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void O(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void P(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n && i<=(n/2)+1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void Q(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n || i>=(n/2)+1 && i==j && j==i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void R(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n && i<=(n/2)+1
|| i>=(n/2)+1 && i==j && j==i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void S(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || i==(n/2)+1 || j==1 && i<=(n/2)+1 || j==n &&i>=(n/2)+1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void T(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || j==(n/2)+1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void U(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==n || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void V(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=(n/2)+2; i++)
		{
			for(int j=1; j<=(n/2)+2; j++)
			{
				if(i==j && j==i )
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			for(int k=1; k<=(n/2)-i+1; k++)
			{
				System.out.print("  ");
			}
			for(int l=1; l<=n-3; l++)
			{
				if(l==1 && i<n-1)
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	public static void W(int n)
	{	
		System.out.println("\n");
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n; j++)
			{
				if(j== (n/2)+1 && i==(n/2)+1 || j==1 || j==n || (i+j)>=2 && i<(n/2)+1 && (i+j)%2==0 && i==(1*j)&& j==(i*1) || j==(n-i+1) && i>1 && i<(n/2)+1)
				{
				System.out.print("* ");
}
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}

	}											public static void X(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j || j==i || j==(n-i+1))
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void Y(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j && j==i &&i<=(n/2)+1 || j==(n-i+1))
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void Z(int n)
	{	
		System.out.println("\n");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==(n-i+1))
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}			
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name: ");
		String name = sc.nextLine();
		name=name.toUpperCase();
		System.out.print("enter size: ");
		int n = sc.nextInt();
		int c;
		for(int i=0; i<=name.length()-1; i++)
		{
			c = (int)name.charAt(i);
			switch(c)
			{
				case 65 : A(n);
					 break;
				case 66 : B(n);
					 break;
				case 67 : C(n);
					 break;

				case 68 : D(n);
					 break;

				case 69 : E(n);
					 break;

				case 70 : F(n);
					 break;

				case 71 : G(n);
					 break;

				case 72 : H(n);
					 break;

				case 73 : I(n);
					 break;

				case 74 : J(n);
					 break;

				case 75 : K(n);
					 break;

				case 76 : L(n);
					 break;

				case 77 : M(n);
					 break;

				case 78 : N(n);
					 break;

				case 79 : O(n);
					 break;

				case 80 : P(n);
					 break;

				case 81 : Q(n);
					 break;
				case 82 : R(n);
					 break;
				case 83 : S(n);
					 break;
				case 84 : T(n);
					 break;
				case 85 : U(n);
					 break;
				case 86 : V(n);
					 break;
				case 87 : W(n);
					 break;
				case 88 : X(n);
					 break;
				case 89 : Y(n);
					 break;
				case 90 : Z(n);
					 break;


			}
		}
	}
}
		