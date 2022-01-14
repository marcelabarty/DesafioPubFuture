import java.util.ArrayList;
import java.util.List;

class Despesas{
  private float valor;
  private String dataPagamento;
  private String dataPagamentoEsperado;
  private String tipoDespesa;
  private String Conta;

  List<Despesas> despesas = new ArrayList<>();
  Receitas receitas;
  
  Despesas(){

  }//Contrutor vazio

  Despesas(String conta, float valor, String tipoDespesa, String dataPagamento, String dataPagamentoEsperado){

    this.valor = valor;
    this.dataPagamento = dataPagamento;
    this.dataPagamentoEsperado = dataPagamentoEsperado;
    this.tipoDespesa = tipoDespesa;
    this.Conta = conta;
    
  }
  public void addDespesas(Despesas d){//Adiciona despesas
    despesas.add(d);
  }

  public void setValor(int indice,float valor){//edita valor
  if(!despesas.get(indice).equals(null)){
    despesas.get(indice).valor = valor;
}else System.out.println("indice nao existe");
}
public void setdataPagamento(int indice,String valor){//edita data de pagamento
  if(!despesas.get(indice).equals(null)){
    despesas.get(indice).dataPagamento = valor;
}else System.out.println("indice nao existe");
}
public void setdataPagamentoEsperado(int indice,String valor){//edita data de pagamento esperado
  if(!despesas.get(indice).equals(null)){
    despesas.get(indice).dataPagamentoEsperado = valor;
}else System.out.println("indice nao existe");
}
public void setTipo(int indice,String valor){//edita tipo de despesa
  if(!despesas.get(indice).equals(null)){
    despesas.get(indice).tipoDespesa = valor;
}else System.out.println("indice nao existe");
}
public void setConta(int indice,String valor){//edita conta
  if(!despesas.get(indice).equals(null)){
    despesas.get(indice).Conta = valor;
}else System.out.println("indice nao existe");
}
public void search(String tipo){
  for(int i = 0; i < despesas.size();i++){
    if(despesas.get(i) != null)
      if(despesas.get(i).tipoDespesa.equals(tipo)){
        System.out.println("["+i+"] Conta: "+despesas.get(i).Conta+"\nValor: "+despesas.get(i).valor+"\nTipo de despesa: "+despesas.get(i).tipoDespesa+"\ndataPagamento: "+despesas.get(i).dataPagamento+ "\ndataPagamentoEsperado: "+despesas.get(i).dataPagamentoEsperado);
      }
  }
}
public float getValor(){
  return valor;
}
public String getConta(){
  return Conta;
}
public void removeDespesas(int ind){
    despesas.remove(ind);
  }
  public String toString(){
  String resultado = "Despesas:\n";
  for(int i = 0; i < despesas.size();i++){
    resultado += "["+i+"] Conta: "+despesas.get(i).Conta+"\nValor: "+despesas.get(i).valor;
    resultado += "\nTipo de despesa: "+despesas.get(i).tipoDespesa+"\ndataPagamento: "+despesas.get(i).dataPagamento+ "\ndataPagamentoEsperado: "+despesas.get(i).dataPagamentoEsperado;
  }
  return resultado;
}
  }
