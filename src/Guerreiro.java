
public class Guerreiro {
	private String nome;
	private int vida;
	private int kill;
	private int death;
	private int assist;
	protected AtaqueStrategy estrategiaParaAtacar;
	protected DefesaStrategy estrategiaParaDefender;
	
	public Guerreiro(String nome, AtaqueStrategy estrategiaAtacar, DefesaStrategy estrategiaDefender) {
		this.nome = nome;
		this.vida = 100;
		this.kill = this.death = this.assist = 0;
		this.estrategiaParaAtacar = estrategiaAtacar;
		this.estrategiaParaDefender = estrategiaDefender;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AtaqueStrategy getEstrategiaParaAtacar() {
		return estrategiaParaAtacar;
	}

	public void setEstrategiaParaAtacar(AtaqueStrategy estrategiaParaAtacar) {
		this.estrategiaParaAtacar = estrategiaParaAtacar;
	}

	public DefesaStrategy getEstrategiaParaDefender() {
		return estrategiaParaDefender;
	}

	public void setEstrategiaParaDefender(DefesaStrategy estrategiaParaDefender) {
		this.estrategiaParaDefender = estrategiaParaDefender;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getKill() {
		return kill;
	}

	public void setKill(int kill) {
		this.kill = kill;
	}

	public int getDeath() {
		return death;
	}

	public void setDeath(int death) {
		this.death = death;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}
}
