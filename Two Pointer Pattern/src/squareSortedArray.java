import java.util.Arrays;

public class squareSortedArray {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(makesquares_bf(new int[] {-3,-2,-1,0,1,2})));
        System.out.print(Arrays.toString(makesquares(new int[] {-3,-2,-1,0,1,2})));
    }
    public static int[] makesquares_bf(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int[] makesquares(int[] arr){
        int n = arr.length;
        int highestindex = n-1;
        int[] result = new int[n];
        int st = 0;
        int end = arr.length -1;
        while(st<end){
            int leftsquare = (int) Math.pow(arr[st],2);
            int rightsquare = (int) Math.pow(arr[end],2);
            if(leftsquare < rightsquare){
                result[highestindex--] = rightsquare;
                end--;
            }
            else{
                result[highestindex--] = leftsquare;
                st++;
            }
        }
        return result;
    }
}
