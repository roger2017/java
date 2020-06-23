package patrones.creacion.factory;

public class AlarmaTipo2 extends Alarma {

    public AlarmaTipo2(CriterioBusquedaVO criterioBusquedaVO) {
        super(TipoAlarma.ALARMA2);
        setAccion("accionAlarmaTipo2");
        setFrecuencia("80");
        setCriterioBusquedaVO(criterioBusquedaVO);
    }

    @Override
    public String getSql() {
        StringBuilder sql = new StringBuilder();
        sql.append("Select * from .... TipoAlarma2 ");
        sql.append("where 1 = 1 ");
        if(getCriterioBusquedaVO() != null){
            if(getCriterioBusquedaVO().getParametroDos() != null)
            {
                sql.append(" and paramentro2 = " + getCriterioBusquedaVO().getParametroDos());
            }
        }
        return sql.toString();
    }
}
