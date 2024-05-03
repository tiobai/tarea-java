
public class CuentaCorriente extends Cuenta {
  float sobreGiro = 0.0f;
  public CuentaCorriente(float saldo, float tasaAnual){
    super(saldo, tasaAnual);
  }
  public void consignar(float cantidad){
    if(sobreGiro < cantidad){
      this.sobreGiro = 0;
      cantidad -= this.sobreGiro;
    }else{
      this.sobreGiro = this.sobreGiro - cantidad;
      cantidad = 0;
    }
    this.saldo += cantidad;
  }
  @Override
  public void retirar(float retiro){
    if(this.saldo < retiro){
      this.sobreGiro = this.saldo - retiro;
      this.saldo = 0;
    }else{
      this.saldo = this.saldo - retiro;
    }
  }
  public void extractoMensual(){
    super.extractoMensual();
  }
  @Override
  public void imprimir(){
    System.out.println("Saldo: $" + this.saldo);
    System.out.println("Comision mensual: $" + this.comisionMensual);
    System.out.println("Número de transacciones: " + (this.numConsignaciones + this.numRetiros));
    System.out.println("Valor de sobregiro: " + this.sobreGiro);
  }
}

