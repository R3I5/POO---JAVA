package Aula1.modelo.Servico;

import Aula1.modelo.Pedido;

public class ServicoDeVenda {
    public Pedido vender(Pedido pedido){

        Integer quantidadeDeItens = 0;
        Double valorTotalDoPedido = 0.0;

        for (int i = 0; i < 5; i++  ){
            System.out.print(i);
        }

        int i = 0;
        while(i < 5){
            System.out.print(i);
            i = i + 1;
        }

        int operacao = 1;
        int valorA = 10;
        int valorB = 20;
        int resultado = 0;
        switch (operacao){
            case 1:
                resultado = valorA + valorB;
                break;
        default:
            break;
        }

        return null;
    }
}
