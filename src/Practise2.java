import java.util.*;

public class Practise2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    String pat;
    String src;

    System.out.println("請輸入樣式");
    pat = sc.nextLine();

    System.out.println("請輸入樣式");
    src = sc.nextLine();

    if(src.matches(pat)) {
      System.out.println("相符");
    } else {
      System.out.println("不相符");
    }

  }
}
