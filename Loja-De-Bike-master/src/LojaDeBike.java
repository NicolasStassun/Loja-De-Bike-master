import java.util.Scanner;

public class LojaDeBike
{
    static Scanner sc = new Scanner(System.in);
    static double carrinho=0;
    public static void main(String[] args) {
        String nome;
        System.out.println("Bem-vindo ao autoatendimento da bicicletaria XPTO Bikes.");
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        menu();
    }
    public static void menu(){
        int opcao;
        System.out.println("Opção 1 - Ver promoções.");
        System.out.println("Opção 2 - Solicitar serviço de manutenção. ");
        System.out.println("Opção 3 - Listar carrinho de compra. ");
        System.out.println("Opção 4 - Finalizar carrinho de compra.");
        System.out.println("Opção 0 - Sair. ");
        System.out.println("Digite sua opção desejada: ");
        opcao = sc.nextInt();
        if(opcao==1){
            opcao1();
        }
        else if(opcao==2){
            opcao2();
        }
        else if(opcao==3){
            opcao3();
        }
    }
    static int quantidade101=0, quantidade102=0, quantidade103=0, quantidade104=0;
    static int quantidadeProdutosPromocao=0;
    public static void opcao1(){
        int opcaoPromocao=0;
        int carrinhoPromocao=0;
        while (opcaoPromocao!=6) {
            System.out.println("1. Código 101 - Bicicleta nova na cor amarela, aro 26, " +
                    "com 18 marchas e na promoção pelo preço de R$ 999.99. ");
            System.out.println("2. Código 102 - Bicicleta usada na cor azul, aro 26," +
                    " com 18 marchas e com o valor promocional de R$ 400,00. ");
            System.out.println("3. Código 103 - Capacete de proteção por R$59.99.");
            System.out.println("4. Código 104 - Freio a disco por R$ 89,99. ");
            System.out.println("5. Adicionar ao carrinho de compras. ");
            System.out.println("6. Voltar ");
            System.out.println("Escolha o código do produto: ");
            opcaoPromocao = sc.nextInt();
            if(opcaoPromocao == 5){
                carrinho+=carrinhoPromocao;
            }
            else if(opcaoPromocao==6) {
                menu();
            }
            else if(quantidadeProdutosPromocao==3){
                System.out.println("Seu carrinho de compras já está cheio.");
            }
            else if(opcaoPromocao == 101){
                carrinhoPromocao+=999.99;
                quantidadeProdutosPromocao++;
                quantidade101++;
            }
            else if(opcaoPromocao == 102){
                carrinhoPromocao+=400;
                quantidadeProdutosPromocao++;
                quantidade102++;
            }
            else if(opcaoPromocao == 103){
                carrinhoPromocao+=59.99;
                quantidadeProdutosPromocao++;
                quantidade103++;
            }
            else if(opcaoPromocao == 104) {
                carrinhoPromocao += 89.99;
                quantidadeProdutosPromocao++;
                quantidade104++;
            }
        }

    }
    static int quantidade201=0, quantidade202=0, quantidade203=0;
    static int quantidadeProdutosManutencao=0;
    public static void opcao2() {
        int opcaoManutencao=0;
        double carrinhoManutencao=0.0;
        while (opcaoManutencao!=5) {
            System.out.println("Código 201 - Troca de pneu - R$ 55,99. \n" +
                    "Código 202 - Lavagem completa -R$ 12,99. \n" +
                    "Código 203 - Freio - R$ 10,99. \n" +
                    "4 - Adicionar ao carrinho de compras.\n" +
                    "5  Voltar. ");
            System.out.println("Informe a opção desejada: ");
            opcaoManutencao = sc.nextInt();
            switch (opcaoManutencao) {

                case 201:

                      carrinhoManutencao+=55.99;
                      quantidadeProdutosManutencao++;
                      quantidade201++;


                break;

                case 202:

                    carrinhoManutencao+=12.99;
                    quantidadeProdutosManutencao++;
                    quantidade202++;

                break;

                case 203:

                    carrinhoManutencao+=55.99;
                    quantidadeProdutosManutencao++;
                    quantidade203++;

                break;

                case 4:

                    carrinho+=carrinhoManutencao;

                break;
                case 5:

                    menu();

                break;

            }
        }

    }
    public static void opcao3(){
        int voltar=0;
        if(quantidade101!=0){
            System.out.println(quantidade101+"x Bicicleta nova na cor amarela, aro 26, com 18 marchas por R$ 999.99." );
        }
        if(quantidade102!=0){
            System.out.println(quantidade102+"x Bicicleta usada na cor azul, aro 26, com 18 marchas por R$ 400,00. " );
        }
        if(quantidade103!=0){
            System.out.println(quantidade103+"x Capacete de proteção por R$59.99." );
        }
        if(quantidade104!=0){
            System.out.println(quantidade103+"x Freio a disco por R$ 89,99." );
        }
        if(quantidade201!=0){
            System.out.println(quantidade201+"x Troca de pneu por R$ 55,99. " );
        }
        if(quantidade202!=0){
            System.out.println(quantidade202+"x Lavagem completa por R$ 12,99. " );
        }
        if(quantidade203!=0){
            System.out.println(quantidade203+"x Freio por R$ 10,99. " );
        }
        System.out.println("O valor total a ser pago é de R$"+carrinho);
        System.out.println("1 - Menu");
        voltar = sc.nextInt();
        if(voltar==1){
            menu();
        }
        else{
            opcao3();
        }
    }
    public static void opcao4(){
        int opcaoPagamento=0, quantidadeParcelas;
        double parcelas=0.0;
        System.out.println("Informe a forma de pagamento, sendo 1 para dinheiro" +
                "e 2 para cartão");
        opcaoPagamento = sc.nextInt();
        if(carrinho==0){
            System.out.println("Você não tem nada no carrinho");
            menu();
        }
        else if(opcaoPagamento==1){
            carrinho*=0.90;
            System.out.println("O total a ser pago é de: R$"+carrinho);
        }
        else if(opcaoPagamento==2){
            System.out.println("Informe em quantas vezes você deseja pagar: ");
            quantidadeParcelas = sc.nextInt();
            parcelas=carrinho/quantidadeParcelas;
            System.out.println("O total a ser pago será de "+quantidadeParcelas+" de R$"+parcelas);
        }
    }

}
