package Aula1.modelo;

import java.sql.Date;

public class Cliente {

    private String nome;
    private String cpf;
    private Date dataDeAniversario;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public Date getDatadeAniversario(){
        return dataDeAniversario;
    }
    public void setDataDeAniversario(Date dataDeAniversario){
        this.dataDeAniversario = dataDeAniversario;
    }
}