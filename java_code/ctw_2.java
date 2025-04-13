/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctW
 */
public class ctw_2
extends ctj_2 {
    private long c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private short h;
    private boolean i;
    private boolean j;
    private short k;
    private yt_2 l;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.k = byteBuffer.getShort();
        boolean bl = this.e = byteBuffer.get() == 1;
        if (this.e) {
            this.l = new yt_2();
            if (!this.l.b(byteBuffer)) {
                return false;
            }
        }
        boolean bl2 = this.j = byteBuffer.get() == 1;
        if (!this.j) {
            this.i = byteBuffer.get() == 1;
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getShort();
        } else {
            this.i = false;
        }
        return true;
    }

    @Override
    public int a() {
        return 13163;
    }

    public boolean g() {
        return this.j;
    }

    public boolean h() {
        return this.i;
    }

    public int i() {
        return this.d;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.g;
    }

    public short o() {
        return this.h;
    }

    public long p() {
        return this.c;
    }

    public boolean q() {
        return this.e;
    }

    public yt_2 r() {
        return this.l;
    }

    @Override
    public int b() {
        return 0;
    }

    public short s() {
        return this.k;
    }

    @Override
    public emd_1 c() {
        return emd_1.r;
    }
}

