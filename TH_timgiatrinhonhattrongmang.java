package Java_W1_Day_03_mang_phuongthuc;

public class TH_timgiatrinhonhattrongmang {
    public static int minValue(int[]arr){
        int min=arr[0];
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int []arr={4,12,7,8,1,-6,-9};
        int index= minValue(arr);
        System.out.println("The smallest element in the array is :"+arr[index]);
    }
}
