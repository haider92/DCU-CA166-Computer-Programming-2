class Name {
    private String first, second;

    void getName() {
        first = Console.readToken();
        second = Console.readToken();
    }

    void putName() {
        String name = second+", "+first;
        System.out.printf("%-30s", name);
    }
}

class Subjects {
    private final int numSubjects = 5;
    private String[] subjects = new String[numSubjects];

    void getSubjects() {
        for(int i=0; i<numSubjects; i++) {
            subjects[i] = Console.readToken();
        }
    }

    boolean contains(String s) {
        for(String subject : subjects) {
            if(subject.equals(s)) return true;
        }
        return false;
    }
}

class Student {
    private Name name = new Name();
    private String number;
    private Subjects subjects = new Subjects();

    void getStudent() {
        number = Console.readToken();
        name.getName();
        subjects.getSubjects();
    }

    void putStudent() {
        name.putName();
        System.out.print(number);
    }

    boolean isTaking(String s) {
        return subjects.contains(s);
    }
}

class Enrollment {
    public static void main(String[] args) {
        int total=0;
        while(!Console.EndOfFile()) {
            Student s1 = new Student();
            s1.getStudent();
            if(args.length > 0) {
              for(String subject : args) {
                if(s1.isTaking(subject)) {
                  s1.putStudent();
                  System.out.println();
                  total++;
                  break;
                }
              }
            } else {
              s1.putStudent();
              total++;
              System.out.println();
            }
        }
        System.out.println("\nTotal = " + total);
    }
}