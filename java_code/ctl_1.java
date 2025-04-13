/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctL
 */
public class ctl_1
extends ctj_2 {
    private long c;
    private long d;
    private long e;
    private boolean f;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.f = byteBuffer.get() == 1;
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13066;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.j;
    }

    public boolean g() {
        return this.f;
    }

    public long h() {
        return this.c;
    }

    public long i() {
        return this.e;
    }

    public long j() {
        return this.d;
    }
}

