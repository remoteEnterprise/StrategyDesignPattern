
public class Machado implements AtaqueStrategy {
	
	@Override
	public void atacar(Guerreiro oponente) {
		oponente.setVida(oponente.getVida() - (40 - oponente.getEstrategiaParaDefender().defender()));
	} //40 É O DANO DO MACHADO

}
