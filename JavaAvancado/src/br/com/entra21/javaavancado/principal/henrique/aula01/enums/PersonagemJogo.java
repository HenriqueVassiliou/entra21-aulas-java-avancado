package br.com.entra21.javaavancado.principal.henrique.aula01.enums;

public enum PersonagemJogo {
//	BARBARO(1000,"Muito HP"), //Barbaro
//	ANAO(100,"Ferreiro"), //Anao
//	DRUIDA(50,"Suporte"), //Druida
//	SACERDOTE(10,"Cura e corre"), //Sacerdote
//	MAGO(20, "Contemplem o MAGO"); //Mago
	
	BARBARO(1000,"Muito HP"), ANAO(100,"Ferreiro"), DRUIDA(50,"Suporte"), SACERDOTE(10,"Cura e corre"), MAGO(20, "Contemplem o MAGO");
	//0                        1                       2                     3                           4
	private final int HP;
	private final String DESCRICAO;
	
	private PersonagemJogo(int vida, String descricao) {
		this.HP = vida;
		this.DESCRICAO = descricao;
	}

	public int getHP() {
		return HP;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public String getDetails() {
		return "Veja a descrição completa do " + this.name() + " sua vida é "
                + this.HP + " e sua habilidade principal " + this.DESCRICAO;
	}

	
}
