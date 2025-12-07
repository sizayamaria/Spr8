public class Censorship {
    public static void main(String[] args) {
        String text = "This is a bad and very rude message";
        String[] badWords = {"bad", "rude"};

        for (String bad : badWords) {
            text = text.replace(bad, "***");
        }

        System.out.println("Після цензури:");
        System.out.println(text);
    }
}

