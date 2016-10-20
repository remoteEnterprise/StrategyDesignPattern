
public class Alabarda implements AtaqueStrategy {

	@Override
	public void atacar(Guerreiro oponente) {
		oponente.setVida(oponente.getVida() - (30 - oponente.getEstrategiaParaDefender().defender()));		
	}

}
