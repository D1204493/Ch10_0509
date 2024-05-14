import java.util.*;
public class MainPra1 {
  public static void main(String[] args) {

    //使用者輸入身分證號
    //檢查身分證號格式是否正確
    System.out.println("請輸入身分證：");
    Scanner sc = new Scanner(System.in);
    String id = sc.nextLine();
    if (id.matches("[A-Z][0-9]{9}")) { //[0-9]可以用[\\d] ->代表數字
      System.out.println("身分證號格式正確");
    } else {
      System.out.println("身分證號格式錯誤");
    }

    //使用者輸入電子郵件
    //檢查電子郵件格式是否正確
    System.out.println("請輸入電子郵件：");
    String eMail = sc.nextLine();
    if (eMail.matches("\\w+@(\\w+\\.)+\\w+")) {
      System.out.println("電子郵件格式正確");
    } else {
      System.out.println("電子郵件格式錯誤");
    }

    //使用者輸入密碼
    //檢查密碼格式是否正確
    //1.長度在8-10之間
    //2.包含英文字母
    //3.包含數字
    System.out.println("請輸入密碼：");
    String passWord = sc.nextLine();
    if (passWord.matches("\\w{8,10}")
            && passWord.matches(".*[a-zA-Z]+.*")
            && passWord.matches(".*[\\d]+.*")) {
        System.out.println("密碼格式正確");
    }
    else {
      System.out.println("密碼格式錯誤");
    }


  }
}
