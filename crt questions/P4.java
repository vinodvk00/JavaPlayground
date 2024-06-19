import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // string to word array
        String words[] = s.split(" ");
        

        //reverse each word of string

        for(int i = 0; i < words.length; i++) {
            // words[i] = words[i].reverse();
            String temp = "";
            for(int j = words[i].length() - 1; j >= 0; j--) {
                temp += words[i].charAt(j);
            }
            words[i] = temp;
        }

        for(int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}