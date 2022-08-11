package Lab03;

 class ABC{
	int i,j;
	ABC(int a,int b){
		i=a;
		j=b;
	//	System.out.println("The value of i and j is"+i + j);
	}
	
	ABC(int a){
		i=a;
		j=98;
	}
	void showvalues() {
		System.out.println("The dimensions of i and j is "+ i+" " + j);
	}	
	void Addvalues(int a,int b) {
		i=a;
		j=b;
	}
	void Addvalues(int a) {
		i=a;
		j=19;
	}
}
 
 
 class XYZ extends ABC{
		
		int k;
		XYZ(int d,int e,int c ){
			super(d,e);
			k=c;
		}
		
		XYZ(int d){
			super(d);
			k=87;
		}
		void showvalues() {
			super.showvalues();
			System.out.println("The value of k is "+ k );
		}
		void Addvalues(int a,int b,int c) {
			i=a;
			j=b;
			k=c;
		}
		void Addvalues(int a) {
			i=a;
			j=25;
			k=76;
		}
		//System.out.println("The value of k is "+ k +);
		
}
 class PQR extends XYZ{
	 int l,z;
	PQR(int w,int x,int y,int z) {
		super(w,x,y);
		l=z;
		// TODO Auto-generated constructor stub
	}
	PQR(int w){
		
		super(w);
		l=z;
		
	}
	void Addvalues(int a,int b,int c,int d) {
		int k;
		super.Addvalues(12);
		k=d;
		
	}
	
	void showvalues() {
		super.showvalues();
		System.out.println("The value of l is"+ l);
		
	}
	 
 }
 
 class throwExcep{                  //UnCaught Exception
	 public void demo()
	 {
		 try {
			 throw new NullPointerException();
		 }
		 catch(NullPointerException e) {
			 System.out.println("Caught inside Demo"+e);
			 throw e;
		 }
	 }
 }
 
 class Uncaught{                    //Caught Exception
	 static void unc() {System.out.println("Waiting.....\n");
		 int d=0;
		 int a=10/d;
		 
	 }
 }
 
 class ewThread implements Runnable{
	 public void run() {
	 //Thread t = Thread.currentThread();
		try {
			System.out.println("Waiting.....\n");
			 for(int n=5;n>0;n--) {
				 System.out.println(n);
				 Thread.sleep(1000);
			 }
			 
		 }
		 catch(InterruptedException e ) {
			 System.out.println(" Thread Interrupted :"+e);
			 
		 }
	 }
 }
	 
 
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new ewThread();
	/*	XYZ or = new XYZ(10,20,30);
		XYZ ob1= new XYZ(32);
		PQR ob2= new PQR(23,34,56,78);
		or.showvalues();
		or.Addvalues(24);
		ob1.showvalues();
		ob1.Addvalues(12);
		ob2.Addvalues(23);
		ob2.showvalues();
		*/
		
		//Uncaught.unc();
		 ewThread threadobj=new ewThread();
		try {
			threadobj.run();
			//new NewThread();
			//new throwExcep();
			XYZ or = new XYZ(100,20,30);
			XYZ ob1= new XYZ(32);
			PQR ob2= new PQR(23,34,56,78);
			or.showvalues();
			or.Addvalues(24);
			ob1.showvalues();
			ob1.Addvalues(12);
			ob2.Addvalues(23);
			ob2.showvalues();
			throwExcep excep=new throwExcep();
			excep.demo();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught exception :"+ e);
		}

	}

		// TODO Auto-generated method stub
		
	}

