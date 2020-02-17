import java.util.ArrayList;
import java.util.HashMap;
public class Pais {
    private String pais;
    private String capital;
    private double dimensao;
    ArrayList<String> listaPaises;
    
    //a)construtor
    public Pais(String pais, String capital, double dimensao){
        this.pais = pais;
        this.capital = capital;
        this.dimensao = dimensao;
    }
    
    //b)gets e sets
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getCapital(){
        return capital;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public double getDimensao(){
        return dimensao;
    }
    public void setDimensao(double dimensao){
        this.dimensao = dimensao;
    }
    
    //c) Verificar se dois paises sao iguais
    public boolean equals(Pais outro){
        return this.getPais().equals(outro.getPais())
            && this.getCapital().equals(outro.getCapital());   
    }
    
    //d) Que paises fazem fronteira
    public void fronteira(Pais pais){
        String fronteira;
        for(int i = 0; i < this.listaPaises.size(); i++){
            if(this.listaPaises.get(i) != null && this.listaPaises.get(i).equals(pais)){
                fronteira = listaPaises.get(i);
            }else{
                
            }
        }
    }
    
    //e) Nome e a capital dos países que fazem fronteira
    public HashMap<String, String> capEPaises(){
        HashMap map = new HashMap<String, String>();
        
        map.put("brasil", "brasilia");
        map.put("asr", "");
        
        System.out.println(map.get("brasil"));
        
        return map;
    }
    
    

}
