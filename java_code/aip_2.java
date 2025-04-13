/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * Renamed from aIP
 */
class aip_2
extends Thread {
    final /* synthetic */ Socket a;
    final /* synthetic */ aio_2 b;

    aip_2(aio_2 aio_22, String string, Socket socket) {
        this.b = aio_22;
        this.a = socket;
        super(string);
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = this.a.getInputStream();
            OutputStream outputStream = this.a.getOutputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            this.b.c.a(this.a, bufferedInputStream, bufferedOutputStream);
        }
        catch (IOException iOException) {
            try {
                this.a.close();
            }
            catch (IOException iOException2) {
                // empty catch block
            }
        }
    }
}

