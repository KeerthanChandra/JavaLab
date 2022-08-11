package P2;

public class Protect extends P1.Protection{
	
	Protect(){
System.out.println("Derived Class in other package constructor");
		
//		System.out.println( noMod_a )	;  		
//		System.out.println( pri_b )	;		
		System.out.println( pro_c )	;		
		System.out.println( pub_d )	;	
	}

}
