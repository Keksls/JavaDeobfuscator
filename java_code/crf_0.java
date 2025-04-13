/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crf
 */
public class crf_0
extends cwj_2 {
    private long f;
    private long g;
    private int h;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        this.a = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getLong();
        this.h = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12109;
    }

    public int b() {
        return this.h;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }
}

