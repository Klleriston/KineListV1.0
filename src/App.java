import java.util.Scanner;
import br.com.kinelist.calculoRanking.Recomenda;
import br.com.kinelist.modelo.Animes;
import br.com.kinelist.modelo.Filmes;
import br.com.kinelist.modelo.Users;

public class App {
    public static void main(String[] args) throws Exception {
        
        Recomenda filtro = new Recomenda();
        Users user = new Users();
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Bem vindo ao KineList !");
        System.out.println("Esse é um programa de avaliacoes de animes, sejam series ou filmes !!");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Antes de começar me diga seu nome: ");
        user.setName(input.nextLine());
        System.out.println("Então " + user.getName() + " é seu nome?");
        int id = user.geraID();
        System.out.println("Ok ! vamos comecar");
        System.out.println("aqui esta o seu ID -> " + id);

        while (true) {
            System.out.println("Para entrar no programa por favor digite seu ID: ");
        //input.nextLine();
        int acess = input.nextInt();

        if (acess == id) {

            while (true) {
                System.out.println("BEM VINDO ! \r\n Avalie as obras: ");
                //===================================================================
                    // ---- inf tecnica -----
                    Filmes jujutsu = new Filmes();
                    System.out.println("===========================");
                    jujutsu.setName("Jujutsu Kasien 0");
                    jujutsu.setAnoDeLancamento(2023);
                    jujutsu.setStudio("Mappa");
                    jujutsu.setBilheteria(195080000);
                    jujutsu.exibeFicha();
                    // ----- avaliação ------
                    jujutsu.setAvaliacao(10);
                    System.out.println("Avaliacao do dev -> " + jujutsu.getAvaliacao());
                    System.out.printf("Qual sua avaliacao para o filme? ");
                    jujutsu.setAvaliacao(input.nextInt());
                    filtro.filtro(jujutsu);

                    //===================================================================
                    // ----- Segundo Filme ------------
                    Filmes kimetsu = new Filmes();
                    System.out.println("===========================");
                    kimetsu.setName("Kimetsu no Yaiba The Movie: Mugen Train");
                    kimetsu.setAnoDeLancamento(2021);
                    kimetsu.setStudio("Ufotable");
                    kimetsu.setBilheteria(507100000);
                    kimetsu.exibeFicha();
                    // ----- avaliação ------
                    kimetsu.setAvaliacao(8);
                    System.out.println("Avaliacao do dev -> " + kimetsu.getAvaliacao() + "(Gosto muito da luta do rengoku)");
                    System.out.printf("Qual sua avaliacao para o filme? ");
                    kimetsu.setAvaliacao(input.nextInt());
                    filtro.filtro(kimetsu);
                    System.out.println("===========================");
                    //===================================================================

                    // ----- Terceiro Filme ------------
                    Filmes yourName = new Filmes();
                    System.out.println("===========================");
                    yourName.setName("Kimi no na wa(Your name)");
                    yourName.setAnoDeLancamento(2017);
                    yourName.setStudio("Toho Co");
                    yourName.setBilheteria(355200000);
                    yourName.exibeFicha();
                    // ----- avaliação ------
                    yourName.setAvaliacao(6);
                    System.out.println("Avaliacao do dev -> " + yourName.getAvaliacao() + "(Não sou muito fã de shoujo)");
                    System.out.printf("Qual sua avaliacao para o filme? ");
                    yourName.setAvaliacao(input.nextInt());
                    filtro.filtro(yourName);
                    System.out.println("===========================");
                    //===================================================================

                    // ---Anime----
                    Animes onePiece = new Animes();
                    System.out.println("===========================");
                    onePiece.setName("One Piece");
                    onePiece.setAnoDeLancamento(1990);
                    onePiece.setStudio("Toei");
                    onePiece.setNumeroDeEpisodios(1071);
                    onePiece.exibeFicha();
                    // ----- avaliação ------
                    onePiece.setAvaliacao(10);
                    System.out.println("Avaliacao do dev -> " + onePiece.getAvaliacao() + "(SIMPLESMENTE O MEU FAVORITO)");
                    System.out.printf("Qual sua avaliacao para o anime? ");
                    onePiece.setAvaliacao(input.nextInt());
                    if (onePiece.getAvaliacao() == 10) {
                        System.out.println("VOCE TEM UM OTIMO GOSTO !");
                        filtro.filtro(onePiece);
                    } else { 
                        filtro.filtro(onePiece);
                    }
                    System.out.println("===========================");
                    //===================================================================

                    Animes Naruto = new Animes();
                    System.out.println("===========================");
                    Naruto.setName("Naruto");
                    Naruto.setAnoDeLancamento(1999);
                    Naruto.setStudio("Studio Pierrot");
                    Naruto.setNumeroDeEpisodios(220);
                    Naruto.exibeFicha();
                    // ----- avaliação ------
                    Naruto.setAvaliacao(9);
                    System.out.println("Avaliacao do dev -> " + Naruto.getAvaliacao() + "(NOSTAGICO)");
                    System.out.printf("Qual sua avaliacao para o anime? ");
                    Naruto.setAvaliacao(input.nextInt());
                    filtro.filtro(Naruto);
                    System.out.println("================================================");
                    System.out.println("Isso é tudo muito obrigado por usar meu programa !");
                    System.out.println("Deseja sair? [Y] [N]");
                    input.nextLine();
                    String a = input.nextLine();
                    if (a.equalsIgnoreCase("y")) {
                        System.out.println("Programa desenvolvido por Klleriston para fixação de conceitos de POO");
                        break;
                    }
            
                }
            }else {
                System.out.println("Acesso invalido por favor coloque o ID correto !");
                System.out.println("Deseja sair? [Y] [N]");
                input.nextLine();
                String an = input.nextLine();
                if (an.equalsIgnoreCase("Y")) {
                   System.out.println("Programa desenvolvido por Klleriston para fixação de conceitos de POO");
                        break; 
                }
            }
        }
    }
}