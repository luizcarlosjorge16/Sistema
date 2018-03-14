package main;

public class QuickEmoticonMsg extends Mensagem{
    public String SMILE_FACE = ":D";
    public String SAD_FACE = ":/";
    public String CRYING_FACE = "T.T";
    public String SURPRISE_FACE = ":O";
    public String HEART = "<3";
    
    public QuickEmoticonMsg( this.getRemetente() , this.getDestinatario(), opcao);
     private String selecionarOpc(opcao){
         return opcao;
     }
    
    
}
