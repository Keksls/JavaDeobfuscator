/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Py
extends ps_0 {
    protected byte a;
    protected int b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;

    public byte b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 29, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        this.f = System.nanoTime();
        return true;
    }

    @Override
    public int a() {
        return 349;
    }
}

