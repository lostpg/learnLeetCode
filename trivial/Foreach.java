public class Foreach {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int e : a) e = 0; // cannot change origin value of a[].
        for (int e : a) System.out.print(e);
    }
}
