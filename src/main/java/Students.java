import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student dean = new Student(313L,"Dean");
        Student corey = new Student(918L,"Corey");
        Student yas = new Student(100L,"Yasmin");
        Student jadyn = new Student(309L,"Jadyn");
        Student asher = new Student(402L,"Asher");
        Student ryan = new Student(199L, "Ryan");
        Student dallas = new Student(43L, "Dallas");
        Student darren = new Student(505L, "Darren");
        Student ray = new Student(671L, "Raymundo");
        getPersonList().add(dean);
        getPersonList().add(corey);
        getPersonList().add(yas);
        getPersonList().add(jadyn);
        getPersonList().add(asher);
        getPersonList().add(ryan);
        getPersonList().add(dallas);
        getPersonList().add(darren);
        getPersonList().add(ray);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
    @Override
    public Student[] toArray(){
        Student[] students = new Student[getPersonList().size()];
        for(int index = 0; index < getPersonList().size(); index++){
            students[index] = getPersonList().get(index);
        }
        return students;
    }

}
