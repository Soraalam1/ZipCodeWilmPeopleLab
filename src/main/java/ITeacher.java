public interface ITeacher <L extends ILearner> {
    void teach(L learner, double numberOfHours);

    void lecture(L[] learners, double numberOfHours);
}
