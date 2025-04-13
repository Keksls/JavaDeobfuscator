/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvi
 */
public class cvi_2
extends ps_0 {
    private long a;
    private short b;
    private byte[] c;
    private boolean d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getShort();
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        this.d = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13619;
    }

    public long b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    public byte[] d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }
}

