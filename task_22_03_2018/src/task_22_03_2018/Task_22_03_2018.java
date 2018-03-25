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
public class Task_22_03_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Inicio do teste
        */
        
        //Cadastro de pessoas
            //Cadastra Atendente
            Atendente atendente = new Atendente();
            atendente.cadastraAtendente("Maria José", "192.168.10.1", "Feminina", "Balconista");
            atendente.exibeAtendente();

            //Cadastra Veterinário
            Veterinario veterinario = new Veterinario();
            veterinario.cadastraVeterinario("Francisco Barroso", "10.41.11.1", "Masculino", "Cirurgia em médios animais");
            veterinario.exibeVeterinario();
        
        //Cadastro de Animais
            //Cadastro de Cachorro
            Cachorro cachorro = new Cachorro();
            cachorro.cadastraCachorro("Marley", 24, "Pastor Alemão");
            cachorro.exibeCachorro();
            
            //Cadastro de Gato
            Gato gato = new Gato();
            gato.cadastraGato("Spike", 4.5, "Siamês", "branco");
            gato.exibeGato();
            
        /*
            Fim do teste
        */
        
    }
    
}
