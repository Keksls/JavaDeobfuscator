/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cyA
 */
public class cya_1
extends ps_0 {
    protected static final Logger a = Logger.getLogger(cya_1.class);
    protected static final boolean b = false;
    private byte c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.get();
        this.d = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12232;
    }

    public byte b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }
}

