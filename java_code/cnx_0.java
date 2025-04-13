/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cnx
 */
public class cnx_0
extends Pw {
    private static final Logger a = Logger.getLogger(cnx_0.class);
    private int b;

    @Override
    public byte[] b() {
        int n = 4;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12761;
    }

    public void b(int n) {
        this.b = n;
    }
}

