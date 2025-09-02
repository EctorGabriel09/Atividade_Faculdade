package Atividade01;

public class Main {
    public static void main(String[] args) {
        AccountService account = new AccountService();
        EmailService email = new EmailService();
        LoggerService log = new LoggerService();

        account.createAccount("Ector", "ector.teixeita3170@sounidesc.com.br");
        email.sendEmailConfirmation("teixeragabriel01@gmail.com");
        log.logAccountCreation("Ector.09");
    }
}


class AccountService {
    public void createAccount(String username, String email) {
        System.out.println("Sua conta foi criada: " + username);
    }
}


class EmailService {
    public void sendEmailConfirmation(String email) {
        System.out.println("E-mail de confirmação foi enviado para: " + email);
    }
}


class LoggerService {
    public void logAccountCreation(String username) {
        System.out.println("Seu usuário é: " + username);
    }
}