public class App {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{1,2,34,5,56,6};

        Searching ser = new Searching();

        int sum = 6;
        boolean res = ser.searchPair(arr, sum);

        System.out.println(res);
    }
}
