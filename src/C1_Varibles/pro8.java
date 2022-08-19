package C1_Varibles;

public class pro8
{ 
public static void main(String[] args)
{
	System.out.println("enter the student roll no and name");
	m1();                        // same class
	System.out.println("enter the Branch and Passout Year");
	pro9.m2();                   // diff class   
	System.out.println("Your details are here");
	pro9.m3();                   // diff class  
}

public static void m1()
{ 
	int roll;
	String name;
	roll=56;
	name="Atish Yadav";
	System.out.println("Roll="+roll);
	System.out.println("Student Name="+name);
}
}
