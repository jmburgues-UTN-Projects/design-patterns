package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	private final BaseDatos baseDatos;
	private final Logger logger;

	public LoggerDecorator(BaseDatos baseDatos, Logger logger){
		this.baseDatos = baseDatos;
		this.logger = logger;
	}

	@Override
	public void inserta(String registro) {
		this.logger.add("inserta " + registro);
		this.baseDatos.inserta(registro);
	}

	@Override
	public List<String> registros() {
		this.logger.add("lectura");
		return this.baseDatos.registros();
	}

	

}
