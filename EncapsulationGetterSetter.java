package Encapsulation;
public class EncapsulationGetterSetter {
    public static void main(String[] args) {
        Amazon amz=new Amazon();
        System.out.println("You Payable amount will be: "+amz.transaction(1000.0f));
        
    }
}
class Amazon
{
    float transaction(float t)
    {
        Gpay gpay=new Gpay();

        gpay.setTax(0.09f);
        float totalAmout=t+(t*gpay.getTax());
        return totalAmout;

    }

}  
class Gpay
{

    private float txt=0.05f;
    public void setTax(float tx1)
    {
        if(tx1<=0.05f)
        {
            System.out.println("Invalid txnCharge");
            return ;
        }
        txt=tx1;
        

    }
    public float getTax()
    {
        return txt;

    }
}
