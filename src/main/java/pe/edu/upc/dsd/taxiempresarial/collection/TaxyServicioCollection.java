package pe.edu.upc.dsd.taxiempresarial.collection;

import java.util.Collection;
import localhost.webservicetaxyemp.TaxyServicioEntity;


public class TaxyServicioCollection {
    
    private Collection<TaxyServicioEntity> taxyServicioEntities;
    
    public TaxyServicioCollection() {        
    }
    
    public TaxyServicioCollection(Collection<TaxyServicioEntity> taxyServicios) {
        this.taxyServicioEntities = taxyServicios;
    }
    
    public Collection<TaxyServicioEntity> getTaxyServicioEntities() {
        return taxyServicioEntities;
    }

    public void setTaxyServicioEntities(Collection<TaxyServicioEntity> taxyServicioEntities) {
        this.taxyServicioEntities = taxyServicioEntities;
    }
}
