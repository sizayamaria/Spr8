public class ToCamelCase {
    public static void main(String[] args) {
        String text = "hello-world_my friend";

        text = text.replace("-", " ").replace("_", " ");

        String[] words = text.split("\\s+");

        StringBuilder camel = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String w = words[i];
            camel.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1).toLowerCase());
        }

        System.out.println("camelCase: " + camel);
    }
}
