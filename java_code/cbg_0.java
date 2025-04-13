/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBG
 */
public class cbg_0
extends ps_0 {
    private boolean a;
    private long b;
    private long c;
    private short d;
    private short e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.getLong();
        this.d = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.e = byteBuffer.getShort();
        return true;
    }

    public boolean b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    @Override
    public int a() {
        return 22431;
    }
}

