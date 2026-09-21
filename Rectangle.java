class Rectangle {
    int length;
    int breadth;

    void CalculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.CalculateArea();
    }
}
