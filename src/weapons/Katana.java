package weapons;
import characters.Guerreiro;
import strategies.AtaqueStrategy;

public class Katana implements AtaqueStrategy {

	@Override
	public void atacar(Guerreiro oponente) {
		oponente.setVida(oponente.getVida() - (25 - oponente.getEstrategiaParaDefender().defender()));
		
	}

}
