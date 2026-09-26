import java.util.Scanner;

public class View {

  public static void main(String[] args){

    StringBuilder sb = new StringBuilder();
    sb.append("one").append("two");

    String result = sb.toString();
    sb.setLength(0);


    System.out.println(result);

    sb.append(43254235);

    System.out.println(sb);
  }

}
