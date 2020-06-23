package patrones.creacion.factory;

public class PruebaPatronFactory {
    public static void main(String[] args) {
        CriterioBusquedaVO criterioBusquedaVO1 = new CriterioBusquedaVO();
        criterioBusquedaVO1.setParametroUno("ValorParametro1");
        System.out.println(AlarmaFactory.creadorAlarma(TipoAlarma.ALARMA1,criterioBusquedaVO1));

        CriterioBusquedaVO criterioBusquedaVO2 = new CriterioBusquedaVO();
        criterioBusquedaVO1.setParametroDos("ValorParametro2");
        System.out.println(AlarmaFactory.creadorAlarma(TipoAlarma.ALARMA2,criterioBusquedaVO1));

        CriterioBusquedaVO criterioBusquedaVO3 = new CriterioBusquedaVO();
        criterioBusquedaVO1.setParametroTres("ValorParametro3");
        System.out.println(AlarmaFactory.creadorAlarma(TipoAlarma.ALARMA3,criterioBusquedaVO1));
    }
}
