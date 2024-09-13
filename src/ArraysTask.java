public class ArraysTask {

    public static void main(String[] args) {
       int n[] = {2,6,2,56,75,43,1};
        int smallest = n[0];
        int biggest = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] < smallest) {
                smallest = n[i];
            }
            if (n[i] > biggest) {
                biggest = n[i];
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Biggest number: " + biggest);
    }
}
