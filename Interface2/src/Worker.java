// Firma Çalısanı
public class Worker implements IWorkable, IEatable, IPayable{
    private Worker worker;

    public Worker(Worker worker) {
        this.worker = worker;
    }

    public Worker() {

    }

    @Override
    public void work() {
        System.out.println("Kadrolu developer çalısıyor");
    }

    @Override
    public void eat() {
        System.out.println("Kadrolu developer yemek yiyor");
    }

    @Override
    public void pay() {
        System.out.println("Kadrolu developer maaş alıyor");
    }
}
