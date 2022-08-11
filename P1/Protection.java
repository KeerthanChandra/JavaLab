package P1;

public class Protection {

	int noMod_a	= 10	;			// No identifier
	private int pri_b =20	;
	protected int pro_c = 30	;
	public int pub_d	= 40;
	


public Protection() {
	System.out.println( "base constructor" )	;
	System.out.println( noMod_a )	;  		// Yes
	System.out.println( pri_b )	;		// Yes
	System.out.println( pro_c )	;		// Yes
	System.out.println( pub_d )	;		// Yes
}

}
	

