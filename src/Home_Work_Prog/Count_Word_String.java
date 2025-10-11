package Home_Work_Prog;

public class Count_Word_String {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        int wordCount = 1; // start with 1 word by default

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + wordCount);
    }
}