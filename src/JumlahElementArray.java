import java.util.Arrays;

public class JumlahElementArray {
    public static void jumlahElementArray(){
        int[] array = {1,2,3,4,5,6};

        int sum = (int) Arrays.stream(array).count();
        System.out.println(sum);
    }
}
