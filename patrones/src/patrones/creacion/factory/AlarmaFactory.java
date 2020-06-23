package patrones.creacion.factory;

public class AlarmaFactory {
    public static Alarma creadorAlarma(TipoAlarma tipoAlarma,CriterioBusquedaVO criterioBusquedaVO) {
        Alarma alarma = null;
        switch (tipoAlarma) {
            case ALARMA1:
                alarma = new AlarmaTipo1(criterioBusquedaVO);
                break;

            case ALARMA2:
                alarma = new AlarmaTipo2(criterioBusquedaVO);
                break;

            case ALARMA3:
                alarma = new AlarmaTipo3(criterioBusquedaVO);
                break;

            default:
                // throw some exception
                break;
        }
        return alarma;
    }
}
