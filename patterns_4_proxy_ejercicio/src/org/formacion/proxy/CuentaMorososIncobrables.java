package org.formacion.proxy;

public class CuentaMorososIncobrables implements Cuenta {
    private Cuenta cuenta;

    public CuentaMorososIncobrables(Cuenta cuenta){
        this.cuenta = cuenta;
    }

    @Override public String getCliente() {
       return cuenta.getCliente();
    }

    @Override public int getCantidad() {
        return cuenta.getCantidad();
    }

    @Override public void movimiento(int importe) {
        if(cuenta.getCantidad() + importe >= 0){
            cuenta.movimiento(importe);
        }
    }
}
