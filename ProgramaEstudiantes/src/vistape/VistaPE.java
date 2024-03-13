package vistape;

import java.util.List;
import java.util.Scanner;
import modelodeusuarios.ModeloDeUsuarios;

public class VistaPE {
    private Scanner leer;
    
    public VistaPE(){
        this.leer = new Scanner(System.in);
    }
    
    public int MostrarMenu(){
        System.out.println("|------------------BIENVENIDO------------------|");
        System.out.println("Que desea realizar hoy?");
        System.out.println("1. Agregar Estudiante:");
        System.out.println("2. Actualizar Estudiante:");
        System.out.println("3. Eliminar Estudiante:");
        System.out.println("4. Ver Estudiantes:");
        System.out.println("5. Salir:");
        System.out.print("Digite el numero:");
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }
    
    public ModeloDeUsuarios CrearEstudiante(){
        System.out.println("|----------------------------------------------|");
        System.out.print("Nombre del estudiante:");
        String nombre = leer.nextLine();
        System.out.print("ID del estudiante:");
        String id = leer.nextLine();
        return new ModeloDeUsuarios(nombre, id);
    }
    
    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void mostrarEstudiantes(List<ModeloDeUsuarios> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para mostrar.");
        } else {
            System.out.println("Estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i+1) + ". ID: " + estudiantes.get(i).getId() + ", Nombre: " + estudiantes.get(i).getNombre());
            }
        }
    }

    public ModeloDeUsuarios seleccionarEstudiante(List<ModeloDeUsuarios> estudiantes) {
        mostrarEstudiantes(estudiantes);
        System.out.print("Seleccione el numero del estudiante que desea modificar: ");
        int seleccion = leer.nextInt();
        leer.nextLine();
        if (seleccion > 0 && seleccion <= estudiantes.size()) {
            return estudiantes.get(seleccion - 1);
        } else {
            System.out.println("Seleccion invalida. Por favor, seleccione un numero valido.");
            return null;
        }
    }

    public ModeloDeUsuarios ModificarEstudiante(List<ModeloDeUsuarios> estudiantes){
        ModeloDeUsuarios estudiante = seleccionarEstudiante(estudiantes);
        if (estudiante != null) {
            System.out.println("------------------------------------------------");
            System.out.println("Modificando estudiante:");
            System.out.println("Nombre actual: " + estudiante.getNombre());
            System.out.println("ID actual: " + estudiante.getId());
            System.out.print("Ingrese el nuevo nombre del estudiante: ");
            String nuevoNombre = leer.nextLine();
            System.out.print("Ingrese el nuevo ID del estudiante: ");
            String nuevoId = leer.nextLine();
            estudiante.setNombre(nuevoNombre);
            estudiante.setId(nuevoId);
            return estudiante;
        } else {
            return null;
        }
    }
    public String recibirIdEliminar() {
        System.out.print("Ingrese la ID del estudiante que desea eliminar: ");
        return leer.nextLine(); 
    }
    public ModeloDeUsuarios eliminarEstudiante(List<ModeloDeUsuarios> estudiantes) {
        mostrarEstudiantes(estudiantes); 

        String idEliminar = recibirIdEliminar(); 

        ModeloDeUsuarios estudianteAEliminar = null;
        for (ModeloDeUsuarios estudiante : estudiantes) {
            if (estudiante.getId().equals(idEliminar)) {
                estudianteAEliminar = estudiante;
                break;
            }
        }

        if (estudianteAEliminar != null) {
            MostrarMensaje("Estudiante eliminado correctamente: " + estudianteAEliminar.getNombre());
        } else {
            MostrarMensaje("No se encontro ningun estudiante con esa ID.");
        }

        return estudianteAEliminar;
    }
}
