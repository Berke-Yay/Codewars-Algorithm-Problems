package codewars;
import java.util.List;

public class ones_and_zeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int result=0;
        int length = binary.size();
        for (int i=0;i<binary.size();i++) {
            result+=binary.get(i)*Math.pow(2, length-1);
            length--;
        }
        return result;
    }
}
