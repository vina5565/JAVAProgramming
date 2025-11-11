class Course {
    String code;
    String name;

    public Course(String c, String n) {
        code = c;
        name = n;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class OnlineCourse extends Course {

    public OnlineCourse(String code, String name) {
        super(code, name);   // 부모 생성자 호출
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

class OfflineCourse extends Course {

    public OfflineCourse(String code, String name) {
        super(code, name);   // 부모 생성자 호출
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

public class homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");

        System.out.println(course1);
        System.out.println(course2);
    }
}

