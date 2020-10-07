public enum Educator implements ITeacher {
    MIKAILA(new Instructor(1L, "Mikaila")),
    CHAD(new Instructor(2L, "Chad")),
    TORRIE(new Instructor(3L, "Torrie")),
    COLLEEN(new Instructor(4L, "Colleen"));

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(ILearner learner : learners){
            learner.learn(numberOfHoursPerLearner);
            timeWorked += numberOfHours;
        }
    }
}
