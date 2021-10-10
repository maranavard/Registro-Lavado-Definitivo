                            /*MVT SINGLETON*/
package aplavadodeautos;

//CREAR CLASE
public class vehiculo {    
 
//CREAR OBJ DE LA CLASE (variable estática) QUE VA A SER ÚNICO Y LO DEVUELVE UN METODO QUE LO RETORNA    
    private static vehiculo Tipovehiculo;
    
    private String camioneta;
    private String automovil;
    
//PARA ASEGURAR QUE LA CLASE NO SEA INSTANCIADA, CREAR UN CONSTRUCTOR DE TIPO publico   
    public  String vehiculo(){
        return camioneta; 
        
    }
//METODO SETTER QUE ESTABLECE LOS VALORES DEL VEHÍCULO
    public void setInstance(String camioneta){
        this.camioneta = camioneta;
    }
    
//CREAR UN MÉTODO QUE SERÁ PÚBLICO Y DEVOLVERÁ UNA INSTANCIA ÚNICA DEL OBJETO CREADO
    public static vehiculo getInstance(){
//COD QUE VERIFICA QUE LA VARIABLE NO SEA NULA Y RETORNE
        if(Tipovehiculo == null){
            Tipovehiculo = new vehiculo() ;
        }
        return Tipovehiculo;
    }
     
}
