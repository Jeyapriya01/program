import java.util.*;
class custumerID{
	public static void main(String[] args)	
	{		
	int n;	
	Scanner input =new Scanner(System.in);	
	System.out.println("total number of custumerID: ");	
	n= input.nextInt();		
	String[] arr= new String[n];
	System.out.println("enter the custumerID: ");	
	for(int i=0;i<n;i++)	
	{			
	arr[i]=input.next();	
	}		
	System.out.println("invalid custumerID's: ");	
	for(int i=0;i<n;i++)	
	{		
	if(arr[i].length()<6)	
	System.out.print(arr[i]+" ");	
	}	
	}
	}