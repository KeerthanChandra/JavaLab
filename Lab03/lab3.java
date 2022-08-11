package Lab03;
import java.util.Scanner;

class Student{
    String Name;
    String Branch;
    int phno;
    String usn;
    void insert_rcd(String Name,String Branch,int phno,String usn){
        this.Name=Name;
        this.Branch=Branch;
        this.phno=phno;
        this.usn=usn;

    }
    
    void display() {
    	System.out.println(Name+"\n"+Branch+"\n"+phno+"\n"+usn);
    }
}

public class lab3 {

	private static char[] sname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 



		            System.out.println("Enter the number of students: ");
		            Scanner sc = new Scanner(System.in);
		            int n = sc.nextInt();
		            Student c[] = new Student[n];
		            //Student c1 = new Student();
		            for(int k=0;k<n;k++)
		            	c[k]= new Student();
		            for (int i = 0; i < n; i++) {
		                System.out.println("Enter the student name");
		                String sname =  sc.next();
		               

		                System.out.println("Enter the branch");
		                String bname =  sc.next();
		                

		                System.out.println("Enter the phone Number");
		                int pno = sc.nextInt();
		                //pno = c1.phno;

		                System.out.println("Enter the usn");
		                String USN =  sc.next();
		                c[i].insert_rcd(sname, bname, pno, USN);
		                
		            }

		            for(int j=0;j<n;j++){
		                System.out.println("The Details of student "+ (j+1) + "is : 1"
		                		+ "");
		                c[j].display();
		            }
		        }
		


	}


