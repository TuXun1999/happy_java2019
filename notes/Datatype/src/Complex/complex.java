package Complex;

public class complex {
	double Re;
	double Im;
	
	
	double length;
	double angle;

	
	
	public complex(double Re, double Im){
		this.Re = Re;
		this.Im = Im;
		this.length = Math.sqrt(Re*Re + Im* Im);
		this.angle = Math.atan(Im/Re);
	}
	
	public String toString(){
		String res; 
		if (Im != 0)
			res = Re + " + " + Im + "i";
		else{
			res = "" + Re;
		}
		return res;
	}
	
	public complex plus(complex ano){
		complex res = new complex(Re + ano.Re, Im + ano.Im);
		return res;
	}
	
	public complex times(complex b){
		double re = Re * b.Re - Im * b.Im;
		double im = Re * b.Im + Im * b.Re;
		complex res = new complex(re, im);
		return res;
	}
	
	public double abs(){
		return (length);
	}
	
	public double re(){
		return Re;
	}
	
	public double im(){
		return Im;
	}

}
