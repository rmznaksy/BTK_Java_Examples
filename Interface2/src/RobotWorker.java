public class RobotWorker implements IWorkable{
    private RobotWorker robotWorker;

    public RobotWorker(RobotWorker robotWorker) {
        this.robotWorker = robotWorker;
    }

    @Override
    public void work() {
        System.out.println("Robot çalışıyor");
    }
}
