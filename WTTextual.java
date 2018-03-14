
public class WTTextual{
	private String nickname;
	private boolean estaOnline;
	private String msgAtual;
	
	//Metodos
	public WTTextual( String nickname){
		this.nickname = nickname;
	}
	
	public void enviarMsg( WTTextual destinatario, int opc ){
		if(this.getEstaOnline() == true){
                    
                }
                
	}
        public void enviarMesg(WTTextual destinatario, String txt){
            if(this.getEstaOnline() == true){
                    
                }
        }
        public void conectar(){
            this.estaOnline = true;
        }
        public void desconetctar(){
            this.estaOnline = false;
        }
        public boolean estaOnline(){
            if( this.estaOnline == true){
                return true;
                
            }else{
                this.estaOnline = false;
            }
            return false;
        }
        public String verStatus(){
            if(this.estaOnline == true){
                System.out.println(this.nickname + " está online :)");
            }else{ 
                System.out.println(this.nickname + " está offline :(");
            }
            return null;
        }
        public void receberMesg(String msgAtual){
            }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean getEstaOnline() {
        return estaOnline;
    }

    public void setEstaOnline(boolean estaOnline) {
        this.estaOnline = estaOnline;
    }

    public String getMsgAtual() {
        return msgAtual;
    }

    public void setMsgAtual(String msgAtual) {
        this.msgAtual = msgAtual;
    }
	
	

}
