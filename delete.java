package key_valuedb;

import java.util.Scanner;

public class delete extends keyvalued2b {
	Thread d;
	delete() throws InterruptedException
	 {  
		d = new Thread(this);
		d.start();
		d.join();
	 }
	public void run()
    { try { 
	 Scanner sc= new Scanner(System.in);
   	 System.out.print("Enter the key to delete:");
   	 String key;
   	 key=sc.nextLine();
   	 Thread.sleep(1000);
	 
   	 if(db.containsKey(key))
   	 {   db.get(key).set(1, 0);
   	     db.remove(key);
   		 System.out.println("---->The key has been deleted successfully<----");
   	 }
   	 else
   	 {
   		 System.out.println("---->The key your are looking for does not exist<----");
   	 }
    }
   	catch (InterruptedException e) {
		e.printStackTrace();
	}
   	
   	 
    }

}
