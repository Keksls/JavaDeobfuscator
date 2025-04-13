/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cqX
 */
public class cqx_0
extends ps_0 {
    protected static final Logger a = Logger.getLogger(cqx_0.class);
    protected static final boolean b = false;
    private boolean c;
    private int d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        this.c = by == 1;
        this.d = byteBuffer.remaining() > 0 ? byteBuffer.getInt() : -1;
        return true;
    }

    @Override
    public int a() {
        return 13458;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }
}

