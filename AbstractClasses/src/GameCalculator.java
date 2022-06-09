public abstract class GameCalculator {

    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Game Over!!!");
    }

}
/*

<*> hesapla();  ---> extends edilen her class ta
                    hesapla fonksiyonu yazılması gerekiyor
<*> abstract class içinde birden fazla abstract kullanılabilir.

 */