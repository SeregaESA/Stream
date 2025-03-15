import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array = {1,2,3,5,6,7,9,10};
        System.out.println(compress(array));
    }
    static String compress(int[] array) {
        array = Arrays.stream(array).sorted().toArray();
        StringBuilder str = new StringBuilder();
        if (array.length == 1) {
            return  Integer.toString(array[0]);
        } else if (array.length == 2) {
            if ((array[1] - array[0]) != 1) {
                return array[0] + "," + array[1];
            } else {
                return array[0] + "-" + array[1];
            }
        } else {
            str.append(array[0]);
            for (int i = 1; i < array.length - 1 ; i++) {
                if ((array[i + 1] - array[i] != 1)) {
                    str.append("-" + array[i] + "," + array[i + 1]);
                } else if (i + 1 == array.length - 1) {
                    str.append("-" + array[array.length - 1]);
                }
            }
            return str.toString();
        }
    }
}


