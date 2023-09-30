package OOPConceptOne;

public class WrapperClassOne {

	public static void main(String[] args) {
//Wrapper classes are used to convert integer to String Or String To Integer
     String x="100";
     
     System.out.println(x+20);// Not converted to integer
     //String to integer, here integer is a wrapper class
     int c=Integer.parseInt(x);// Converted to integer=Wrapper Class
     
     System.out.println(c+2);
      
     String y ="20.2";
     
     Double z=Double.parseDouble(y);
     
     System.out.println(z+40);
     
     //Integer to String
     
     int i = 10;
     
     System.out.println(i+20);
     
     String u=String.valueOf(i);
     
     System.out.println(i+30);
     // int to String conversion
     
     
 //    String w="100B";
     
  //   Integer.parseInt(w);//NumberformatException
     

	}

}
