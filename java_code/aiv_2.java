/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;

/*
 * Renamed from aIV
 */
public class aiv_2 {
    private final aja_2 a;

    public aiv_2(aja_2 aja_22) {
        this.a = aja_22;
    }

    public void a(Socket socket, BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (this.a.i()) {
            aiu_2 aiu_22 = new aiu_2(socket, bufferedInputStream, bufferedOutputStream, this.a.a(), this.a.h());
            this.a.b(aiu_22);
        } else {
            socket.close();
        }
    }
}

