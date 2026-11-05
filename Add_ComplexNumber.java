class ComplexNumber {

    int real, imaginary;

 
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

 
    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
            this.real + other.real,
            this.imaginary + other.imaginary
        );
    }

    
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.print("Sum: ");
        result.display();
    }
}
