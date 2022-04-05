import java.util.Scanner;

public class USD2VND {
    public static void main(String[] args) {
        System.out.println("Nhap so tien USD: ");
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        String str = scanner.nextLine();
        try{
            int usd = Integer.parseInt(str);
            int vnd = usd*rate;
            System.out.println(usd + " USD tuong duong voi " + vnd + " VND" );
        }catch (NumberFormatException ex){
            System.out.println("Ban chua nhap vao 1 so");
        }
    }
}
