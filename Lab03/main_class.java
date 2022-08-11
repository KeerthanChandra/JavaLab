package Lab03;

interface TEST
{
int square();
}

class arithmeticc implements TEST
{
int b;

arithmeticc(int x)
{
b = x;
}

public int square()
{
return (b*b);
}

}
class ToTestInt
{
public int return_ans(int x)
{
arithmeticc a=new arithmeticc(x);
return a.square();
}
}
public class main_class
{
public static void main(String []args)
{
ToTestInt x= new ToTestInt();


System.out.println("\nThe square of 64 is "+x.return_ans(64));
}
}