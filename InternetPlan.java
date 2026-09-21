class InternetPlan {
    String planName;
    int speed;
    double price;

    // Default constructor
    InternetPlan() {
        this("Basic", 50, 499);
    }

    // Constructor with plan name
    InternetPlan(String planName) {
        this(planName, 100, 699);
    }

    // Parameterized constructor
    InternetPlan(String planName, int speed, double price) {
        this.planName = planName;
        this.speed = speed;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium");
        InternetPlan p3 = new InternetPlan("Ultra", 200, 999);

        p1.display();
        p2.display();
        p3.display();
    }
}
