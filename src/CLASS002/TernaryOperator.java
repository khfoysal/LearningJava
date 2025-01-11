package CLASS002;

public class TernaryOperator {
    public static void main(String[] args) {
        int mark1 = 98,mark2 = 87;
        int number = (mark1 > mark2 && mark1 == mark2 && mark2 < mark1)? mark1:mark2;
        System.out.println(number);

    }
}
