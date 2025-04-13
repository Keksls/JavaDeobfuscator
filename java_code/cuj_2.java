/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuj
 */
public final class cuj_2
extends ctj_2 {
    private long c = -1L;
    private int d = -1;
    private boolean e;
    private boolean f;
    private yt_2 g;
    private int h;
    private int i;
    private short j;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.get() == 1;
        this.f = byteBuffer.get() == 1;
        this.g = new yt_2();
        if (!this.g.b(byteBuffer)) {
            return false;
        }
        this.h = byteBuffer.getInt();
        this.i = byteBuffer.getInt();
        this.j = byteBuffer.getShort();
        return true;
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

    public boolean j() {
        return this.f;
    }

    public yt_2 k() {
        return this.g;
    }

    public int o() {
        return this.h;
    }

    public int p() {
        return this.i;
    }

    public short q() {
        return this.j;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.ap;
    }

    @Override
    public int a() {
        return 13453;
    }
}

