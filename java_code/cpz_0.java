/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cpz
 */
public class cpz_0
extends Pw {
    protected static final Logger a = Logger.getLogger(cpz_0.class);
    private byte b;
    private short c;

    @Override
    public byte[] b() {
        int n = 3;
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put(this.b);
        byteBuffer.putShort(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12602;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(short s2) {
        this.c = s2;
    }
}

