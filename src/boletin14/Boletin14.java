package boletin14;

public class Boletin14 {

    public static void main(String[] args) {
        
        ConversorTemperaturas obx = new ConversorTemperaturas();
        
        try{
            obx.CentigradosAFharenheit();
        }catch (TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            obx.CentigradosAReamur();
        }catch (TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
