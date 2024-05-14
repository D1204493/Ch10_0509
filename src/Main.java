//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
  public static void main(String[] args) {

    System.out.println("請輸入學號：");
    Scanner sc = new Scanner(System.in);
    //請使用者輸入學號 D1234567
    //檢查學號是否有效
    //規則：
    //1.長度為8
    //2.第一個字元為D
    //3.後7碼為數字

    String studentNum = sc.nextLine();

    if (studentNum.length() == 8) {
      if (studentNum.startsWith("D")) {

        boolean isDigit = true;
        for (int i = 1; i < studentNum.length(); i++) {
          char character = studentNum.charAt(i);
          if (character == '0' || character == '1' || character == '2'
                  || character == '3' || character == '4' || character == '5'
                  || character == '6' || character == '7' || character == '8'
                  || character == '9'){
          } else {
            isDigit = false;
            break;
            }
          }

        if (isDigit) {
          System.out.println("學號格式正確");
        } else {
          System.out.println("學號格式錯誤，後七碼必須為數字。");
        }

      } else {
        System.out.println("學號必須是D開頭");
      }
    } else {
      System.out.println("學號無效");
    }


  }
}