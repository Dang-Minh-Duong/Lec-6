import java.util.*;

public class JavaSortHR {

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++) {
            student.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
        }
        Collections.sort(student, new studentComparator());
        for (Student s : student) {
            System.out.print(s);
            System.out.println();
        }
    }
}
class studentComparator implements Comparator <Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa()==s2.getCgpa()) {
            int returnValue = s1.getFname().compareTo(s2.getFname());
            if (returnValue == 0) {
                return s2.getId() - s1.getId();
            }
            return returnValue;
        }
        else if (s1.getCgpa()>s2.getCgpa()) return -1;
        return 1;
    }
}
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public String toString() {
        return fname;
    }
}
