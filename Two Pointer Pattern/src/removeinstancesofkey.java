import java.util.HashSet;

public class removeinstancesofkey {
    public static void main(String[] args) {
        System.out.println(remove_bf(new int[] {2, 11, 2, 2, 1},2));
        System.out.println(remove(new int[] {2, 11, 2, 2, 1},2));
    }
    public static int remove_bf(int[] arr, int key){
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        hs.remove(key);
        return hs.size();
    }

    public static int remove(int[] arr, int key){
        int i = 0;
        for(int j = 0;j< arr.length;j++){
            if(arr[j]!=key){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}
