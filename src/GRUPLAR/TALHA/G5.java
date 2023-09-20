package GRUPLAR.TALHA;

public class G5 {
    public static void main(String[] args) {
        System.out.println("SEYIT");
        System.out.println("TALHA");
    }
    public void verifyOrder(){
        System.out.println("order verified");
    }

    public void receiveOrderInfo(){
        System.out.println("order info received");
    }

    public void pauseCode(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
