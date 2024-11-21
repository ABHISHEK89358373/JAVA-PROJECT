import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();
        int l = s.length();
        char ch[] = new char[l];
        int freq[] = new int[l];
        for (int i = 0; i < l; i++) {
            ch[i] = s.charAt(i);
            freq[i] = freq(ch[i], s);
        }
        display(s, l,ch,freq);

    }

    public static void display(String s, int l,char[] ch,int[] freq) {

        for (int i = 0; i < l; i++) {

            System.out.println("Frequency of " + ch[i] + " is: " + freq[i]);
        }
    }

    public static void SortDisplay(char ch,String s,int[] freq){
        for (int i = 0; i < s.length(); i++) {
            if(freq[i]>freq[i+1]){

            }
        }
    }

    public static int freq(char ch, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }

        }

        return count;
    }
}
