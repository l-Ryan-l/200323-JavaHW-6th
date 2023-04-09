import java.util.Objects;

public class Laptop {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private int ram;
    private String typeDisk;
    private int sizeDisk;

    public Laptop(String brand, String model, String color, double screenSize, int ram, String typeDisk, int sizeDisk) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.ram = ram;
        this.typeDisk = typeDisk;
        this.sizeDisk = sizeDisk;

    }

    public String printInfo() {
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, RAM: %sgb, TypeDisk: %s, DiskSize: %sgb",
                brand, model, color, screenSize, ram, typeDisk, sizeDisk);
        return ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.screenSize, screenSize) == 0 && ram == laptop.ram
                && sizeDisk == laptop.sizeDisk && Objects.equals(brand, laptop.brand)
                && Objects.equals(model, laptop.model) && Objects.equals(color, laptop.color)
                && Objects.equals(typeDisk, laptop.typeDisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, screenSize, ram, typeDisk, sizeDisk);
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String userReqiest) {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public int getSizeDisk() {
        return sizeDisk;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setTypeDisk(String typeDisk) {
        this.typeDisk = typeDisk;
    }
}

