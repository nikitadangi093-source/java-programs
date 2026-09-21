class Time {
    int hours, minutes, seconds;

    // Constructor 1: Time in seconds
    Time(int seconds) {
        this.seconds = seconds;
        this.minutes = 0;
        this.hours = 0;
    }

    // Constructor 2: Time in minutes and seconds
    Time(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = 0;
    }

    // Constructor 3: Time in hours, minutes and seconds
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() {
        System.out.println("Time = " + hours + " hours, "
                + minutes + " minutes, " + seconds + " seconds");
    }

    public static void main(String[] args) {

        Time t1 = new Time(45);
        Time t2 = new Time(10, 30);
        Time t3 = new Time(2, 15, 20);

        t1.display();
        t2.display();
        t3.display();
    }
}
