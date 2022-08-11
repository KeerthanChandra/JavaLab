package P1;

public class SamePack {
	SamePack(){
		Protection obj = new Protection();
		System.out.println( "Constructor in same package" )	;
		
		System.out.println( obj.noMod_a )	;  		
//		System.out.println( obj.pri_b )	;		// Comment
		System.out.println( obj.pro_c )	;		
		System.out.println( obj.pub_d )	;	
	}
	}

