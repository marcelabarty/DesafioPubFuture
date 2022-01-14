import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


   Receitas receita = new Receitas();
   Despesas despesas = new Despesas();
   Conta c = new Conta();

    while (true) {
      try {
        String line = scanner.nextLine();
        System.out.println("$" + line);
        String ui[] = line.split(" ");
        if (line.equals("end")) {
          break;
        } 
        else if (ui[0].equals("mostraReceita")) {//Lista todas as receitas
          System.out.println(receita);
        } else if (ui[0].equals("addReceita")){// Cadastro

          String opcao = "";
          float valor = 0;
          System.out.println("Vc ja possui uma conta?");
          opcao = scanner.nextLine();

          if(opcao.equals("sim")){
          System.out.printf("Digite a conta: ");
          String conta = scanner.nextLine();
          System.out.printf("Digite o valor: ");
          valor = scanner.nextFloat();
          String espaço = scanner.nextLine();
          System.out.printf("Digite a Descriçao: ");
          String Descricao = scanner.nextLine();
          System.out.printf("Digite o tipo de receita: ");
          String tipo = scanner.nextLine();
          System.out.printf("Digite a data de recebimento: ");
          String dataR = scanner.nextLine();
          System.out.printf("Digite a data de recebimento esperado: ");
          String dataRE = scanner.nextLine();
          System.out.println("Cadastro Realizado!");
          receita.addReceita(new Receitas(conta, valor,Descricao,tipo,dataR,dataRE));
          }
          else if(opcao.equals("nao") || opcao.equals("nao")){
            System.out.println("Criando conta");
            System.out.printf("Digite o tipo da conta: ");
            String tipo = scanner.nextLine();
            System.out.printf("Digite a instituiçao fincanceira: ");
            String ins = scanner.nextLine();

            System.out.println("Conta cadastrada com sucesso inicie a nova receita");
            receita.addConta(new Conta(tipo,ins,valor));
          }
        } else if (ui[0].equals("editReceita")){ // indice e novo valor a ser setado
          int opcao = 0;
          System.out.println("\nEscolha uma opçao para editar:\n1)Conta\n2)dataRecebimento\n3)dataRecebimentoEsperado\n4)Descriçao\n5)tipoReceita\n6)Valor\n");
          opcao = scanner.nextInt();

          System.out.println("Digite o indice da receita e o novo valor\n");
          System.out.println(receita);
          int indice = scanner.nextInt();
          String s = "";
          float valor = 1;
          if(opcao != 6){
            s = scanner.nextLine();
          }else{
            valor = scanner.nextFloat();
            String espaço = scanner.nextLine();
          }
          System.out.println("Valor alterado com sucesso!");
          
          if(opcao == 1){
            receita.setConta(indice, s);
          }
          else if(opcao == 2){
            receita.setDataRecebimento(indice,s);
          }
          else if(opcao == 3){
            receita.setDataRecebimentoEsperado(indice,s);
          }
          else if(opcao == 4){
            receita.setDescricao(indice, s);
          }
          else if(opcao == 5){
            receita.setTipo(indice, s);
          }
          else if(opcao == 6){
            receita.setValor(indice,valor);
          }

        } else if (ui[0].equals("removeReceita")){// accountId value
          System.out.println("Insira o indice para remover");
          System.out.println(receita);
          String remo = scanner.nextLine();
          System.out.println("Receita removida com sucesso");
          receita.removeReceita(Integer.parseInt(remo));
        } else if (ui[0].equals("tipoReceita")) {// filtra pelo tipo da conta
          System.out.println("Insira o tipo");
          System.out.println(receita);
          String remo = scanner.nextLine();
          receita.search(remo);
        } else if (ui[0].equals("addDespesa")) {
          System.out.printf("Digite a conta: ");
          String conta = scanner.nextLine();
          System.out.printf("Digite o valor: ");
          Float valor = scanner.nextFloat();
          String espaço = scanner.nextLine();
          System.out.printf("Digite o tipo de despesa: ");
          String tipoDespesa = scanner.nextLine();
          System.out.printf("Digite a data do pagamento: ");
          String dataP = scanner.nextLine();
          System.out.printf("Digite a data do pagamento esperado: ");
          String dataPE = scanner.nextLine();
          System.out.println("Cadastro Realizado!");
          receita.Despesas(new Despesas(conta, valor,tipoDespesa,dataP,dataPE));
          despesas.addDespesas(new Despesas(conta, valor,tipoDespesa,dataP,dataPE));
        }else if(ui[0].equals("editDespesas")) {
          int opcao = 0;
          System.out.println("\nEscolha uma opçao para editar:\n1)Conta\n2)dataPagamento\n3)dataPagamentoEsperado\n4)tipoDespesa\n5)Valor\n");
          opcao = scanner.nextInt();

          System.out.println("Digite o indice da despesa e o novo valor separados por espaço");
          System.out.println(despesas);
          int indice = scanner.nextInt();
          String s = "";
          float valor = 1;
          if(opcao != 5){
            s = scanner.nextLine();
          }else{
            valor = scanner.nextFloat();
            String espaço = scanner.nextLine();
          }
          System.out.println("Valor alterado com sucesso!");
          
          if(opcao == 1){
            despesas.setConta(indice, s);
          }
          else if(opcao == 2){
            despesas.setdataPagamento(indice,s);
          }
          else if(opcao == 3){
            despesas.setdataPagamentoEsperado(indice,s);
          }
          else if(opcao == 4){
            despesas.setTipo(indice, s);
          }
          else if(opcao == 5){
            despesas.setValor(indice, valor);
          }

        }else if(ui[0].equals("mostraDespesa")){//lista todas as despesas
          System.out.println(despesas);
        }
        else if(ui[0].equals("tipoDespesa")){//lista todas as despesas
          System.out.println("Insira o tipo");
          String remo = scanner.nextLine();
          despesas.search(remo);
          
        }
        
        else if(ui[0].equals("removeDespesa")){//removeDespesas
          System.out.println("Por favor inserir o indice da despesa");
          System.out.println(despesas);
          int ind = scanner.nextInt();
          System.out.println("Despesa removida com sucesso");
          despesas.removeDespesas(ind);
        } 
        
        else if(ui[0].equals("addConta")){//lista todas as conta
          System.out.println("Criando conta");
            System.out.printf("Digite o tipo da conta: ");
            String tipo = scanner.nextLine();
            System.out.printf("Digite a instituiçao financeira: ");
            String ins = scanner.nextLine();

            System.out.println("Conta cadastrada com sucesso inicie a nova receita");
            receita.addConta(new Conta(tipo,ins,0));
         
        }
        else if(ui[0].equals("editConta")){//lista todas as conta
          int opcao = 0;
          opcao = scanner.nextInt();

          System.out.println("Digite o indice da conta e o novo valor separados por espaço");
          receita.ListaConta();
          int indice = scanner.nextInt();
          String s = "";
          float valor = 1;
          if(opcao != 1){
            s = scanner.nextLine();
          }else{
            valor = scanner.nextFloat();
            String espaço = scanner.nextLine();
          }
          System.out.println("Valor alterado com sucesso!");
          
          if(opcao == 1){
            receita.getConta().get(indice).setSaldo(valor);
          }
          else if(opcao == 2){
            receita.getConta().get(indice).setConta(s);
          }
          else if(opcao == 3){
            receita.getConta().get(indice).setInst(s);
          }

        }
        
        else if(ui[0].equals("removeConta")){//lista todas as conta
          System.out.println("Por favor inserir o indice da conta para remover");
          receita.ListaConta();
          int ind = scanner.nextInt();
          String espaço = scanner.nextLine();
          System.out.println("Conta removida com sucesso");
          receita.getConta().get(ind).removeConta(ind,receita.getConta());
        }
        else if(ui[0].equals("mostraSaldo")){//lista todas as conta
          receita.MostraSaldo();
        }
        else if(ui[0].equals("listaConta")){//lista todas as conta
          receita.ListaConta();
        }
        else if(ui[0].equals("transf")){//lista todas as conta
          System.out.printf("Insira o indice da conta que retirar o valor: ");
          int sai = scanner.nextInt();
          System.out.printf("Insira o indice da conta que receber o valor: ");
          int entra = scanner.nextInt();
          System.out.printf("Insira o valor: ");
          float valor = scanner.nextFloat();
          String espaço = scanner.nextLine();

          System.out.println("Transferencia realizada");
          valor *= -1;
          receita.getConta().get(sai).setSaldo(valor);
          valor *= -1;
          c.transferir(entra,receita.getConta(),valor);
        }
        else {
          System.out.println("fail: comando invalido");
        }
      } catch (Exception ae) {
        System.out.println(ae.getMessage());
      }
    }
    scanner.close();
    
  }
}









