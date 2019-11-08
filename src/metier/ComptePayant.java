package metier;

public class ComptePayant extends Compte {
	
	private double frais;
	
	public ComptePayant(int id, float solde, double frais) {
		super(id, solde);
		// TODO Auto-generated constructor stub
	}
	
	

	public double getFrais() {
		return frais;
	}



	public void setFrais(double frais) {
		this.frais = frais;
	}



	@Override
	public float verser(float mt) {
		if(mt>0) {
			solde+=mt*(1-frais/100);
		}
		return solde;
	}


	@Override
	public String toString() {
		return "ComptePayant [frais=" + frais + ", solde=" + solde + ", getId()=" + getId() + "]";
	}
	

}
