import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        Scanner sc = new Scanner(System.in);

        final int adicionar = 1;
        final int ver = 2;
        final int buscar = 3;
        final int editar = 4;
        final int apagar = 5;
        final int sair = 6;

        boolean sairdoprograma = false;

        while (sairdoprograma == false){
            System.out.println("""
                1. adicionar
                2. ver
                3. buscar
                4. editar
                5. apagar
                6. sair
                """);

            int escolha = sc.nextInt();
            sc.nextLine();

            if(escolha == 1){
                System.out.println("Digite sua anotação");
                String texto = sc.nextLine();
                anotacao nova = new anotacao(texto);
                blocoDeNotas.adicionaranotacao(nova);
            }
            if(escolha == 2){
                System.out.println("Digite o número da anotação que deseja ver");
                int numero = sc.nextInt();
                sc.nextLine();
                anotacao anotacaoaver = blocoDeNotas.listadeanotacoes.get(numero);
                blocoDeNotas.veranotacao(anotacaoaver);
            }
            if(escolha == 3){
                System.out.println("Digite o texto da anotação que deseja buscar");
                String textoabuscar = sc.nextLine();
                blocoDeNotas.buscaranotacao(textoabuscar);

            }
            if(escolha == 4){
                System.out.println("Digite o numero da anotação que deseja editar");
                int numero = sc.nextInt();
                sc.nextLine();
                anotacao anotacaoaeditar = blocoDeNotas.listadeanotacoes.get(numero);
                blocoDeNotas.editaranotacao(anotacaoaeditar);
            }

            if(escolha == 5){
                System.out.println("Digite o número da anotação que deseja apagar");
                int numero = sc.nextInt();
                sc.nextLine();
                anotacao anotacaoaapagar = blocoDeNotas.listadeanotacoes.get(numero);
                blocoDeNotas.apagaranotacao(anotacaoaapagar);
            }
            if(escolha == 6){
                sairdoprograma = true;
            }
        }
    }
}

