import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Guerreiro um = new Guerreiro("Um", new Katana(), new ArmaduraTitanio(), null);
		Guerreiro dois = new Guerreiro("Dois", new Machado(), new SemArmadura(), new MagiaFireball());
		Guerreiro tres = new Guerreiro("Tres", new Alabarda(), new ArmaduraLoriga(), null);
		Random gerador = new Random();
		boolean umAtaca = gerador.nextBoolean();
		boolean doisAtaca = gerador.nextBoolean();
		boolean tresAtaca = gerador.nextBoolean();
		boolean umAtacaDois = gerador.nextBoolean();
		boolean doisAtacaUm = gerador.nextBoolean();
		boolean tresAtacaUm = gerador.nextBoolean();
		
		int battles = 100;
		while(battles-- > 0) {
			um.setVida(100);
			dois.setVida(100);
			tres.setVida(100);
			while(um.getVida() >= 0 && dois.getVida() >= 0 && tres.getVida() >= 0) {
				if(umAtaca) {
					if(umAtacaDois) {
						um.getEstrategiaParaAtacar().atacar(dois);
						if(dois.getVida() <= 0) {
							um.setKill(um.getKill()+1);
							dois.setDeath(dois.getDeath()+1);
						}
					} else {
						um.getEstrategiaParaAtacar().atacar(tres);
						if(tres.getVida() <= 0) {
							um.setKill(um.getKill()+1);
							tres.setDeath(tres.getDeath()+1);
						}
					}
				}
				
				if(doisAtaca) {
					if(doisAtacaUm) {
						dois.getEstrategiaParaAtacar().atacar(um);
						dois.estrategiaLancarMagia.lancarMagia(um);
						if(um.getVida() <= 0) {
							dois.setKill(dois.getKill()+1);
							um.setDeath(um.getDeath()+1);
						}
					} else {
						dois.getEstrategiaParaAtacar().atacar(tres);
						dois.estrategiaLancarMagia.lancarMagia(tres);
						if(tres.getVida() <= 0) {
							dois.setKill(dois.getKill()+1);
							tres.setDeath(tres.getDeath()+1);
						}
					}
				}
				
				if(tresAtaca) {
					if(tresAtacaUm) {
						tres.getEstrategiaParaAtacar().atacar(um);
						if(um.getVida() <= 0) {
							tres.setKill(tres.getKill()+1);
							um.setDeath(um.getDeath()+1);
						}
					} else {
						tres.getEstrategiaParaAtacar().atacar(dois);
						if(dois.getVida() <= 0) {
							tres.setKill(tres.getKill()+1);
							dois.setDeath(dois.getDeath()+1);
						}
					}
				}
				
				umAtaca = gerador.nextBoolean();
				doisAtaca = gerador.nextBoolean();
				tresAtaca = gerador.nextBoolean();
				umAtacaDois = gerador.nextBoolean();
				doisAtacaUm = gerador.nextBoolean();
				tresAtacaUm = gerador.nextBoolean();
			}
			System.out.println("UM: "+um.getVida()+" "+um.getKill()+"/"+
					um.getDeath()+"/"+um.getAssist()
					+"\nDOIS: "+dois.getVida()+" "+dois.getKill()+"/"+
							dois.getDeath()+"/"+dois.getAssist()+
							"\nTRES: "+tres.getVida()+" "+tres.getKill()+"/"+
							tres.getDeath()+"/"+tres.getAssist());
			
			if(um.getVida() > dois.getVida() && um.getVida() > tres.getVida()) {
				System.out.println("UM GANHOU!");
			} else if(dois.getVida() > um.getVida() && dois.getVida() > tres.getVida()) {
				System.out.println("DOIS GANHOU!");
			} else if(tres.getVida() > um.getVida() && tres.getVida() > dois.getVida()) {
				System.out.println("TRES GANHOU!");
			} else {
				System.out.println("EMPATE");
			}
		}

	}

}
