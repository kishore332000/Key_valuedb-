package key_valuedb;

import java.util.ArrayList;
public class create extends keyvalued2b {
	
	 Thread t;
	 int timetolive;
	 int value;
	 String key;
	 create()
	 {
		 //empty constructor
	 }
	 create(String key,int value,int timetolive) throws InterruptedException
	 {  this.timetolive=timetolive;
	    this.value=value;
	    this.key=key;
		t=new Thread(this);
		t.start();
	 }
     public void run()
     {  try{
    	if(db.containsKey(key))
	    {
	        System.out.println("---->Key already exist<----");
	    }
	    else if(key.length()>32)
	    {
	        System.out.println("---->Key range limit exceeds<----");
	    }
	    else if(db.size()>1024*1024*1024 && value>16*1024*1024)
	    {
	        System.out.println("---->Memory Limit Exceeded<----");
	    }
	    else if(checkformat(key))
	    {
	    	System.out.println("---->key format wrong<----");
	    }
	    else
	    {
	    	     ArrayList<Integer> list=new ArrayList<Integer>();
		         list.add(value);
		         list.add(timetolive);
		         db.put(key,list);
				 Thread.sleep(timetolive);
	     }
      }
     catch(InterruptedException e)
	 {
		 System.out.print("interupts");
	 }
     }
     public boolean checkformat(String key)
     {  int flag=1;
    	 for(char i:key.toCharArray())
    	 {
    		 if(Character.isDigit(i))
    		 {
    			 flag=0;
    			 break;
    		 }
    	 }
    	 if(flag==1)
    	 {return false;}
    	 else
    	 {return true;}
     }
        
}

