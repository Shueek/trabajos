package controladorpe;

import java.util.List;
import modelodeusuarios.ModeloDeUsuarios;
import vistape.VistaPE;

public class ControladorPE {
    private final VistaPE vista;
    private final List<ModeloDeUsuarios> estudiantes;

    public ControladorPE(VistaPE vista, List<ModeloDeUsuarios> estudiantes) {
        this.vista = vista;
        this.estudiantes = estudiantes;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.MostrarMenu();
            switch (opcion) {
                case 1:
                    ModeloDeUsuarios nuevoEstudiante = vista.CrearEstudiante();
                    estudiantes.add(nuevoEstudiante);
                    vista.MostrarMensaje("Estudiante Agregado Con Exito");
                    break;
                case 2:
                    ModeloDeUsuarios estudianteAModificar = vista.ModificarEstudiante(estudiantes);
                    if (estudianteAModificar != null) {
                        vista.MostrarMensaje("Estudiante Modificado Con Exito");
                    } else {
                        vista.MostrarMensaje("No se ha seleccionado ningún estudiante para modificar");
                    }
                    break;
                case 3:
                    ModeloDeUsuarios estudianteAEliminar = vista.eliminarEstudiante(estudiantes);
                    if (estudianteAEliminar != null) {
                        estudiantes.remove(estudianteAEliminar);
                        vista.MostrarMensaje("Estudiante eliminado correctamente");
                    } else {
                        vista.MostrarMensaje("No se encontro ningun estudiante con esa ID.");
                    }
                    break;
                case 4:
                    vista.mostrarEstudiantes(estudiantes);
                    break;
                case 5:
                    salir = true;
                    vista.MostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.MostrarMensaje("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }
}

