package Tp1;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	//para calcular el perimetro->2pi*radio.
	//para calcular el area->pi*r^2.
	
	public Disco (Double radioInterior, Double radioExterior){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public Double calculaPerimetroInterior(){
		Double perimetroInterior = 2 * Math.PI * radioInterior;
		return perimetroInterior;
	}
	
	public Double calculafPerimetroExterior(){
		Double perimetroExterior = 2 * Math.PI * radioExterior;
		return perimetroExterior;
	}
	
	public Double calculaSuperficie(){
		Double superficie = Math.PI * (Math.pow(radioExterior,2) - Math.pow(radioInterior, 2));
		return superficie;
	}
	
	public Double getRadioInterior() {
		return radioInterior;
	}
	public Double getRadioExterior() {
		return radioExterior;
	}
	
	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	
	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
}
