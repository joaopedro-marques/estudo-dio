import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binary {
 

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());

    char[] binary = Integer.toBinaryString(n).toCharArray();

    int sumTemp = 0;
    int maxCount = 0;
    for (int i = 0; i < binary.length; i++) {
      sumTemp = (binary[i] == '1') ? ++sumTemp : 0;
     
      if (sumTemp > maxCount) {
        maxCount = sumTemp;
      }
    }

    System.out.println(maxCount);

    bufferedReader.close();
  }
}
