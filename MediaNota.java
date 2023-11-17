package MediaNota;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3, n4 = 0;
        final int media = 7;
        String nome, res, aviso = "";
        int nota = 0;

        System.out.println("Vamos calcular a media das notas dos alunos.");
        System.out.print("Nome do aluno: ");
        nome = scan.next();
        System.out.print("Digite a primeira nota do aluno: ");
        n1 = scan.nextInt();
        System.out.print("Digite a segunda nota do aluno: ");
        n2 = scan.nextInt();
        System.out.print("Digite a terceira nota do aluno: ");
        n3 = scan.nextInt();
        System.out.print("Digite a quarta nota do aluno: ");
        n4 = scan.nextInt();
        nota = (n1 + n2 + n3 + n4) / 4;
        if (nota >= media) {
            res = "APROVADO";
            aviso = "Vamos Festejar!";
        } else if (nota >= 5) {
            res = "RECUPERACAO";
            aviso = "Ainda temos uma chance, nao desista.";
        } else {
            res = "REPROVADO";
            aviso = "Nao foi dessa vez.";
        }
        System.out.printf("Pegando as notas %d, %d, %d, %d, somando" +
                " todas as notas e depois dividindo por 4%ntemos o seguinte resultado:%n", n1, n2, n3, n4);
        System.out.printf("O aluno %s teve uma media %d e o resultado foi (%s)!%n", nome, nota, res);
        System.out.print(aviso);
    }
}
