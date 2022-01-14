import java.util.ArrayList;

class Conta{
  private float saldo;
  private String tipoConta;
  private String instituicaoFinanceira;

  Conta(){

  }
  Conta(String tipo,String insti, float saldo){
    this.saldo += saldo;
    this.tipoConta = tipo;
    this.instituicaoFinanceira = insti;
  }
  public String getConta(){
    return tipoConta;
  }
  public void setConta(String tipoConta){
    this.tipoConta = tipoConta;
  }

  public void removeConta(int i,ArrayList<Conta> c){
    c.remove(i);
  }
  public float getSaldo(){
    return saldo;
  }
  public void setSaldo(float valor){
      this.saldo += valor;

  }
  public String getInst(){
    return instituicaoFinanceira;
  }
  public void setInst(String valor){
    this.instituicaoFinanceira = valor;
  }
  public void transferir(int ind,ArrayList<Conta> a,float valor){
    a.get(ind).setSaldo(valor);
  }
  public float mostraSaldo(){
    return saldo;
  }
  public String toString(){
    String resultado = "Saldo: "+saldo+"\ntipoConta: "+tipoConta+"\nInstituiçao Financeira: "+instituicaoFinanceira;
    return resultado;
  }
}