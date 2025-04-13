/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cnv
 */
public class cnv_0
extends Pw {
    private static final Logger a = Logger.getLogger(cnv_0.class);
    private int b;
    private int c;
    private byte e;
    private byte f;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.e);
        byteBuffer.putInt(this.c);
        byteBuffer.put(this.f);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14369;
    }

    public void b(int n) {
        this.b = n;
    }

    public void c(int n) {
        this.c = n;
    }

    public void a(byte by) {
        this.f = by;
    }

    public void b(byte by) {
        this.e = by;
    }
}

