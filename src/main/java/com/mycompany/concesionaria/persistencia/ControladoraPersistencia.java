package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;

public class ControladoraPersistencia {

    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJPA.create(auto);
    }
    
}
