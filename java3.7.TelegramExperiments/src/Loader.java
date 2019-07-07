import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 788489, "072b637995b01eccf1ae2cc61f6e9257");
//        //CheckStatus
//        System.out.println("Please, type phone number:");
//        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(reader.readLine().trim());
//        System.out.println(checkedPhone.isInvited());
//        System.out.println(checkedPhone.isRegistered());

        System.out.println("========================== Please, type phone number: =========================");
        AuthSentCode sendCode = bridge.authSendCode(reader.readLine().trim());

        System.out.println("========================== Please, type acesse code: ==========================");
        AuthAuthorization authSignIn = bridge.authSignIn(reader.readLine().trim());

        System.out.println("Hey! " + authSignIn.getUser().getFirstName() + "! Great job! Durov helped?");
    }
}
