/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fhz
implements emy_0 {
    private fhD a = fhD.a;
    private long b = 0L;
    private fhD c;

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.a());
        abx_22.a(this.b);
        return abx_22.c();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.a = fhD.a(byteBuffer.get());
        this.b = byteBuffer.getLong();
    }

    @Override
    public end_0 e() {
        return end_0.h;
    }

    public fhD a() {
        return this.a;
    }

    public void a(fhD fhD2) {
        this.a = fhD2;
    }

    public fhD b() {
        return this.c;
    }

    public void b(fhD fhD2) {
        this.c = fhD2;
    }

    public void a(long l) {
        this.b += l;
    }

    public long c() {
        return this.b;
    }

    public void b(long l) {
        this.b = l;
    }
}

