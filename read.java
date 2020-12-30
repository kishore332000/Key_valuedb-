package key_valuedb;

import java.util.Scanner;

public class read extends keyvalued2b {
	Thread r;
	read() throws InterruptedException
	 {  
		r = new Thread(this);
		r.start();
		r.join();
	 }
     public void run()
     {  try {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the key to search: ");
    	 String key;
    	 key=sc.nextLine();
    	 Thread.sleep(1000);
    	 if(db.containsKey(key))
    	 {   
    		 if(db.get(key).get(1)>0) {
    		 System.out.println("json response:"+" "+key+":"+db.get(key).get(0));
    		 }
    		 else {
    			 System.out.println("---->The key has been expired<----");
    		 }
    	 }
    	 else {
    		 System.out.println("---->The key your looking for does not exist<----");
    	 }
    	 
     }
        catch (InterruptedException e) {
			e.printStackTrace();
		}
     }
}
