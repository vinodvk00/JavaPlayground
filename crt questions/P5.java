import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        //reverse string and preserve spaces in same order
        //in1:hai iam adam from mlrit
        // op :tir lmm orfm adam aiiah

        // String rs = s.replaceAll(" ", "");

        char ans[] = s.toCharArray();

        int l = 0, r = ans.length - 1;

        while(l < r) {
            if(ans[l] == ' ') {
                l++;
            } else if(ans[r] == ' ') {
                r--;
            } else {
                char temp = ans[l];
                ans[l] = ans[r];
                ans[r] = temp;
                l++;
                r--;
            }
        }

        System.out.println(ans);



        sc.close();
    }
}