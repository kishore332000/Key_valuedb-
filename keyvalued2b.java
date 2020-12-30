package key_valuedb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class keyvalued2b extends Thread{
	static HashMap <String,ArrayList<Integer>> db=new HashMap<String,ArrayList<Integer>>();
	public void getchoice() throws InterruptedException{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please choose the option to perform:");
	     System.out.println("Create--->1");
	     System.out.println("Read--->2");
	     System.out.println("Delete--->3");
	     int choise=sc.nextInt();
	     if(choise==1)
	     {
	        System.out.println("Please enter the key,value,timetolive:");
			System.out.println("enterKey:");
			sc.nextLine();
		    String key=sc.nextLine();
		    System.out.println("entervalueid:");
	        int value=sc.nextInt();
	        System.out.println("entertimetolive:");
	        int timetolive=sc.nextInt();
	        new create(key,value,timetolive*1000);
	      }
	     else if(choise ==2)
	     {   new read();
	     }
	     else if (choise==3)
	     {   new delete();
	     }
	     
	}
	
	public static void main(String args[]) throws InterruptedException
    {  keyvalued2b kv=new keyvalued2b();
		int n=1;
       Scanner sc=new Scanner(System.in);
       for(;n==1;)
       { 
         System.out.println("Do you want to continue......to keyvaluedb!!! (yes-1 no-0)");
        n=sc.nextInt();
        if(n==0)
        {break;}
       
        if(n==1) {kv.getchoice();}
         Thread.sleep(1000);
         
       }
       sc.close();
    }
}
