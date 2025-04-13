/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cyW
 */
public class cyw_2
extends ps_0 {
    protected static final Logger a = Logger.getLogger(cyw_2.class);
    private long b;
    private int c;
    private byte[] d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.d);
        return true;
    }

    @Override
    public int a() {
        return 13912;
    }

    public long b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public byte[] d() {
        return this.d;
    }
}

