public class Encapsulationtask2 {
    private int standard;
    private int rollNo;
    private String section;
    public void setData(int std,int roll,String sec)
    {
        standard=std;
        rollNo=roll;
        section=sec;
    }
    public int getStandard()
    {
        return standard;
    }
    public int getRollNo()
    {
        return rollNo;

    }
    public String getSection()
    {
        return section;
    }
    public static void main(String[] args) {
        Encapsulationtask2 obj=new Encapsulationtask2();
        obj.setData(10, 789, "Rk");
        System.out.println(obj.getStandard());
    }

    
}
