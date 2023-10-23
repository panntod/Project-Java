package Notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "pandhu.munjalindra@gmail.com";
        String nomerHp = "+6287858496019";
        String mobileId = "android-123456";

        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Kamu menjadi juara catur yang tak terkalahkan, semoga kamu bisa meneruskan bakat mu ke jenjang antar galaksi\n";

        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
