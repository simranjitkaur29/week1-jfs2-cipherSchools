public class AdditionTask1 {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public float sum(float a,int b)
    {
      return  a+b;
    }
    public static void main(String[] args) {
        AdditionTask1 add=new AdditionTask1();
        System.out.println( add.sum(4.5f,4));
        System.out.println(add.sum(5, 5));
        System.out.println(1+8+2);

    }
}
