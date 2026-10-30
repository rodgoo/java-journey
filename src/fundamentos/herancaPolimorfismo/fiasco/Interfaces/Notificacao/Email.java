package herancaPolimorfismo.fiasco.Interfaces;

public class Email implements Notificavel{

    // O Java obriga a implementa o metodo do contrato
    @Override
    public void enviarMensagem(String destinatario, String texto){
        System.out.println("Email enviado para: " + destinatario + ": " + texto);
    }
}
