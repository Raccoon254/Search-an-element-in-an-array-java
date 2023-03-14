
import java.util.Arrays;

class Find {
  public static void main(String[] args) {
    String[] name = {"abas","lee","gracie"};
    String  find = "raccoon";
    boolean found = Arrays.stream(name).anyMatch(a -> a == find);

    if(found)
      retSystem.out.println(find + " is found.");
    else
      System.out.println(find + " is not found.");
      
  }
}