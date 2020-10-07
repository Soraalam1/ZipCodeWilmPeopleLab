import java.util.Iterator;

public class YearUp {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture((ILearner[]) students.toArray(), numberOfHours);
    }
    public void hostLecture(long ID, double numberOfHours){
        ((Instructor)instructors.findByID(ID)).lecture((ILearner[]) students.toArray(), numberOfHours);
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
