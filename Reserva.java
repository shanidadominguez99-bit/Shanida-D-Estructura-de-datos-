public class Reserva {
	// Atributos
	private String codigoVuelo;
	private String numeroAsiento;
	private String nombrePasajero;
	private double descuentoFidelidad;
	private boolean incluyeEquipajeExtra;

	// a) Constructor Básico (pasajero anónimo)
	public Reserva(String codigoVuelo, String numeroAsiento) {
		this.codigoVuelo = codigoVuelo;
		this.numeroAsiento = numeroAsiento;
		this.nombrePasajero = "Anónimo";
		this.descuentoFidelidad = 0.0;
		this.incluyeEquipajeExtra = false;
	}

	// b) Constructor Estándar
	public Reserva(String codigoVuelo, String numeroAsiento, String nombrePasajero) {
		this.codigoVuelo = codigoVuelo;
		this.numeroAsiento = numeroAsiento;
		this.nombrePasajero = nombrePasajero;
		this.descuentoFidelidad = 0.0;
		this.incluyeEquipajeExtra = false;
	}

	// c) Constructor VIP
	public Reserva(String codigoVuelo, String numeroAsiento, String nombrePasajero,
	               double descuentoFidelidad, boolean incluyeEquipajeExtra) {
		this.codigoVuelo = codigoVuelo;
		this.numeroAsiento = numeroAsiento;
		this.nombrePasajero = nombrePasajero;
		this.descuentoFidelidad = descuentoFidelidad;
		this.incluyeEquipajeExtra = incluyeEquipajeExtra;
	}

	// Método a) - Tarifa base
	public double calcularPrecio() {
		return 100.00;
	}

	// Método b) - Tarifa personalizada
	public double calcularPrecio(double tarifaBase) {
		return tarifaBase;
	}

	// Método c) - Tarifa con descuento y equipaje extra
	public double calcularPrecio(double tarifaBase, double descuento) {
		double precio = tarifaBase - (tarifaBase * descuento / 100);
		if (incluyeEquipajeExtra) {
			precio += 30.00;
		}
		return precio;
	}

	// Métodos getter para mostrar información
	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public String getNombrePasajero() {
		return nombrePasajero;
	}

	public boolean isIncluyeEquipajeExtra() {
		return incluyeEquipajeExtra;
	}

	public double getDescuentoFidelidad() {
		return descuentoFidelidad;
	}
}