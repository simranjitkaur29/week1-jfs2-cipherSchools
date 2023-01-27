package Basic;
public class WhileDoWhile {
    public static void main(String[] args) {
        
        char ch='A';
        while(ch<='Z')
        {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
        ch='a';

        do
        {
            System.out.print(ch+ " ");
            ch++;
        }

        while(ch<='z');

    }
}
