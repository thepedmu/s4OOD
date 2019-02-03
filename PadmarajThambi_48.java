import java.util.Scanner;

public class PadmarajThambi_48{
	
    public static void main(String args[]) 
    { 
    	int i, j,s,h, k = 0;
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter Size of Diamond(greater than 2):");
    	int n=in.nextInt();
    	s=n;
        for (i = 1; i <= n; i++) 
           { 
                 for (j = 1; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
            while (k != (2 * i - 1)) 
            { 
                if (k == 0||k == 1 || k == (n>4?2:0)|| k==(s>8?3:0) || k==(s>8?2*i-5:0) || k == 2*i-3 || k == 2 * i - 2 || k==(n>4?2*i-4:0))                 	
                    System.out.print("1"); 
                else
                    System.out.print(" "); 
                k++; 
            } 
            k = 0;   
            System.out.println(); 
        }   
        n--;
        for (i = n; i >= 1; i--)
        {      
            for (j = 0; j <= n - i; j++)  
                System.out.print(" "); 
            k = 0; 
            while (k != (2 * i - 1)) 
            { 
            	if(k == 0||k == 1 || k==(s>4?2:0) || k==(s>8?3:0) || k==(s>8?2*i-5:0) || k == 2*i-3 || k == 2 * i - 2 || k== (s>4?2*i-4:0))
            			
                    System.out.print("1"); 
                else
                    System.out.print(" "); 
                k++; 
            } 
            System.out.println(); 
        } 
    }
    
} 