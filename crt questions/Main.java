import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // string to word array
        String words[] = s.split(" ");

        for(int i = 0; i < words.length; i++) {
            System.out.println("w[" + i + "]" + ": " + words[i] + " : " + words[i].length());
        }
        // w[0]: hai : 3
        // w[1]: iam : 3
        // w[2]: Adam : 4
    }
}