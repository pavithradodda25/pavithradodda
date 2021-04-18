
public class FabbonachiTenTerms {

	public static void main(String[] args) {
		
		int i, c=0,a=0,b=1,n=10;
        System.out.println("Fibonacci series for first "+n+" terms");
        for(i=0;i<n;i++)
        {
           System.out.print(c+" ");
           a=b;
           b=c;
           c=a+b;
        }

	}

}
