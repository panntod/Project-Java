package Notifikasi;
public class EmailNotifikasi implements InterfaceNotifikasi{
    
    @Override
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim Email ke "+receiver+" Isinya ");
        System.out.println(content);
    }
}

class SMSNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi:");
        System.out.println(content);
    }
}

class PushNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim Push Notif ke " + receiver + " dengan isi:");
        System.out.println(content);
    }
    
}