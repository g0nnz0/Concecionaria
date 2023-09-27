package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(auto);
       
    }
    
    //Traer datos desde la base de datos (En esta etapa la logica le pide a la persistencia)
    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

}
