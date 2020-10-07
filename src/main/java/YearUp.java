import java.util.HashMap;


public class YearUp {
    private static final YearUp INSTANCE = new YearUp();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private YearUp(){}

    public static YearUp getINSTANCE() {
        return INSTANCE;
    }

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }
    public void hostLecture(long ID, double numberOfHours){
        instructors.findByID(ID).lecture(students.toArray(),numberOfHours);
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap studyMap = new HashMap<Student, Double>();
        for (Student student: students.getPersonList()) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}