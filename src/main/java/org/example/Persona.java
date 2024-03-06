package org.example;

import java.util.ArrayList;
import java.util.List;
/** clase Persona
 * **/

class Persona {
    private String name;
    private List<String> phones;
    /** constructor Persona
     * @param name nombre
     * @param phone telefono
     * **/
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }
    /** conseguir el nombre
     * @return nombre
     * **/
    public String getName() {
        return this.name;
    }
    /** conseguir los telefonos
     * @return telefonos
     * **/
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}