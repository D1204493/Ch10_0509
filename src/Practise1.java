import java.io.*;

public class Practise1 {
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String pat;
    String src;
    String rep;

    System.out.println("請輸入字串：");
    src = br.readLine();

    System.out.println("輸入樣式：");
    pat = br.readLine();

    System.out.println("輸入要取代成：");
    rep = br.readLine();

   System.out.println(src.replaceAll(pat,rep));


  }
}
