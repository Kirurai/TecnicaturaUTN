/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Uml1 {


    public static void main(String[] args) {
        Usuario user = new Usuario(1, "Arthur", "Pendragon", 7, "KingArthur", "Britain");
        
        ContactoDomicilio dir1 = new ContactoDomicilio(1, "Mi lago 1");
        ContactoDomicilio dir2 = new ContactoDomicilio(2, "Wizards Boulevar 1");
        ContactoTelefono tel1 = new ContactoTelefono(1, "007", "001");
        ContactoTelefono tel2 = new ContactoTelefono(2, "007", "006");
        ContactoTipo tipo = new ContactoTipo(1, "Cliente");
        
        Contacto c1 = new Contacto();
        Contacto c2 = new Contacto(101, "Merlín", "El Mago", 201, tipo);
        
        c2.addTelefono(tel2);
        c2.addDomicilio(dir2);
        
        user.getContactos().add(c1);
        user.addContacto(c2);
        
        user.getContactos().get(0).setTipo(tipo);
        user.getContactos().get(0).setNombre("La dama");
        user.getContactos().get(0).setApellido("Del Lago");
        user.getContactos().get(0).setIdPersona(102);
        user.getContactos().get(0).setIdContacto(202);
        user.getContactos().get(0).getDomicilios().add(dir1);
        user.getContactos().get(0).getTelefonos().add(tel1);
        
        System.out.printf("Usuario: %s\n", user.getUsuario());
        System.out.printf("Nombre: %s\n", user.getNombre());
        System.out.printf("Apellido: %s\n", user.getApellido());
        System.out.printf("\nContactos:\n\n");
        for (int i = 0; i < user.getContactos().size(); i++){
            System.out.printf("Nombre: %s %s\n", user.getContactos().get(i).getNombre(), user.getContactos().get(i).getApellido());
            System.out.printf("Tipo: %s\n", user.getContactos().get(i).getTipo().getDescripcion());
            System.out.printf("Domicilio principal: %s\n", user.getContactos().get(i).getDomicilios().get(0).getDescripcion());
            System.out.printf("Telefono principal: (%s) %s\n", user.getContactos().get(i).getTelefonos().get(0).getCodigo(), user.getContactos().get(i).getTelefonos().get(0).getNumero());
            System.out.printf("\n");
        }
        
    }
    
}
