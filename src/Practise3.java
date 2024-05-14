import java.io.*;
import java.util.Scanner;

public class Practise3 {
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    boolean isID;

    do {
      isID = true;
      System.out.println("請輸入身分證字號：");
      str = br.readLine();

      if(!str.matches("[A-Z][0-9]{9}")){
        System.out.println("身分證字號應該是1個大寫英文字母接著9個數字！");
        isID = false;
      }

    } while (!isID);

  }
}
