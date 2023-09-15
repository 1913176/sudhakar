package taxi;
import java.util.Scanner;
import java.util.HashMap;

public class Begin {


	static HashMap<Integer,String> taxies;
	static HashMap<String,Integer> area;
	static HashMap<Integer,String> haha;
	static int id=1;
	static String order="";
	static int starttime=6;
	static int endtime=18;
	static int oneamount=50;
	static int onetime=1;
	static int updateddistance=0;
	static int updateddis2=0;
	static int updateddis3=0;
	static int updateddis4=0;
	static int sum=0;
	static int updatedtime=0;
	static int updatedt2=0;
	static int updatedt3=0;
	static int updatedt4=0;
    static int updatedamo2=0;
    static int updatedamo3=0;
    static int updatedamo4=0;
    static int updatedamount=0;
    static int thistime=0;
    static int thistime2=0;
    static int thistime3=0;
    static int thistime4=0;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		taxies=new HashMap<>();
		taxies.put(1,"Taxi-1");
		taxies.put(2,"Taxi-2");
		taxies.put(3,"Taxi-3");
		taxies.put(4,"Taxi-4");
		
		    haha=new HashMap<>();
		    haha.put(1,"Erode");
		    haha.put(2,"Lakshmi Nagar");
		    haha.put(3,"Bhavani");
		    haha.put(4,"Chittar");
		    haha.put(5,"Ammapet");
		    haha.put(6,"Nerinjipet");
		    haha.put(7,"Mettur");
		
		
	    area=new HashMap<>();
	    area.put("Erode",1);
	    area.put("Lakshmi Nagar",2);
	    area.put("Bhavani",3);
	    area.put("Chittar",4);
	    area.put("Ammapet",5);
	    area.put("Nerinjipet",6);
	    area.put("Mettur",7);
	    System.out.println("Enter 1 to book taxi");
		int go=sc.nextInt();
	    while(true) {
		if(go==1) {
			System.out.println("STARTED BOOKING");
			sc.nextLine();
			System.out.println("Enter the pickup area :");
		    String sp=sc.nextLine();
			System.out.println("Enter the drop area :");
			String dp=sc.nextLine();
			System.out.println("Enter the availablity time :");
			int curtime=sc.nextInt();
			if(area.containsKey(sp) && area.containsKey(dp) && curtime>=starttime && curtime<=endtime) {
			booking(sp,dp,curtime);
			}else {
				System.out.println("Please checkout details,our taxies are unavailable at your convinience");
			}
			break;
		}
		else {
			System.out.println("Entry is invalid!!! Please enter a valid number to book taxi");
			int re=sc.nextInt();
			go=re;	
		}  
	}
	     
	}
	
	
	
	   static void booking(String sp,String dp,int curtime) {
		   
		  Scanner s=new Scanner(System.in);
		  if(id>1) {
			  order=check(sp,dp,curtime);
		  }else {
		  order=taxies.get(id);
		  }
		  if(order==null) {
			  System.out.println("ALL THE TAXIES ARE BOOKED SORRY FOR YOUR INCOVINIENCE");
			  System.exit(0);
		  }
		  System.out.println("YOUR TAXI IS BOOKED SUCESSFULLY"); 
		  System.out.println("HERE YOUR DETAILS :"+order+" IS BOOKED FROM "+sp+" TO "+dp+".IT WILL BE AVAILABLE AT "+curtime);
		  System.out.println("THANK YOU!!!");
		  updatedetails(order,sp,dp,curtime);
           id++;
		  System.out.println("ENTER 1 TO BOOK ANATHOR TAXI ELSE ENTER 0");
		  int again=s.nextInt();
			  if(again==1) {
				     main(null);
			  }else {
				  System.out.println("THANK YOU FOR VISITING US!!! GOOD LUCK");
				  System.exit(0);
			  }
		  }
	   
	   
	   static void updatedetails(String order,String sp,String dp,int curtime) {
		   
		   
		   
		   switch(order) {
		   
		   case "Taxi-1":
			   updatedtime=calculatetime(sp,dp,curtime);
			   thistime=curtime;
			   thistime+=updatedtime;
			   updateddistance+=updatedtime;
			   updatedamount=updateddistance*oneamount;
			   System.out.println("the updated data are "+thistime+" "+updateddistance+" "+updatedamount);
			   break;
		   
		   case "Taxi-2":
			   updatedt2=calculatetime(sp,dp,curtime);
			   thistime2=curtime;
			   thistime2+=updatedt2;
			   updateddis2+=updatedt2;
			   updatedamo2=updateddis2*oneamount;
			   System.out.println("the updated data are "+thistime2+" "+updateddis2+" "+updatedamo2);
		       break;
		   
		   case "Taxi-3":
			   updatedt3=calculatetime(sp,dp,curtime);
			   thistime3=curtime;
			   thistime3+=updatedt3;
			   updateddis3+=updatedt3;
			   updatedamo3=updateddis3*oneamount;
			   System.out.println("the updated data are "+thistime3+" "+updateddis3+" "+updatedamo3);
			   break;
			   
		   case "Taxi-4":
			   updatedt4=calculatetime(sp,dp,curtime);
			   thistime4=curtime;
			   thistime4+=updatedt4;
			   updateddis4+=updatedt4;
			   updatedamo4=updateddis4*oneamount;
			   System.out.println("the updated data are "+thistime4+" "+updateddis4+" "+updatedamo4);
		   }
		   
		   
	   }
	   
	  static int calculatetime(String sp,String dp,int curtime) {
		  
		  
		   sum=Math.abs(area.get(sp)-area.get(dp));
		   return sum;
	   }
	  
	  static String check(String sp,String dp,int curtime){
		 

			 if(curtime >=thistime && sp.equals( haha.get(updateddistance+1))) {
				 order=taxies.get(1);

				  
		     }
			 else if(curtime >=thistime2 && sp.equals(haha.get(updateddis2+1))) {
				 order=taxies.get(2);
	
			 }
			 else if(curtime >=thistime3 && sp.equals(haha.get(updateddis3+1))) {
				 order=taxies.get(3);

			 }
			 else if(curtime >=thistime4 && sp.equals(haha.get(updateddis4+1))) {
				 order=taxies.get(4);
				 
			 }else {
				 order=taxies.get(id);
			 }
		  
		  return order;
		  
		  
		  
	  }
}

