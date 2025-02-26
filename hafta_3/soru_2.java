public class soru_2 {
    public static void main(String[] args) {
        int[] array = {0,5,8,6,4,5,7,9,0,8};

        boolean[] checked = new boolean[array.length];


        System.out.println("Tekrar eden sayılar: ");
        for (int i =0 ; i< array.length; i++){
            if(!checked[i]){
                for (int j = i+1; j < array.length; j++ ){
                    if(array[i] == array[j]){
                        System.out.println(array[i] + " ");
                        checked[j] = true;
                        break;
                    }
                }
            }
        }
    }
}
