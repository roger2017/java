package patrones.creacion.factory;

public class AlarmaTipo3 extends Alarma {

    public AlarmaTipo3(CriterioBusquedaVO criterioBusquedaVO) {
        super(TipoAlarma.ALARMA3);
        setAccion("accionAlarmaTipo3");
        setFrecuencia("100");
        setCriterioBusquedaVO(criterioBusquedaVO);
    }

    @Override
    public String getSql() {
        StringBuilder sql = new StringBuilder();
        sql.append("Select * from .... TipoAlarma3 ");
        sql.append("where 1 = 1 ");
        if(getCriterioBusquedaVO() != null){
            if(getCriterioBusquedaVO().getParametroTres() != null)
            {
                sql.append(" and paramentro3 = " + getCriterioBusquedaVO().getParametroTres());
            }
        }
        return sql.toString();
    }
}
