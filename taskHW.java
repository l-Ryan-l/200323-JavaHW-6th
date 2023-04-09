import java.util.List;
import java.util.Scanner;

// Task:
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию



public class taskHW {
    public static void main(String[] args) {
        Laptop asus = new Laptop("ASUS", "K3500PHPC", "Blue", 15.6,
                8, "SSD", 512);
        Laptop asusN = new Laptop("ASUS", "NITRO", "Black", 15.6,
                16, "SSD", 512);
        Laptop hp = new Laptop("HP", "Victus", "Silver", 15.6,
                16, "SSD", 512);
        Laptop hiper = new Laptop("Hiper", "G16", "Black", 15.6,
                8, "HDD", 2048);
        Laptop xiaomi  = new Laptop("Xiaomi", "RedmiBook", "Grey", 15.6,
                8, "SSD", 256);
        Laptop lenovo  = new Laptop("Lenovo", "Legion", "Storm Grey", 16,
                16, "SSD", 1024);
        Laptop dell  = new Laptop("Dell", "Alienware", "Black", 17.3,
                32, "SSD", 1024);

        List<Laptop> laptopList = List.of(asus, asusN, hp, hiper, xiaomi, lenovo, dell);

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter data for search where\s
                '1' - search by color,
                '2' - search by brand,
                '3' - search by RAM,
                '4' - search by disk type,
                '5' - search by disk size,
                '6' - search by screen size,
                '7' - search by model.""");

        int searchOption = scanner.nextInt();
        Scanner whatToFind = new Scanner(System.in);
        System.out.println("Enter what to find: ");
        String userReqiest = whatToFind.nextLine();

        if (searchOption == 1) {
            for(Laptop color : laptopList) {
                if (color.getColor().equalsIgnoreCase(userReqiest)) {
                    System.out.println(color.printInfo());
                }
            }
        } else if (searchOption == 2) {
            for(Laptop brand : laptopList) {
                if(brand.getBrand().equalsIgnoreCase(userReqiest)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (searchOption == 3) {
            for (Laptop ram : laptopList) {
                if(ram.getRam() == Integer.parseInt(userReqiest)) {
                    System.out.println(ram.printInfo());
                }
            }
        } else if (searchOption == 4) {
            for(Laptop diskType : laptopList) {
                if (diskType.getTypeDisk().equalsIgnoreCase(userReqiest)) {
                    System.out.println(diskType.printInfo());
                }
            }
        } else if (searchOption == 5) {
            for(Laptop diskSize : laptopList) {
                if(diskSize.getSizeDisk() == Integer.parseInt(userReqiest)) {
                    System.out.println(diskSize.printInfo());
                }
            }
        } else if (searchOption == 6) {
            for(Laptop screenSize : laptopList) {
                if (screenSize.getScreenSize() == Double.parseDouble(userReqiest)) {
                    System.out.println(screenSize.printInfo());
                }
            }
        } else if (searchOption == 7) {
            for(Laptop model : laptopList) {
                if(model.getModel().equalsIgnoreCase(userReqiest)) {
                    System.out.println(model.printInfo());
                }
             }
        }

        else {
            System.out.println("There is no results. Please choose search option again, " +
                    "where '1' - search by color and '2' - search by brand");
        }
        scanner.close();
    }
}
