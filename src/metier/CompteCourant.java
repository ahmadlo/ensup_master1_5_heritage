package metier;

public class CompteCourant extends Compte {
	
	private float decouvert;

	public CompteCourant(int id, float solde, float decouvert) {
		super(id, solde);
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + ", solde=" + solde + ", getId()=" + getId() + "]";
	}

	@Override
	public float retirer(float mt) {
		super.solde-=mt;
		return super.solde;
	}

}
