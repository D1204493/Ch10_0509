import java.util.*;

public class Main2 {
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
    if (studentNum.matches("D[0-9]{7}")) {
      System.out.println("學號格式正確");
    } else {
      System.out.println("學號格式錯誤");
    }

  }
}
