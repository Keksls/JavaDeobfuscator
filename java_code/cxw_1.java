/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxW
 */
public class cxw_1
extends ps_0 {
    private int a;
    private int b;
    private short c;
    private short d;
    private long e;
    private int f;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12031;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }
}

