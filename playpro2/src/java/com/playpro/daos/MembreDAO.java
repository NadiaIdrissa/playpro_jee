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
        membres.put("Euro", new Membre());
        membres.put("Livre", new Membre());
        membres.put("$US", new Membre());
        membres.put("ITL", new Membre());
    }

    public static List<String> getListeMembres() {
        return new LinkedList(membres.keySet());
    }

    public static Membre getMembre(String pseudoMembre) {
        if (membres.containsKey(pseudoMembre)) {
            return membres.get(membres);
        }
        return null;
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
