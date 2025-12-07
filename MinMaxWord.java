public class MinMaxWord {
    public static void main(String[] args) {
        String text = "This is an example sentence for test";

        String[] words = text.trim().split("\\s+");

        String min = words[0];
        String max = words[0];

        for (String w : words) {
            if (w.length() < min.length()) min = w;
            if (w.length() > max.length()) max = w;
        }

        System.out.println("Найкоротше слово: " + min + " (довжина: " + min.length() + ")");
        System.out.println("Найдовше слово: " + max + " (довжина: " + max.length() + ")");
    }
}
