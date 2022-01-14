import java.util.ArrayList;
import java.util.List;

class Receitas{
private float valor;
private String dataRecebimento;
private String dataRecebimentoEsperado;
private String descricao;
private String Conta;
private String tipoReceita;

private List<Receitas> receitas = new ArrayList<>();
private ArrayList<Conta> contas = new ArrayList<>();

Despesas d = new Despesas();

Receitas(){//construtor vazio
  
}

Receitas(String conta,float valor,String descricao,String tipo,String dataRecebimento,String dataRecebimentoEsperado){
  this.Conta = conta;
  this.valor = valor;
  this.descricao = descricao;
  this.tipoReceita = tipo;
  this.dataRecebimento = dataRecebimento;
  this.dataRecebimentoEsperado = dataRecebimentoEsperado;

}
public void addReceita(Receitas r){//adiciona receitas
  receitas.add(r);
  
  for(int i = 0; i < receitas.size();i++){
    if(receitas.get(i).Conta.equals(r.Conta)){
      contas.get(i).setSaldo(r.valor);
      break;
    }
  }
}
public void Despesas(Despesas de){
  for(int i = 0; i < contas.size();i++){
    float valor = de.getValor();
    valor *= -1;
    if(contas.get(i).getConta().equals(de.getConta())){
      contas.get(i).setSaldo(valor);
    }
  }
}
public void setValor(int indice,float valor){//edita valor
  if(!receitas.get(indice).equals(null)){
    receitas.get(indice).valor = valor;
}else System.out.println("valor nao existe");
}
public void setDataRecebimento(int indice,String valor){//edita data de recebimento
  if(!receitas.get(indice).equals(null)){
    receitas.get(indice).dataRecebimento = valor;
}else System.out.println("valor nao existe");
}
public void setDataRecebimentoEsperado(int indice,String valor){//edita data de recebimento esperado
  if(!receitas.get(indice).equals(null)){
    receitas.get(indice).dataRecebimentoEsperado = valor;
}else System.out.println("valor nao existe");
}
public void setDescricao(int indice,String valor){//edita descricao
  if(!receitas.get(indice).equals(null)){
    receitas.get(indice).descricao = valor;
}else System.out.println("valor nao existe");
}
public void setTipo(int indice,String valor){//edita tipo
  if(!receitas.get(indice).equals(null)){
    receitas.get(indice).tipoReceita = valor;
}else System.out.println("valor nao existe");
}
public void setConta(int indice,String valor){//edita conta
  if(!receitas.get(indice).equals(null)){
    receitas.get(indice).Conta = valor;
}else System.out.println("valor nao existe");
}
public List<Receitas> getReceita(){//Retorn o array receitas
  return receitas;
}
public void removeReceita(int indice){//Remove receita
  if(!receitas.get(indice).equals(null)){
    receitas.remove(indice);
  }
}
public void search(String tipo){//Filtra pelo tipo de receita
  for(int i = 0; i < receitas.size();i++){
    if(receitas.get(i) != null)
      if(receitas.get(i).tipoReceita.equals(tipo)){
        System.out.println("["+i+"]Conta: "+receitas.get(i).Conta+"\nvalor: "+receitas.get(i).valor+"\nDescriçao: "+receitas.get(i).descricao+"\ntipoReceita: "+receitas.get(i).tipoReceita+"\nDataRecebimento: "+receitas.get(i).dataRecebimento+"\nDataRecebimentoEsperado: "+receitas.get(i).dataRecebimentoEsperado+"\nConta:"+receitas.get(i).Conta);
      }
  }
}
public void addConta(Conta c){
  contas.add(c);
}
public void MostraSaldo(){
  float saldo = 0;
  for(int i = 0; i < contas.size();i++){
    saldo += contas.get(i).getSaldo();
  }
  System.out.println("Saldo total: "+saldo);
}
public ArrayList<Conta> getConta(){
  return contas;
}
public void ListaConta(){
  for(int i = 0; i < contas.size(); i++){
    System.out.println("["+i+"] "+contas.get(i));
  }
}

public String toString(){
  String resultado = "Receitas:\n";
  for(int i = 0; i < receitas.size();i++){
    resultado += "["+i+"] Conta: "+receitas.get(i).Conta+"\nvalor: "+receitas.get(i).valor;
    resultado += "\nDescriçao: "+receitas.get(i).descricao+"\ntipoReceita: "+receitas.get(i).tipoReceita+"\nDataRecebimento: "+receitas.get(i).dataRecebimento;
    resultado += "\nDataRecebimentoEsperado: "+receitas.get(i).dataRecebimentoEsperado;
    resultado +="\n\n"; 
  }
  return resultado;
}
}