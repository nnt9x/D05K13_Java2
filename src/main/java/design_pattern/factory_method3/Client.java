package design_pattern.factory_method3;

import design_pattern.factory_method3.caphe.CaPheFactory;
import design_pattern.factory_method3.caphe.CaPheType;

import java.util.Scanner;

public class Client {

    private static void showMenu() {
        System.out.println("--- MAY PHA CA PHE ---");
        System.out.println("1. Latte");
        System.out.println("2. Den da");
        System.out.println("3. Espresso");
        System.out.println("0. Thoát");
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0){
            showMenu();
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            if(choice == 0){
                System.out.println("Thoat chuong trinh");
                break;
            }
            else if(choice == 1){
                CaPheFactory.getCaPhe(CaPheType.LATTE).taoCaPhe();
            } else if (choice == 2) {
                CaPheFactory.getCaPhe(CaPheType.DEN_DA).taoCaPhe();
            }
            else if (choice == 3){
                CaPheFactory.getCaPhe(CaPheType.ESPRESSO).taoCaPhe();
            }
            else {
                System.out.println("Lua chon khong hop le");
            }
        }
        scanner.close();

    }
}
