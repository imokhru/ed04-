package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        initAgenda();
    }

    private static void initAgenda() {
        IAgenda IAgenda = new AgendaContactos();

        // Añadir contactos a la agenda.
        IAgenda.addContact("John Doe", "1234567890");
        IAgenda.addContact("Jane Doe", "9876543210");
        IAgenda.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Persona c : IAgenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        IAgenda.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        IAgenda.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        IAgenda.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : IAgenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}