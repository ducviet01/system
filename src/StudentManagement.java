public class StudentManagement {
    Student[] students = new Student[100];
    int i=0;

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addStudent(Student newStudent) {
        while (i < 100) {
            students[i] = newStudent;
            i++;
        }
    }

    public void removeStudent(String id) {
        for (int j = 0; j < i; j++) {
            if (students[i].getId().equals(id)) {
                for (int k = j; k < i; k++){
                    students[k] = students[k + 1] ;
                }
                i-- ;
            }
        }
    }
}
