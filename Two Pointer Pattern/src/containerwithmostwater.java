
public class containerwithmostwater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result1 = maxArea_bf(height);
        int result2 = maxArea(height);
        System.out.println(result1);
        System.out.println(result2);
    }
   // Brute Force Approach T(n) -> O(n^2)
    public static int maxArea_bf(int[] height) {
        int st = 0;
        int end = height.length-1;
        int max=0;
        int area;
        for(int i = st; i<=end; i++){
            for(int j = i+1;j<=end;j++){
                area = (j-i)*Math.min(height[i],height[j]);
                max = Math.max(area,max);
            }
        }
        return max;
    }

    public static int maxArea(int[] height){
        int st = 0;
        int end = height.length -1;
        int max = 0;
        int area;
        while(st<end){
            area = (end-st)*Math.min(height[st],height[end]);
            max = Math.max(max, area);
            if(height[st]<height[end]){
                st++;
            }
            else{
                end--;
            }
        }
        return max;
    }
}
