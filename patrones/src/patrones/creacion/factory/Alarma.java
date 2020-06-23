package patrones.creacion.factory;

public abstract class Alarma {
    private String accion;
    private String frecuencia;
    private TipoAlarma tipoAlarma;
    private CriterioBusquedaVO criterioBusquedaVO;

    public Alarma(TipoAlarma tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public TipoAlarma getTipoAlarma() {
        return tipoAlarma;
    }

    public void setTipoAlarma(TipoAlarma tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public CriterioBusquedaVO getCriterioBusquedaVO() {
        return criterioBusquedaVO;
    }

    public void setCriterioBusquedaVO(CriterioBusquedaVO criterioBusquedaVO) {
        this.criterioBusquedaVO = criterioBusquedaVO;
    }

    public abstract String getSql();

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Alarma del tipo = " + getTipoAlarma());
        builder.append(" , con frecuencia = " + getFrecuencia());
        builder.append(" , accion =" + getAccion());
        builder.append(" y sql = " + getSql());

        return builder.toString();
    }

}
