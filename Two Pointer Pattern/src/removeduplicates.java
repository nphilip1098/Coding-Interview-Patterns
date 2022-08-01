import java.util.Arrays;
import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        System.out.println(remove_bf(new int[] {2, 3, 3, 3, 6, 9, 9}));
        System.out.println(remove(new int[] {2, 3, 3, 3, 6, 9, 9}));
        System.out.println(removestriver(new int[] {2, 3, 3, 3, 6, 9, 9}));
    }
    public static int remove_bf(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        return hs.size();
    }
    // Two Implementations of Two Pointer Pattern for easy understanding
    public static int remove(int[] arr){
        int nonduplicate=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[nonduplicate-1]!=arr[i]){
                arr[nonduplicate] = arr[i];
                nonduplicate++;
            }
        }
        return nonduplicate;
    }

    public static int removestriver(int[] arr){
        int i = 0;
        for(int j = 1;j< arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
        return i+1;

    }
}
