/* Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in number of 
arguments or/and change in type of arguments.*/

class MultiplyFun { 
  
    // Method with 2 parameter 
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    // Method with the same name but 3 parameter 
    static int Multiply(int a, int b, int c) 
    { 
        return a * b * c; 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        System.out.println(MultiplyFun.Multiply(2, 4)); 
  
        System.out.println(MultiplyFun.Multiply(2, 7, 3)); 
    } 
} 



/* --------------------------------------------------------------------------------------------------------------------- */

// Java program for Operator overloading 
  
class OperatorOVERDDN { 
  
    void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String - "
                           + s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a + b; 
        System.out.println("Sum = " + c); 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        OperatorOVERDDN obj = new OperatorOVERDDN(); 
        obj.operator(2, 3); 
        obj.operator("joe", "now"); 
    } 
} 



/* Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of 
the base class. That base function is said to be overridden. */


/ Java program for Method overrinding 
  
class Parent { 
  
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class subclass1 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass1"); 
    } 
} 
  
class subclass2 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass2"); 
    } 
} 
  
class TestPolymorphism3 { 
    public static void main(String[] args) 
    { 
  
        Parent a; 
  
        a = new subclass1(); 
        a.Print(); 
  
        a = new subclass2(); 
        a.Print(); 
    } 
} 


