package Inheritance;

public class Furniture
{
    int width;
    int height;
    public void display(String item)
    {
        System.out.println(item+ " Width: "+width+" Height "+height);

    }

    public static void main(String[] args) {
        Chair neelKamal=new Chair();
        neelKamal.foo();
        

    }
}
class Chair extends Furniture
{
    void foo()
    {
        width=50;
        height=70;
        display("Chair");
    }

}

 class Table extends Furniture
 {
    void foo()
    {
        width=100;
        height=50;
    }
 }
 class Almira extends Furniture{
    void foo()
    {
        width =80;
        height=200;

    }
 }