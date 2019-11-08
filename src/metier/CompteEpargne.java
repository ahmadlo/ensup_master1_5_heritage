package metier;

public class CompteEpargne extends Compte {

	private float taux;
	
	public CompteEpargne(int id, float solde, float taux) {
		super(id, solde);
		// TODO Auto-generated constructor stub
	}
	
	
	public float getTaux() {
		return taux;
	}
	
	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", solde=" + solde + ", getId()=" + getId() + "]";
	}


	public float calculInteret(int taux) {
		return (solde*taux)/100;
	}

}
