/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctZ
 */
public class ctz_1
extends ctj_2 {
    private long c;
    private int d;
    private boolean e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12738;
    }

    public long g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public boolean i() {
        return this.e;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.V;
    }
}

