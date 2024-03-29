/* ArrayIndexOutOfBounds Exception
This exception occurs when you try to access the array index which does not exist. 
For example, If array is having only 5 elements and we are trying to display 7th element then it would throw this exception.*/

class ExceptionDemo2
{
   public static void main(String args[])
   {
      try{
        int a[]=new int[10];
        //Array has only 10 elements
        a[11] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
      }
   }
}


/* NumberFormat Exception
This exception occurs when a string is parsed to any numeric variable.
For example, the statement int num=Integer.parseInt ("XZ"); would throw NumberFormatException because String “XYZ” cannot be parsed to int*/

class ExceptionDemo3
{
   public static void main(String args[])
   {
      try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}


/* StringIndexOutOfBound Exception
An object of this class gets created whenever an index is invoked of a string, which is not in the range.
Each character of a string object is stored in a particular index starting from 0.
To get a character present in a particular index of a string we can use a method charAt(int) where int argument is the index. */

class ExceptionDemo4
{
   public static void main(String args[])
   {
      try{
	 String str="beginnersbook";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
   }
}



/* NullPointer Exception
Class: Java.lang.NullPointer Exception
An object of this class gets created whenever a member is invoked with a “null” object. */

class Exception2 
{
   public static void main(String args[])
   {
	try{
		String str=null;
		System.out.println (str.length());
	}
        catch(NullPointerException e){
		System.out.println("NullPointerException..");
	}
   }
}
