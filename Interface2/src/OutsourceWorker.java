// Dışardan gelen çalışan
public class OutsourceWorker implements IWorkable{
    private OutsourceWorker outsourceWorker;

    public OutsourceWorker(OutsourceWorker outsourceWorker) {
        this.outsourceWorker = outsourceWorker;
    }

    @Override
    public void work() {
        System.out.println("Outsource Developer çalışyor");

    }
}
