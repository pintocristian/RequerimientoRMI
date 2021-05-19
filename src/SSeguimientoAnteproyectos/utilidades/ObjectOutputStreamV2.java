package SSeguimientoAnteproyectos.utilidades;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamV2 extends ObjectOutputStream {

    public ObjectOutputStreamV2(OutputStream out) throws IOException {
        super(out);
    }

    protected ObjectOutputStreamV2() throws IOException, SecurityException {
        super();
    }

    protected void writeStreamHeader() throws IOException {
    }

}
