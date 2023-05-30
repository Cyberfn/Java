
public class Individual extends TaxPayer{

	private double healthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public double tax(){
		
		double basicTax;
		
	if(getAnualIncome() < 20000) {
		basicTax = getAnualIncome() * 0.15;
	}else {
		basicTax = getAnualIncome() * 0.25;
	}
	return basicTax;
	}
	

}
