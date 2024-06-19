import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // string to word array
        String words[] = s.split(" ");

        String maxWord = "";

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }

        System.out.println(maxWord);

        sc.close();
    }
}