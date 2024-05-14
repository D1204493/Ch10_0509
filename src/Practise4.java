import java.io.*;
import java.nio.Buffer;

public class Practise4 {
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str;
    boolean isID;

    do {
      isID = true;
      System.out.println("請輸入身分證字號：");
      str = br.readLine();
      if(!str.matches("[a-zA-Z]\\d{9}")) {
        System.out.println("身分證字號應該是1個英文字母接著9個數字！");
        isID = false;
      }
    } while (!isID);

    int [] letterNums = {10,11,12,13,14,15,16,17,34,18,
            19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};

    str = str.toUpperCase();
    char letter = str.charAt(0);
    str = letterNums[letter - 'A'] + str.substring(1);

    int total = str.charAt(0) - '0';
    for(int i=1; i<10; i++) {
      total += (str.charAt(i) - '0') * (10 - i);
    }

    int checkNum = (10-total % 10) % 10;

    if(checkNum == (str.charAt(10) - '0')) {
      System.out.println("檢查通過");
    } else {
      System.out.println("檢核錯誤，請確實填寫。");
    }

  }
}
