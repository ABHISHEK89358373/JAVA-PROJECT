import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class countword {
    public static void main(String[] args) throws IOException {


        File f1=new File("\\C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA\\KK.txt\\");
        FileWriter fw = new FileWriter(f1);
        fw.write("Hello ,Kanishk here!!");
        fw.flush();
        System.out.println("Length of File :" + f1.length());
        FileReader fr=new FileReader(f1);



            char s[] = new char[(int) f1.length()];
            fr.read(s);
            System.out.println(s);

            String ss=s.toString();
        int vowel=0;
        int word=0;
            for (int j = 0; j < f1.length(); j++) {

              if(s[j]=='a'|| s[j]=='e' || s[j]=='o'|| s[j]=='u'||s[j]=='i')
              {
                  vowel++;
              }
              if(s[j]==32){
                  String k="";
                  fr.read(k.toString().toCharArray());

                  int l=k.lastIndexOf(' ');
                  k.trim();
                  word++;
                  fr.close();
              }
            }
        System.out.println(vowel);
        System.out.println(word);
        }
    }

