
public class BubbleSort
{
	static int count;
	
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
                 
         }
		return arr;  
  
    }
	
    public static void main(String[] args) {  
                /*int arr[] ={3,60,35,2,45,32,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  */
    	 Voter voter = new Voter();
    	 Voter arr[] = voter.addVoterList();
    	 
    	 
                  
                Voter sortedVoter [] = bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < sortedVoter.length; i++){  
                        System.out.print(sortedVoter[i] + " ");  
                }
                System.out.println(count);
   
        }  
}  

