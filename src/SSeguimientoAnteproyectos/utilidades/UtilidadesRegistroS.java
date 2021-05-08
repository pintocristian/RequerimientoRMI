package SSeguimientoAnteproyectos.utilidades;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class UtilidadesRegistroS {

    public static String arrancarNS(String direccionIPNS, int numPuertoNS) throws RemoteException {
        String mensaje;
        try {

            Registry registro = LocateRegistry.getRegistry(direccionIPNS, numPuertoNS);
            registro.list();
            mensaje = "El n_s se ha obtenido y se encuentra escuchando en la dirección IP " + direccionIPNS
                    + " y puerto " + numPuertoNS;
            System.out.println("El n_s se ha obtenido y se encuentra escuchando en la dirección IP " + direccionIPNS
                    + " y puerto " + numPuertoNS);

        } catch (RemoteException e) {
            System.out.println("El registro RMI no se localizó");

            Registry registro = LocateRegistry.createRegistry(numPuertoNS);
            System.out.println("El registro se ha creado ");
            mensaje = "El registro RMI no se localizó." + "\n" + "El registro se ha creado ";

        }
        return mensaje;
    }

    public static String RegistrarObjetoRemoto(Remote objetoRemoto, String dirIP, int numPuerto, String nombreObjeto) {
        String UrlRegistro = "rmi://" + dirIP + ":" + numPuerto + "/" + nombreObjeto;
        String mensaje;
        try {
            Naming.rebind(UrlRegistro, objetoRemoto);
            mensaje = "Se realizó el registro del objeto remoto con la direccion: " + UrlRegistro;
            System.out.println("Se realizó el registro del objeto remoto con la direccion: " + UrlRegistro);

        } catch (RemoteException e) {
            mensaje = "Error en el registro del objeto remoto ";
            System.out.println("Error en el registro del objeto remoto");
            e.printStackTrace();

        } catch (MalformedURLException e) {
            mensaje = "Error url inválida ";
            System.out.println("Error url inválida");
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return mensaje;
    }

}
