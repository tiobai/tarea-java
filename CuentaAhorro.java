public class CuentaAhorro extends Cuenta {
  boolean estado;
  public CuentaAhorro(float saldo, float tasaAnual){
    super(saldo, tasaAnual);
    this.estado = this.saldo > 10000 ? true : false;
  }
  public void consignar(float cantidad){
    if(estado == true){
      super.agregar(cantidad);
    }
  }
  public void retirarMonto(float retiro){
    if(estado == true){
      super.retirar(retiro);
    }
  }
  public void extractMensual(){
    if(this.numRetiros > 4){
      this.comisionMensual = (this.numRetiros - 4) * 1000;
    }
    super.extractoMensual();
    if(this.saldo < 10000){
      this.estado = false;
    }
  }
  @Override
  public void imprimir(){
    System.out.println("Saldo: $" + this.saldo);
    System.out.println("Comision mensual: $" + this.comisionMensual);
    System.out.println("Número de transacciones: " + (this.numConsignaciones + this.numRetiros));
  }
}

