public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello world!";

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Перевернута строка: " + reversed);
    }
}

