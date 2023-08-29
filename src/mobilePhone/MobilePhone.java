package mobilePhone;
public class MobilePhone {
    // Instance variables
    private String brand;
    private String model;
    private String phoneNumber;
    private int storageCapacity;

    // Constructor
    public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.storageCapacity = storageCapacity;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Custom methods
    public void makeCall(String phoneNumber) {
        System.out.println("We are calling " + phoneNumber + " from our " + brand + " " + model + " phone!");
    }

    public void installApp(String appName) {
        System.out.println("Installing " + appName + " on our " + brand + " " + model + " phone!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("Samsung", "Galaxy S21", "123-456-7890", 128);
        myPhone.displayInfo();

        myPhone.makeCall("987-654-3210");
        myPhone.installApp("CoolApp");
    }
}

