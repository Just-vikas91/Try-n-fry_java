import java.util.Scanner;

class LeetCodeOne{
 public String mergeAlternatively(String word1, String word2){
    StringBuilder sb = new StringBuilder();

    int i=0;
    int j= 0;
    boolean point = true;

    while (i<word1.length() && j< word2.length()) {
        if (point) {
            sb.append(word1.charAt(i));
            i++;
        }
        else{
            sb.append(word2.charAt(j));
            j++;
        }
        point = !point;
    }

    while (i<word1.length()) {
        sb.append(word1.charAt(i));
        i++;
    }

    while (j<word2.length()) {
        sb.append(word2.charAt(j));
        j++;
    }
    return sb.toString();
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word1 String: ");
        String a = sc.nextLine();
        System.out.println("Enter String for second Word: ");
        String b = sc.nextLine();

        LeetCodeOne one = new LeetCodeOne();
        String result = one.mergeAlternatively(a, b);
        System.out.println("merged String : " + result);
    }
}