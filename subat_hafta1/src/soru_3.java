public class soru_3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};

        int largestNumber = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] > largestNumber)
                largestNumber = array[i];
        }

        System.out.println("Dizinin en büyük elemanı : " + largestNumber);
    }
}
