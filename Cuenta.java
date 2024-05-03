public class Cuenta {
  protected float saldo;
  protected int numConsignaciones = 0;
  protected int numRetiros = 0;
  protected float tasaAnual;
  protected float comisionMensual = 0.0f;
  public Cuenta(float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
  }
  public void agregar(float saldo){
    this.saldo = this.saldo + saldo;
    this.numConsignaciones += 1;
  }
  public void retirar(float retiro){
    if(this.saldo > retiro){
      this.saldo = this.saldo - retiro;
      this.numRetiros += 1;
    }else{
      System.out.println("error! : saldo insuficiente");
    }
  }
  public void calcular(){
    this.comisionMensual = saldo * (this.tasaAnual * 12);
  }
  public void extractoMensual(){
    calcular();
    this.saldo = this.saldo - this.comisionMensual;
  }
  public void imprimir(){
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Número de consignaciones: " + this.numConsignaciones);
    System.out.println("Número de retiros: " + this.numRetiros);
    System.out.println("Tasa anual: " + this.tasaAnual);
    System.out.println("Comision mensual: " + this.comisionMensual);
  }
}
