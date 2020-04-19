/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package #;

import java.util.UUID;

/**
 *
 * @author cl4r4m0r41s
 */
public class Cass {
    private String pet;
    private String senha;
    private String id;
    private String dono;
    private Password senha;
    private String email;
    
    public Cass( String email , String senha , String id ) {
        this.email = email;
        this.senha = senha;
        this.id = UUID.randomUUID().toString();
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getId() {
        return id;
    }
    
}