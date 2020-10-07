public class Instructor  extends Person implements ITeacher  {

    public Instructor(long ID, String name) {
        super(ID, name);
    }

    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(ILearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(ILearner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
