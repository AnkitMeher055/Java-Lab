import java.util.Scanner;

class Vehicle 
{
    private String brand;
    private String countryOfOrigin;
    private double basePrice;

    public void inputDetails() 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Enter country of origin: ");
        this.countryOfOrigin = scanner.nextLine();
        System.out.print("Enter base price: ");
        this.basePrice = scanner.nextDouble();
    }

    public void display() 
  {
        System.out.println("Brand: " + this.brand);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Base Price: " + this.basePrice);
    }
}

class Car extends Vehicle 
{
    private String model;
    private double speed;
    private double marketPrice;

    public void read() 
  {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();
        System.out.print("Enter speed (km/hr): ");
        this.speed = scanner.nextDouble();
    }

    public void calculateMarketPrice() 
  {
        if (speed > 80) 
        {
            marketPrice = super.basePrice * 1.15;
        } else 
        {
            marketPrice = super.basePrice * 0.95;
        }
    }

    public void show() 
  {
        super.display();
        System.out.println("Model: " + this.model);
        System.out.println("Speed: " + this.speed + " km/hr");
        System.out.println("Market Price: " + this.marketPrice);
    }
}

public class Main 
{
    public static void main(String[] args) 
  {
        Car car = new Car();
        car.read();
        car.calculateMarketPrice();
        car.show();
    }
}
