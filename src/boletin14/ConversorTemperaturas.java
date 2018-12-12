package boletin14;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
    
    private final float TMAX = 80;
    
    
    public void CentigradosAFharenheit() throws TemperaturaErradaExcepcion{
        
        float tCentigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce una temperatura en Centigrados: "));
        if (tCentigrados < TMAX)
            throw new TemperaturaErradaExcepcion("La maquina no puede trabajar con temperaturas por debajo de los 80 centigrados");
        else
            JOptionPane.showMessageDialog(null,"La temperatura en grados Fhaarenheit es de: " + (9.0/5.0*tCentigrados + 32.4));
    }
    
    public void CentigradosAReamur() throws TemperaturaErradaExcepcion{
        
        float tCentigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce una temperatura en Centigrados: "));
        if (tCentigrados < TMAX)
            throw new TemperaturaErradaExcepcion("La maquina no puede trabajar con temperaturas por debajo de los 80 centigrados");
        else
           JOptionPane.showMessageDialog(null,"La temperatura en grados Reamur es de: " + (4.0/5.0 * tCentigrados));
        
    }
    
}
