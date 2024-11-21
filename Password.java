//We need to write the function to check the password entered is correct or not
//        based on the following conditions.
//        a) It must have atleast one lower case character and one digit.
//        b) It must not have any Upper case characters and any special
//        characters
//        c) length should be b/w 5-12.
//        d) It should not have any same immediate patterns like
//        abcanan1 : not acceptable coz of an an pattern
//        abc11se: not acceptable, coz of pattern 11
//        123sd123 : acceptable, as not immediate pattern
//        adfasdsdf : not acceptable, as no digits
//        Aasdfasd12: not acceptable, as have uppercase character
import java.util.Scanner;

public class Password {
    String str;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        if (CheckPass(str)== true){
            System.out.println("correct PASSWORD");
        }
        else {
            System.out.println("Not Corerct");
        }

    }
    public boolean searchPattern(String str){
        int m = 0;
        int n = m + 1;
        String sr = str.substring(m, n);
        if (str.contains(sr))

          return false;
        return false;
    }
    public static boolean CheckPass(String str){
        str=str.trim();
        int l=str.length();
        int low=0;
        int up=0;
        int special=0;
        int dig=0;
        for (int i = 0; i <l; i++) {
            char c=str.charAt(i);
            int ch=(int)c;

            if ((ch >= 32 && ch < 48) || (ch >= 58 && ch < 65) || (ch > 122 && ch < 126)) {
                special++;
            }
            else if (ch >=67 && ch<=122){
                low++;
            }
            else if(ch >=48 && ch<=57){
                dig++;
            }
            else{
                up++;
            }
        }

        if(low>=1 && up==0 && special==0 && dig>=1 && l>=5 && l<=12  ){
            return true;
        }
        else {
            return false;
        }
    }
}
