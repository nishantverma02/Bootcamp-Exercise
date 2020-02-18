//Find common elements between two arrays.
public class Q5 {
    public static void main(String[] args) {
        int[] arr1 = {5,7,3,9,2};
        int[] arr2 = {3,2,6,9,8,13,4};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
