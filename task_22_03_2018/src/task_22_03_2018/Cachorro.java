/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_22_03_2018;

/**
 *
 * @author meirinaldojunior
 */
public class Cachorro extends Animal{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void cadastraCachorro(String nome, double peso, String raca){
        this.setNome(nome);
        this.setPeso(peso);
        this.setRaca(raca);
    }
    
    public String getCachorro(Cachorro cachorro){
        return "Nome: "+cachorro.getNome()+
                " Peso: "+cachorro.getPeso()+
                " Raça: "+cachorro.getRaca();
    }
    
    public void exibeCachorro(){
        System.err.println("Cachorro");
        System.out.println(getCachorro(this));
    }
}
