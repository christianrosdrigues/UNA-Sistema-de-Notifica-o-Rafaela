import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new NotificacaoEmail());
        notificacoes.add(new NotificacaoSms());
        notificacoes.add(new NotificacaoWhatsApp());

        ServicoNotificacao servico = new ServicoNotificacao();

        System.out.println("=== Sistema de Notificações ===");
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - WhatsApp");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao < 1 || opcao > 3) {
            System.out.println("Opção inválida!");
        } else {
            System.out.print("Digite a mensagem que será enviada: ");
            String mensagem = scanner.nextLine();

            Notificacao notificacaoEscolhida = notificacoes.get(opcao - 1);

            servico.notificarCliente(notificacaoEscolhida, mensagem);
        }
    }
}