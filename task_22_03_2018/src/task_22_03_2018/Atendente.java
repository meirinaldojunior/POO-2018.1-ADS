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
public class Atendente extends Pessoa{
    private String areaAtendimento;

    public String getAreaAtendimento() {
        return areaAtendimento;
    }

    public void setAreaAtendimento(String areaAtendimento) {
        this.areaAtendimento = areaAtendimento;
    }
    
    public void cadastraAtendente(String nome, String cpf, String sexo, String areaAtendimento){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSexo(sexo);
        this.setAreaAtendimento(areaAtendimento);
    }
    
    public String getAtendente(Atendente atendente){
        return "Nome: "+atendente.getNome()+
                " CPF: "+atendente.getCpf()+
                " Sexo: "+atendente.getSexo()+
                " Área Atendimento: "+atendente.getAreaAtendimento();
    }
    
    public void exibeAtendente(){
        System.err.println("Atendente");
        System.out.println(getAtendente(this));
    }
}
