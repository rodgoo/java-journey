package herancaPolimorfismo.fiasco.Interfaces;

public class SMS implements  Notificavel {

    @Override
    public void enviarMensagem(String destinatario, String texto){
        System.out.println("Enviando SMS para: " + destinatario + ": " + texto);
    }
}
