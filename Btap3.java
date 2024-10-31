package btap3;
import java.util.Scanner;
public class Btap3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen:" );
        if (scanner.hasNextInt()) {
            int soNguyen = scanner.nextInt();
            System.out.println("DA nhap vao mot so nguyen: " + soNguyen);
        } else {
            System.out.println("khong phai la mot so nguyen.");
        }

        scanner.close();
    }
}
