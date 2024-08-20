package task_on_collection;
import java.util.*;
//class Parkings
//{
//	String name;
//	Long number;
//	String vehiclenumber[]=new String[15];
//	
//	
//	Parkings b1[]=new Parkings[15];
//	Parkings b2[]=new Parkings[15];
//	public void allocate(String name,Long number,String vehicle[])
//	{
//		b1.add()
//	}
//	
//}


class SloatAlocation
{
	int totalbikeslot=15;
	int totalcarslot=15;
	int position1=0;
	int position2=0;
	String bikeslot[]=new String[totalbikeslot];
	String carsloat[]=new String[totalcarslot];
	
	Scanner sc=new Scanner(System.in);
	public void Allocation()
	{
		String continuee;
		do {
//			System.out.println("Enter your name :-");
//			String name=sc.nextLine();
//			
//			System.out.println("Enter Your Mobile number :-");
//			Long number=sc.nextLong();
//		
			System.out.println("Which Type Of vehicle do you have  \n\t\t1) Bike\n\t\t2) Cars");
			int choice=sc.nextInt();
		
		
			if(choice == 1 && totalbikeslot>0)
			{
				System.out.println("How much Bike do you Wnats to allocate parking :- ");
				int noofbikes=sc.nextInt();
				if(totalbikeslot-noofbikes>=0)
				{
					System.out.println("Sloat alocated");
					for(int i=0;i<noofbikes;i++)
					{
						bikeslot[position1++]="b"+i;
					}
				}
				
				
//				String bikenumber[]=new String[noofbikes];				
//				for(int i=0;i<noofbikes;i++)
//				{
//					System.out.println("Enter The Bike Number for bike "+i+":- ");
//					bikenumber[i]=sc.nextLine();
//				}
				
				
//				allocate(name,number,bikenumber);
			}
			
			
			else if(choice == 2)
			{
				System.out.println("How much Cars do you wants to allocate parking :- ");
				int noofcars=sc.nextInt();
				totalcarslot -=noofcars;
				
//				String carnumber[]=new String[noofcars];
//				for(int i=0;i<noofcars;i++)
//				{
//					System.out.println("Enter The Bike Number for car "+i+":- ");
//					carnumber[i]=sc.nextLine();
//				}
//				allocate(name,number,carnumber);
			}
			
			
			else
			{
				System.err.println("Wrongchoice .........!!!!!!!!!");
			}
			
			
			System.out.println("Do you have more vehicles -------(y/n)");
			continuee=sc.nextLine();
		
		}while(continuee == "y");
	}
}
public class ParkingSlot {
	public static void main(String[] args) {
		SloatAlocation s1=new SloatAlocation();
		s1.Allocation();
	}
}
