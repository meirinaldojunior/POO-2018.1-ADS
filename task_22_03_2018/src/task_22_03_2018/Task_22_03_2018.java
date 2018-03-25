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
            System.err.println("Atendente");
            Atendente atendente = new Atendente();
            atendente.cadastraAtendente("Maria José", "192.168.10.1", "Feminina", "Balconista");
            atendente.exibeAtendente(atendente);

            //Cadastra Veterinário
            System.err.println("Veterinário");
            Veterinario veterinario = new Veterinario();
            veterinario.cadastraVeterinario("Francisco Barroso", "10.41.11.1", "Masculino", "Cirurgia em médios animais");
           veterinario.exibeVeterinario(veterinario);
        
        //Cadastro de Animais
            //Cadastro de Cachorro
            System.err.println("Cachorro");
            Cachorro cachorro = new Cachorro();
            cachorro.cadastraCachorro("Marley", 0.60, "Pastor Alemão");
            cachorro.exibeCachorro(cachorro);
            
            //Cadastro de Gato
            System.err.println("Gato");
            Gato gato = new Gato();
            gato.cadastraGato("Spike", 0.23, "Siamês", "branco");
            gato.exibeGato(gato);
            
        /*
            Fim do teste
        */
        
    }
    
}
