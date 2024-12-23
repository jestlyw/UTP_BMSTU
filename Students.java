public abstract class Student {
    private String name;
    private int course;
    private double examScore;

    public Student(String name, int course, double examScore) {
        this.name = name;
        this.course = course;
        this.examScore = examScore;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getExamScore() {
        return examScore;
    }

    public abstract void writeExam();
}

public class IUStudent extends Student {
    public IUStudent(String name, int course, double examScore) {
        super(name, course, examScore);
    }

    @Override
    public void writeExam() {
        System.out.println(getName() + " с факультета ИУ пишет экзамен.");
    }
}

public class MathStudent extends Student {
    public MathStudent(String name, int course, double examScore) {
        super(name, course, examScore);
    }

    @Override
    public void writeExam() {
        System.out.println(getName() + " с направления Математика пишет экзамен.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new IUStudent("Иван Иванов", 2, 85.5);
        Student student2 = new MathStudent("Петр Петров", 3, 92.0);

        student1.writeExam();
        student2.writeExam();
    }
}
