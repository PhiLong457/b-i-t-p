
package bt2;
import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String chuoiNhap = scanner.nextLine();   

        if (scanner.hasNext()) {
            System.out.println("da nhap vao mot chuoi.");
        } else {
            System.out.println("không phai la mot chuoi.");
        }

        scanner.close();
    }
    
}
