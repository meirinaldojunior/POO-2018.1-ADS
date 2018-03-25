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
public class Veterinario extends Pessoa{
    private String areaAtuacao;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public void cadastraVeterinario(String nome, String cpf, String sexo, String areaAtuacao){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSexo(sexo);
        this.setAreaAtuacao(areaAtuacao);
    }
    
    public String getVeterinario(Veterinario veterinario){
        return "Nome: "+veterinario.getNome()+
                " CPF: "+veterinario.getCpf()+
                " Sexo: "+veterinario.getSexo()+
                " Área Atuação: "+veterinario.getAreaAtuacao();
    }
    
    public void exibeVeterinario(Veterinario veterinario){
        System.out.println(this.getVeterinario(veterinario));
    }
}
