public class Complex 
{
    private double real;
    private double img;

    // Default constructor
    public Complex() 
  {
        this.real = 0;
        this.img = 0;
    }

    // Constructor with real and imaginary parts
    public Complex(double real, double img)
  {
        this.real = real;
        this.img = img;
    }

    // Copy constructor
    public Complex(Complex other) 
  {
        this.real = other.real;
        this.img = other.img;
    }

    // Method to display complex number
    public void showComplex() 
  {
        System.out.println(real + " + " + img + "i");
    }

    // Method to add complex numbers
    public Complex addComplex(Complex other)
  {
        return new Complex(this.real + other.real, this.img + other.img);
    }

    // Method to subtract complex numbers
    public Complex subtractComplex(Complex other) 
  {
        return new Complex(this.real - other.real, this.img - other.img);
    }

    // Method to multiply complex numbers
    public Complex multiplyComplex(Complex other) 
  {
        double newReal = this.real * other.real - this.img * other.img;
        double newImg = this.real * other.img + this.img * other.real;
        return new Complex(newReal, newImg);
    }

    public static void main(String[] args)
  {
        // Creating complex numbers
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, 4);

        // Displaying complex numbers
        System.out.println("Complex Number 1:");
        c1.showComplex();

        System.out.println("Complex Number 2:");
        c2.showComplex();

        // Adding complex numbers
        Complex sum = c1.addComplex(c2);
        System.out.println("Sum:");
        sum.showComplex();

        // Subtracting complex numbers
        Complex difference = c1.subtractComplex(c2);
        System.out.println("Difference:");
        difference.showComplex();

        // Multiplying complex numbers
        Complex product = c1.multiplyComplex(c2);
        System.out.println("Product:");
        product.showComplex();
    }
}

