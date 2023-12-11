package First_Package;
//
//public class TypeCast {
//	
//	    public static void main(String[] args){
//	        double d = 234.04;
//	        long l = (long)d;   //explicit type casting
//	        int i = (int)l;     //explicit type casting
//	        System.out.println("double value " + d);
//	        System.out.println("long value " + l);
//	        System.out.println("int value " + i);
//	    }
//	}
//

public class TypeCast {
    public static void main (String[] args) {
        int i = 300;
        long l = i;     //no explicit type casting
        float f = l;    //no explicit type casting
        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("float value " + f);
    }
}