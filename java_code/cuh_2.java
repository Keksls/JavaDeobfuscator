/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuh
 */
public class cuh_2
extends ctj_2 {
    private int f;
    byte[] c;
    long d;
    long e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.f = byteBuffer.getInt();
        this.c = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.c);
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12965;
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public emd_1 c() {
        return emd_1.t;
    }

    public int g() {
        return this.f;
    }

    public byte[] h() {
        return this.c;
    }

    public long i() {
        return this.d;
    }

    public long j() {
        return this.e;
    }
}

