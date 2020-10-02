public class Student extends Person implements ILearner {
    double totalStudyTime;

    public Student(long ID, String name) {
        super(ID, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
