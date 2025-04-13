/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuH
 */
public class cuh_1
extends ps_0 {
    private short a;
    private short b;
    private short c;
    private short d;
    private short e;
    private short f;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getShort();
        return true;
    }

    public short b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    public short g() {
        return this.f;
    }

    @Override
    public int a() {
        return 12823;
    }
}

