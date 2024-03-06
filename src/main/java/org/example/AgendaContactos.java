package org.example;

import java.util.*;
/** clase Agenda
 * **/
public class AgendaContactos implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    /** Constructor de la clase Agenda **/
    public AgendaContactos() {
        this.contacts = new ArrayList<>();
    }
    /** añadir el contacto
     * @param name nombre
     * @param phone telefono
     * **/
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }
    /** borrar el contacto
     * @param name nombre
     * @param phone telefono
     * **/
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }
    /** modificar el telefono
     * @param name nombre
     * @param phone telefono
     * **/
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }
    /** conseguir el contacto
     * @param name nombre
     * **/
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}