/*
1. Modele uma conta. Uma conta bancária mesmo.
A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes.
Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular (String), 
o número (int), a agência (String), o saldo (double) e uma data de abertura (String). 
Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do saldo; deposita, 
para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento mensal dessa conta.
Essa atividade deve ser entregue de forma gráfica. Pode utilizar qualquer ferramenta que ache interessante.

2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o main.
Você deve criar a classe da conta com o nome Conta , mas pode nomear como quiser a classe de testes, 
por exemplo pode chamá-la TestaConta , contudo, ela deve necessariamente possuir o método main.
*/


import java.util.*;
public class Conta {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
		sc.useLocale(Locale.US);

        int Saldo = 500;
        int DataDaAbertura = 15112012;

        System.out.println("Olá, esse é o banco Pipipipopopo \n");
        System.out.println("Informe o número da sua conta para darmos seguimento no seu processo \n");

        int NConta = sc.nextInt(); 
        if (NConta == 123456789 ){
            System.out.print("Correto, seguiremos\n");
            System.out.print("Agora a sua agência\n");
            int Agencia = sc.nextInt();
            if (Agencia == 9900){
                System.out.println("Certo, vamos para a proxima etapa \n");
                System.out.println("Escolha o que voce ira fazer, digite 1 para ver o saldo, 2 para ver a data de abertura da sua conta e 3 para retirar dinheiro\n");
                int acao = sc.nextInt();
                if (acao == 1){
                    System.out.println("O seu saldo é de " + Saldo);
                }
                else if (acao == 2){
                    System.out.println("A data de abertura da sua conta foi no dia "+ DataDaAbertura);
                }else {
                    System.out.println("Informe quanto você gostaria de retirar\n");
                    int n1 = sc.nextInt();
                    if(n1 > Saldo){
                    System.out.println("Você não pode retir mais que o próprio crédito");
                    return;
                    }
                    else{
                       int total = (Saldo - n1);
                       System.out.println("Dinheiro retirado com sucesso, restam " + total + " em sua conta");
                    }
                }

            }else{
                    System.out.print("Os dados foram distoantes, verifique novamente");
            return;
            }

        }
        else{
            System.out.print("Os dados foram distoantes, verifique novamente");
            return;
        }
    
        
    
}
}