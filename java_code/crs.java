/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crs
extends ps_0 {
    private long a;
    private byte b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private Yf i;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getFloat();
        this.d = byteBuffer.getFloat();
        this.e = byteBuffer.getFloat();
        this.f = byteBuffer.getFloat();
        this.g = byteBuffer.getFloat();
        this.h = byteBuffer.getFloat();
        this.i = Yf.a(byteBuffer.getInt());
        return true;
    }

    @Override
    public int a() {
        return 12795;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    public float e() {
        return this.d;
    }

    public float f() {
        return this.e;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.g;
    }

    public float i() {
        return this.h;
    }

    public Yf j() {
        return this.i;
    }
}

