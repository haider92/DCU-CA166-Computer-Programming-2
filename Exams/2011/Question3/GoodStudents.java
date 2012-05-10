import java.util.ArrayList;

class Name {
    private String name;

    void getName() {
        String firstname = Console.readToken();
        String secondname = Console.readToken();
        name = firstname + " " + secondname;
    }

    void putName() {
        System.out.printf("%-30s",name);
    }
}

class Grades {
    private int[] grades = new int[5];

    void getGrades() {
        for(int i=0; i<grades.length; i++) {
            grades[i] = Console.readInt();
        }
    }

    void putGrades() {
        for(int grade : grades) System.out.printf("%3d",grade);
    }

    boolean hasGoodGrades() {
        int total=0;
        for(int i=0; i<grades.length; i++) {
            total=total+grades[i];
        }
        double average = total/grades.length;
        return(average>=40);
    }
}

class Student {
    private Name name;
    private Grades grades;

    void getStudent() {
        name = new Name();
        name.getName();
        grades = new Grades();
        grades.getGrades();
    }

    void putStudent() {
        name.putName();
        grades.putGrades();
        System.out.println();
    }

    boolean successful() {
        return(grades.hasGoodGrades());
    }
}

class GoodStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        while(!Console.endOfFile()) {
            Student tmp = new Student();
            tmp.getStudent();
            students.add(tmp);
        }
        for(int i=0; i<students.size(); i++) students.get(i).putStudent();
    }
}