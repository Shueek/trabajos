package programaestudiantes;

import controladorpe.ControladorPE;
import java.util.ArrayList; 
import java.util.List; 
import modelodeusuarios.ModeloDeUsuarios;
import vistape.VistaPE;

public class ProgramaEstudiantes {

    public static void main(String[] args) {
        List<ModeloDeUsuarios> estudiantes = new ArrayList<>();
        VistaPE vista = new VistaPE();
        ControladorPE cont = new ControladorPE(vista, estudiantes);
        cont.iniciar();
    }
    
}
