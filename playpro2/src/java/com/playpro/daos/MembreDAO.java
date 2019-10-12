/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.playpro.entities.Membre;

/**
 *
 * @author toute
 */
public class MembreDAO {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
    private static final Map<String, Membre> membres = new HashMap();

    static {  //bloc d'initialisation statique
        membres.put("toto@al.ca", new Membre("toto","toto@al.ca", "toto","Totoli", "Riviere"));
        membres.put("titi@al.ca", new Membre("titi","titi@al.ca", "titi", "Tim","Tapioka"));
        membres.put("riva@al.ca", new Membre("riva","riva@al.ca","rive","Roly","Raliera"));
        membres.put("mimi@al.ca", new Membre("mimi","mimi@al.ca","mimi","Mam","Mimiche"));
    }

    public static List<String> getListeMembres() {
        return new LinkedList(membres.keySet());
    }

    public static Membre getMembre(String pseudoMembre) {
        if (membres.containsKey(pseudoMembre)) {
            return membres.get(pseudoMembre);
        }else{
            return new Membre();
        }
            
        
    }

    public static boolean addMembre(Membre m) {
        String key = m.getPseudo();

        if (membres.containsKey(key)) {
            return false;
        } else {
            membres.put(key, m);
            return true;
        }

    }
}
