public class Q6 {
    public static void main(String[] args) {
        //Q6. There is an array with every element repeated twice except one. Find that element
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        int first = ar[0];
        for (int i = 1; i < n; i++)
            first = first ^ ar[i];

        System.out.println(first);

    }
}
