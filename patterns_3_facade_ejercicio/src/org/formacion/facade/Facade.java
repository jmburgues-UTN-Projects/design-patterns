package org.formacion.facade;

public class Facade {
    private ServicioComunicacion servicioComunicacion;
    private ServicioFidelizacion servicioFidelizacion;
    private ServicioConfiguracion servicioConfiguracion;

    public Facade(ServicioComunicacion servicioComunicacion, ServicioFidelizacion servicioFidelizacion,
            ServicioConfiguracion servicioConfiguracion) {
        this.servicioComunicacion = servicioComunicacion;
        this.servicioFidelizacion = servicioFidelizacion;
        this.servicioConfiguracion = servicioConfiguracion;
    }

    public void registroExpress(String nombreCliente, String emailCliente){
        servicioFidelizacion.crearTarjeta(nombreCliente, ServicioFidelizacion.Tipo.BASICA);
        servicioConfiguracion.addEmail(nombreCliente, emailCliente);
        PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
        servicioComunicacion.setPreferencias(nombreCliente, preferencias);
    }
}
