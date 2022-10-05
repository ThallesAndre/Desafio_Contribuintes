package entities;

public class TaxPayer {

	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
	
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(Double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		if (getSalaryIncome()<30000) {
			return 0;
		}
		else
			if(getSalaryIncome()<50000) {
				return salaryIncome * 0.1;
			}
			else {
				return salaryIncome * 0.2;
			}
	}
    public double servicesTax() {
    	if (getServiceIncome() != 0) {
    		return serviceIncome * 0.15;
    	}
    	else {
    		return 0;
    	}
		
	}
    public double capitalTax() {
		if (getCapitalIncome() !=0 ) {
			return capitalIncome * 0.2;
		}
		else {
			return 0;
		}
	}
    public double grossTax() {
		
    	return salaryTax()+servicesTax()+capitalTax();
	}
    public double taxRebate() {
		if ((healthSpending+educationSpending)< (grossTax()*0.3)) {
			return healthSpending+educationSpending;
		}
		else {
			return grossTax()*0.3;
		}
	}
    public double netTax() {
		return grossTax()-taxRebate();
	}
	
    public String toString() {
		return  String.format("Resumo do contribuinte: %n" ) +
				String.format("Imposto bruto total: %.2f%n", grossTax() ) 
		       +String.format("Abatimento: %.2f%n", taxRebate())+
		        String.format("Imposto devido:%.2f%n", netTax());

	}
	
	
}
