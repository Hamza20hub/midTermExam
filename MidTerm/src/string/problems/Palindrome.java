package string.problems;
//Done
public class Palindrome {
    public static void main(String[] args) {
        String a = "papa";
        String reverse = "";

        for (int i = a.length() - 1; i>=0;i--) {
            reverse += a.charAt(i);
            System.out.println(reverse);
        }
boolean palindrome = true;
        for(int i=0;i<a.length();i++){
            System.out.println(i);
            if(a.charAt(i) != reverse.charAt(i)){
                palindrome= false;
            }
        }
if (palindrome){
    System.out.println("this is palindrome");
}else {
    System.out.println("not a palindrome");
}
    }
    }

