package herancaPolimorfismo.fiasco.Interfaces.Notificacao;

public class Main {
    public static void main(String[] args) {
        Notificavel mensagem1 = new Email();
        Notificavel mensagem2 = new SMS();

        System.out.println("==========");
        mensagem1.enviarMensagem("rodgoocode@hotmail.com", "Mensagem de teste");
        mensagem2.enviarMensagem("pedrokaua.genuario@gmail.com", "Teste de mensagem");
        System.out.println("==========");

    }
}
