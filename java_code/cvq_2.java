/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cvq
 */
public class cvq_2
extends ps_0 {
    protected static final Logger a = Logger.getLogger(cvq_2.class);
    private long b = -1L;
    private short c = (short)-1;
    private long d = 0L;
    private byte e = (byte)-1;
    private byte f = (byte)-1;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length == 13 || byArray.length == 21) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            this.b = byteBuffer.getLong();
            this.c = byteBuffer.getShort();
            this.e = byteBuffer.get();
            this.f = byteBuffer.get();
            byte by = byteBuffer.get();
            this.d = by == 1 ? byteBuffer.getLong() : 0L;
        }
        return false;
    }

    @Override
    public int a() {
        return 12532;
    }

    public long b() {
        return this.b;
    }

    public short c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public byte e() {
        return this.e;
    }

    public byte f() {
        return this.f;
    }
}

