class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;

    }

    public void turnOn() {
        // 출력 예의 순서를 맞춤
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}
class Monitor {
    private String size;
    private String color;
    private String power;

    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;

    }
    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }
        public void printInfo() {
            System.out.println("The spec of the monitor");
            System.out.println("Size: " + size);
            System.out.println("Color: " + color);
            System.out.println("Power: " + power);
        }
}
class Computer {
        private String cpu;
        private String memory;
        private String hdd;
        private String color;
        private String power;

    public Computer(String cpu, String memory, String hdd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
}
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }
    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hdd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

public class homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32 inch", "Black", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");
        PersonalComputer pc = new PersonalComputer(computer, monitor);
        pc.turnOn();
        pc.printInfo();

    }
}
