import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape shape = new Shape("red");
        System.out.println(shape);

        System.out.println("ban thich mau gi");
        String color = scanner.nextLine();

        System.out.println("canh thu nhat:");
        float s1 = scanner.nextFloat();

        System.out.println("canh thu hai:");
        float s2 = scanner.nextFloat();

        System.out.println("canh thu ba:");
        float s3 = scanner.nextFloat();

        Triangle triangle = new Triangle(color, s1, s2, s3);
        if(s1+s2 > s3 && s1+s3 >s2 && s2+s3 >s1) {
            triangle.getPerimeter();
            System.out.println(triangle);
        }
        else {
            System.out.println("day ko phai la ba canh cua mot tam giac");
        }

    }
}
