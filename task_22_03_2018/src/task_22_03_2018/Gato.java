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
public class Gato extends Animal{
    private String cor;
    private String raca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void cadastraGato(String nome, double peso, String raca, String cor){
        this.setNome(nome);
        this.setPeso(peso);
        this.setRaca(raca);        
        this.setCor(cor);

    }
    
    public String getGato(Gato gato){
        return "Nome: "+gato.getNome()+
                " Peso: "+gato.getPeso()+
                " Raça: "+gato.getRaca()+
                " Cor: "+gato.getCor();
    }
    
    public void exibeGato(){
        System.err.println("Gato");
        System.out.println(getGato(this));
    }

    @Override
    public void emitirSom() {
        //Poderia passar por parâmetro.
        System.out.println("Miar");
    }

    @Override
    public void mover() {
        //Poderia passar por parâmetro.
        System.out.println("Andar");
    }
}
