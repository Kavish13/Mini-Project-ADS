/*  VOTER  MANAGEMENT LIST*/

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Voter
{
	public String name;
	public int age;
	public String gender;
	public Voter()
	{
	}
	
	public Voter(String name, int age, String gender)
	{
		this.name= name;
		this.age= age;
		this.gender = gender;
	
	}
	
	@Override
	public String toString() {
		return( name+"\t"+age+"\t"+gender+"\n");
	}
      Voter []  addVoterList()
      {
        
		Voter v [] = new Voter[27];
		 v[0] = new Voter("Jethalal", 43, "M");
		 v[1] = new Voter("Champaklal", 72, "M");
		 v[2] = new Voter("Tipendra", 19, "M");
		 v[3] = new Voter("Dayaben", 38, "F");
		 v[4] = new Voter("Mehta Sahab", 40, "M");
		 v[5] = new Voter("Anjali Mehta", 35, "F");
		 v[6] = new Voter("Popatlal", 36, "M");
		 v[7] = new Voter("Krishnan Iyer", 33, "M");
		 v[8] = new Voter("Babita Iyer", 32, "F");
		 v[9] = new Voter("Aatmaram Bhide", 44, "M");
		 v[10] = new Voter("Madhavi Bhide", 41, "F");
		 v[11] = new Voter("Sonu Bhide", 20, "F");
		 v[12] = new Voter("Roshan Sodhi", 39, "M");
		 v[13] = new Voter("Roshan Kaur", 38, "F");
		 v[14] = new Voter("Kavish", 25, "M");
		 v[15] = new Voter("Gogi", 15, "M");
		 v[16] = new Voter("Hansraj Hathi", 44, "M");
		 v[17] = new Voter("Komal Hathi", 43, "F");
		 v[18] = new Voter("Goli", 21, "M");
		 v[19] = new Voter("Pinku", 22, "M");
		 v[20] = new Voter("Reeta Reporter", 29, "F");
		 v[21] = new Voter("Abdul", 35, "M");
		 v[22] = new Voter("Chalu Pandey", 46, "M");
		 v[23] = new Voter("Nattu Kaka", 63, "M");
		 v[24] = new Voter("Bagha", 30, "M");
		 v[25] = new Voter("Bawri", 31, "F");
		 v[26] = new Voter("Devendra", 24, "M");
         
		
		 return v;
		
	}

}


public class BubbleSort
{
	static int count;
	static int range1;
	static int mCount;
	static int fCount;
	
	static Voter[] bubbleSort(Voter arr[]) 
	{  
        int n = arr.length;  
        Voter temp = null;  
        
         for(int i=0; i < n-1; i++)
         {  
                 for(int j=0; j < (n-i-1); j++)
                 {  
                          if(arr[j].age > arr[j+1].age)
                          {  
                                 //swap elements  
                                 temp = arr[j];  
                                 arr[j] = arr[j+1];  
                                 arr[j+1] = temp;  
                         }  
                          
                          
                 
                 } 
                 if(arr[i].age>=18 && arr[i].age<=40)
                 {
               	  count++;
                 }
                 if(arr[i].age>=41 && arr[i].age<=75)
                 {
               	  range1++;
                 }
                 if(arr[i].gender=="M")
                 {
               	  mCount++;
                 }
                 if(arr[i].gender=="F")
                 {
               	  fCount++;
                 }
                 
         }
         //System.out.println("Voter between age 18 - 40 : "+count);
		return arr;  
  
    }
	
    public static void main(String[] args) {  
                
    	 Voter voter=new Voter();
    	 Voter arr[]=voter.addVoterList();
    	 Scanner sc=new Scanner(System.in);
    	 Voter sortedVoter [] = bubbleSort(arr);
                  
                boolean flag=true;
                //System.out.println(count);
               do {
            	   System.out.println("==========================================================");
            	   System.out.println("************************Features**************************");
            	   System.out.println("==========================================================");
                   System.out.println("1.Voter age between 18-40:\n2.Voter age between 41-75:\n3.Total numbers of Males\n4.Total number of Females\n5.Display Sorted Data\n6.Exit ");
                   System.out.println("Enter your choice");
           	 int choice =sc.nextInt();
           	 switch(choice)
           	 {
           	 case 1:
           	 {
           		 System.out.println("Total count of Voters Between age of 18-40 is: "+count);
           		 break;
           	 }
           	 case 2:
           	 {
           		 System.out.println(" Total count of Voters Between age of 41-75 is: "+range1);
           		 break;
           	 }
           	 case 3:
           	 {
           		 System.out.println(" Total count of Male Voters  is: "+mCount);
           		 break;
           	 }
           	 case 4:
           	 {
           		 System.out.println(" Total count of Female Voters  is: "+fCount);
           		 break;
           	 }
           	 case 5:
           	 {
           		//Voter sortedVoter [] = bubbleSort(arr);//sorting array elements using bubble sort  
                
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < sortedVoter.length; i++){  
                        System.out.print(sortedVoter[i] + " ");  
                }
           		 break;
           	 }
           	case 6:
          	 {
          		 flag=false;
          		 break;
          	 }
          	 default:
          	 {
          		System.out.print("enter the correct option"); 
          		break;
          	 }
           	 
           	 
           	 }
               }while(flag==true);
   
        }  
}  




