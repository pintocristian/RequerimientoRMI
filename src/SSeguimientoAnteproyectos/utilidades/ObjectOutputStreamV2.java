/**
 * Javier Abell�n, 20 Marzo 2006
 * Redefinicion de la clase ObjectOutputStream para que no escriba una cabecera
 * al principio del Stream.
 */
package SSeguimientoAnteproyectos.utilidades;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Redefinici�n de la clase ObjectOuputStream para que no escriba una cabecera
 * al inicio del Stream.
 * @author Javier Abell�n.
 *
 */
public class ObjectOutputStreamV2 extends ObjectOutputStream
{
    /** Constructor que recibe OutputStream */
    public ObjectOutputStreamV2(OutputStream out) throws IOException
    {
        super(out);
    }

    /** Constructor sin par�metros */
    protected ObjectOutputStreamV2() throws IOException, SecurityException
    {
        super();
    }

    /** Redefinici�n del m�todo de escribir la cabecera para que no haga nada. */
    protected void writeStreamHeader() throws IOException
    {
    }

}
