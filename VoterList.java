import java.util.ArrayList;
import java.util.List;

class Voter
{
	private String name;
	private int age;
	private String gender;
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
        
}

public class VoterList 
{

	public static void main(String[] args)
	{
		Voter v1 = new Voter("Jethalal", 43, "M");
		Voter v2 = new Voter("Champaklal", 72, "M");
		Voter v3 = new Voter("Tipendra", 19, "M");
		Voter v4 = new Voter("Dayaben", 38, "F");
		Voter v5 = new Voter("Mehta Sahab", 40, "M");
		Voter v6 = new Voter("Anjali Mehta", 35, "F");
		Voter v7 = new Voter("Popatlal", 36, "M");
		Voter v8 = new Voter("Krishnan Iyyer", 33, "M");
		Voter v9 = new Voter("Babita Iyyer", 32, "F");
		Voter v10 = new Voter("Aatmaram Bhide", 44, "M");
		Voter v11 = new Voter("Madhavi Bhide", 41, "F");
		Voter v12 = new Voter("Sonu Bhide", 20, "F");
		Voter v13 = new Voter("Roshan Sodhi", 39, "M");
		Voter v14 = new Voter("Roshan Kaur", 38, "F");
		Voter v15 = new Voter("Gogi", 15, "M");
		Voter v16 = new Voter("Hansraj Hathi", 44, "M");
		Voter v17 = new Voter("Komal Hathi", 43, "F");
		Voter v18 = new Voter("Goli", 21, "M");
		Voter v19 = new Voter("Pinku", 22, "M");
		Voter v20 = new Voter("Reeta Reporter", 29, "F");
		Voter v21 = new Voter("Abdul", 35, "M");
		Voter v22 = new Voter("Chalu Pandey", 46, "M");
		Voter v23 = new Voter("Nattu Kaka", 63, "M");
		Voter v24 = new Voter("Bagha", 30, "M");
		Voter v25 = new Voter("Bawri", 31, "F");
       
		List <Voter> mylist = new ArrayList ();
		Iterator itr=mylist.iterator();//getting the Iterator  

  		while(itr.hasNext()){//check if iterator has the elements  

   			System.out.println(itr.next());

	
		
	}

}
