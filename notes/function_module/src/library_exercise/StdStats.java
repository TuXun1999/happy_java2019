package library_exercise;

public class StdStats {
	/*
	 * Create a library inside a class (no need to add main())
	 */
	static double max(double[] a){
		double maximum = a[0];
		for(int i = 0; i < a.length;  i++){
			if(a[i] >= maximum)
				maximum = a[i];
		}
		return maximum;
	}
	
	static double min(double[] a){
		double minimum = a[0];
		for(int i = 0; i < a.length; i ++){
			if(a[i] <= minimum){
				minimum = a[i];
			}
		}
		return minimum;
	}
	
	static double mean(double[] a){
		double sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return (sum/(a.length));
	}
	
	static double var(double[] a){
		double sum = 0;
		double avg = mean(a);
		for(int i = 0; i < a.length ; i ++){
			sum += (a[i] - avg) * (a[i] - avg);
		}
		return (sum/(a.length - 1));
	}
	
	static double stddev(double[] a){
		return (Math.sqrt(var(a)));
	}
}
