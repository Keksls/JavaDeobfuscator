/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqV
 */
public final class cqv_0
extends ps_0 {
    private long a;
    private int b;
    private int c;
    private short d;
    private byte e;
    private afm_0 f;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length < 23) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        this.f = afm_0.a(byteBuffer.getInt());
        return true;
    }

    @Override
    public int a() {
        return 13972;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public byte f() {
        return this.e;
    }

    public afm_0 g() {
        return this.f;
    }
}

