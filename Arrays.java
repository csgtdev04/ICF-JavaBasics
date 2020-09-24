public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        //1,3,5
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;

        //System.out.println(numbers); //memory address
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();

        String[] words = new String[2];
        words[0] = "Apples";
        words[1] = "Oreos";

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
