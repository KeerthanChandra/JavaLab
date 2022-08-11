package P2;

public class derived {
	derived(){
		P1.Protection obj = new P1.Protection();
		System.out.println("Other package constructor");
		
//		System.out.println( obj.noMod_a )	;  		
//		System.out.println( obj.pri_b )	;		// Comment
//		System.out.println( obj.pro_c )	;		
		System.out.println( obj.pub_d )	;	

	}

}
