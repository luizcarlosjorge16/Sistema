package main;

/**
 *
 * @author ifpb
 */
public class Mensagem {
	private String remetente;
	private WTTextual destinatario;
	protected String conteudo;
	
	//Metodos
	public Mensagem(String remetente, WTTextual destinatario){
		this.remetente = remetente;
		this.destinatario = destinatario;
		
	}
	
	public String getRemetente(){
		return remetente;
	}
	public WTTextual getDestinatario(){
		return destinatario;
	}
	public String verConteudo(){
		return conteudo;
	}
}
