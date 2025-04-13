/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cui
 */
public class cui_2
extends ctj_2 {
    private long c;
    private yt_2 d;
    private int e;
    private int f;
    private short g;
    private boolean h;
    private boolean i;
    private int j;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 35, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = new yt_2();
        if (!this.d.b(byteBuffer)) {
            return false;
        }
        this.j = byteBuffer.getInt();
        boolean bl = this.i = byteBuffer.get() == 1;
        this.h = !this.i ? byteBuffer.get() == 1 : false;
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getShort();
        return true;
    }

    @Override
    public int a() {
        return 13966;
    }

    public long g() {
        return this.c;
    }

    public yt_2 h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.f;
    }

    public short k() {
        return this.g;
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return this.i;
    }

    public int q() {
        return this.j;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.a;
    }
}

