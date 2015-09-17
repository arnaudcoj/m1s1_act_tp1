package comparaisons;

public class FonctionsReference {

	private int[] sizes;

    
	public FonctionsReference(int[] sizes) {
		this.sizes = sizes;
	}
    
	
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] puissance (double pow) {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++)
			values[idx] = Math.pow(this.sizes[idx], pow);
		
		return values;
	}
    
	
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] logarithme () {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++)
		    values[idx] = Math.log(this.sizes[idx]);
		
		return values;
	}
	
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] nlogn () {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++) {
		    double n = this.sizes[idx];
		    values[idx] = n * Math.log(n);
		}
		
		return values;
	}

	
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] expn () {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++) {
		    double n = this.sizes[idx];
		    values[idx] = Math.exp(n);
		}
		
		return values;
	}
    
	
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] kpown (double k) {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++) {
		    double n = this.sizes[idx];
		    values[idx] = Math.pow(k,n);
		}
		
		return values;
	}

    
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] nfact () {
	    double[] values = new double[this.sizes.length];
	    double[] factValues = new double[this.sizes[this.sizes.length -1] +1];
	    factValues[0] = 1;
	    factValues[1] = 1;
	    for(int i = 2; i < factValues.length; i++) {
		factValues[i] = i * factValues[i - 1];
	    }
	    
	    for (int idx=0 ; idx<this.sizes.length ; idx++) {
		double n = this.sizes[idx];
		values[idx] = factValues[(int) n];
	    }
	    
	    return values;
	}

    
	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] npown () {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++) {
		    double n = this.sizes[idx];
		    values[idx] = Math.pow(n,n);
		}
		
		return values;
	}


    //1.3

	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] log_n_by_n_pow_e (double epsilon) {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++) {
		    double n = this.sizes[idx];
		    values[idx] = Math.logarithme(n) / Math.pow(n,epsilon);
		}
		
		return values;
	}
    

	/**
	 * Retourne le tableau de toutes les valeurs de n^pow pour tous
	 * les n présents dans this.sizes.
	 * @param pow puissance
	 * @return tableau des résultats
	 */
	public double[] n_pow_k_by_2_pow_n (double k) {
		double[] values = new double[this.sizes.length];
		
		for (int idx=0 ; idx<this.sizes.length ; idx++) {
		    double n = this.sizes[idx];
		    values[idx] = Math.pow(n,k) / Math.pow(2,n);
		}
		
		return values;
	}

    
}
