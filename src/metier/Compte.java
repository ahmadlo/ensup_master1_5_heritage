package metier;

public class Compte {
	private int id;
	protected float solde;
	
	public Compte(int id, float solde) {
//		super();
		this.id = id;
		this.solde = solde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + "]";
	}
	
	public float verser(float mt) {
		if (mt>0) {
			solde+=mt;
		}
		return solde;
	}
	
	public float retirer(float mt) {
		if(mt>0 && (mt<=solde)) {
			solde-=mt;
		}
		return solde;
	}
}
