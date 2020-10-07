import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor> {
    public static final Instructors INSTANCE = new Instructors();



    private Instructors(){
        //Sorry I don't know anyone else at ZipCode Wilm
        getPersonList().add(Educator.MIKAILA.getInstructor());
        getPersonList().add(Educator.CHAD.getInstructor());
        getPersonList().add(Educator.TORRIE.getInstructor());
        getPersonList().add(Educator.COLLEEN.getInstructor());
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray(){
        Instructor[] instructors = new Instructor[getPersonList().size()];
        for(int index = 0; index < getPersonList().size(); index++){
            instructors[index] = getPersonList().get(index);
        }
        return instructors;
    }
}
