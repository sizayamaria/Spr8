public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "Level";

        String original = input.toLowerCase().replace(" ", "");
        String reversed = new StringBuilder(original).reverse().toString();

        if(original.equals(reversed)) {
            System.out.println("Строка є паліндромом");
        } else {
            System.out.println("Строка не є паліндромом");
        }
    }
}
