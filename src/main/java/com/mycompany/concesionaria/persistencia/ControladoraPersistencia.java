package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {

    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJPA.create(auto);
    }
    
    //Traer datos desde la base de datos (En esta etapa la persistencia le pide a la DB)
    public List<Automovil> traerAutos() {
        return autoJPA.findAutomovilEntities();
    }
    
}
