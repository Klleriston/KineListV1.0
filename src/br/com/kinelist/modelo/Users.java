package br.com.kinelist.modelo;

import java.util.Random;

public class Users {
    private String name;
    private int id;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int geraID() {
        Random random = new Random();
        int id = random.nextInt(100);
        int idcont = id + random.nextInt(100 * 321);
        return idcont;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return geraID();
    }


}
