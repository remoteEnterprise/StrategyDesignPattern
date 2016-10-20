package magics;
import characters.Guerreiro;
import strategies.MagiaStrategy;

public class MagiaFireball implements MagiaStrategy {

	@Override
	public void lancarMagia(Guerreiro oponente) {
		oponente.setVida(oponente.getVida()-20);
	}
}
