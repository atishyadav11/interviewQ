package C1_Varibles;

public class pro6 
{
  public static void main(String[] args)
  { 
	  System.out.println("i'm main model");    // main methods
	  m1();                                    // static methods called from same class
	  pro7.v1();                               // static method called from diff. class //pro7
  } 
  
  public static void m1()                            //static method call from same class
  {
	  System.out.println("i'm static method called from same class :::regular");
  }
}
