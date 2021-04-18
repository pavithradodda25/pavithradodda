
public class FabbonachiOdd {

	public static void main(String[] args) {
		
		    int length=100;
	        int first=0,second=1,iter=0,next;
	        if(length<=0)
	        System.out.println("The Input provided should always be greater than zero");
	        if(length==1)
	        System.out.println(first);
	        else
	        {
	            while(iter<length)
	            {
	                next=first+second;
	                first=second;
	                second=next;
	                if(next%2!=0)
	                {
	                    System.out.println(next);
	                    iter++;
	                }
	            }
	        }
	}

}
