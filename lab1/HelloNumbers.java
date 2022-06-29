package HW0;

public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        while (x < 40) {
            x = (i*(i-1))/2;
            System.out.print(x + " ");
            i++;
        }
    }
}