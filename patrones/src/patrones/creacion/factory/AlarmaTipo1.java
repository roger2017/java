package patrones.creacion.factory;

public class AlarmaTipo1 extends Alarma {

    public AlarmaTipo1(CriterioBusquedaVO criterioBusquedaVO) {
        super(TipoAlarma.ALARMA1);
        setAccion("accionAlarmaTipo1");
        setFrecuencia("60");
        setCriterioBusquedaVO(criterioBusquedaVO);
    }

    @Override
    public String getSql() {
        StringBuilder sql = new StringBuilder();
        sql.append("Select * from .... TipoAlarma1 ");
        sql.append("where 1 = 1 ");
        if(getCriterioBusquedaVO() != null){
            if(getCriterioBusquedaVO().getParametroUno() != null)
            {
                sql.append(" and paramentro1 = " + getCriterioBusquedaVO().getParametroUno());
            }
        }
        return sql.toString();
    }
}
