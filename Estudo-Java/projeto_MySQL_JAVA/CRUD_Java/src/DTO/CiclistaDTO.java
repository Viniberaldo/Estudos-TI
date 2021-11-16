/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author viniberaldo
 */
public class CiclistaDTO {
    private String nome_ciclista, nome_g_ciclista, desc_cam;
    private int id_usuario, cod_cam;

    
    
    /**
     * @return the nome_ciclista
     */
    public String getNome_ciclista() {
        return nome_ciclista;
    }

    /**
     * @param nome_ciclista the nome_ciclista to set
     */
    public void setNome_ciclista(String nome_ciclista) {
        this.nome_ciclista = nome_ciclista;
    }

    /**
     * @return the nome_g_ciclista
     */
    public String getNome_g_ciclista() {
        return nome_g_ciclista;
    }

    /**
     * @param nome_g_ciclista the nome_g_ciclista to set
     */
    public void setNome_g_ciclista(String nome_g_ciclista) {
        this.nome_g_ciclista = nome_g_ciclista;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getCod_cam() {
        return cod_cam;
    }

    public void setCod_cam(int cod_cam) {
        this.cod_cam = cod_cam;
    }

    public String getDesc_cam() {
        return desc_cam;
    }

    public void setDesc_cam(String desc_cam) {
        this.desc_cam = desc_cam;
    }

}
