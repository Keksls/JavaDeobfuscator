/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ctg
 */
public class ctg_1
extends csy_2 {
    private byte b;
    private long[] c;
    private byte[] d;
    private long e;
    private long f;
    private short g;
    private elp_0 h;
    private final ArrayList<Long> i = new ArrayList();
    private final ArrayList<abo_2<Short, Short>> j = new ArrayList();
    private byte[] k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    @Override
    public boolean a(byte[] byArray) {
        int n;
        int n2;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.get();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getShort();
        this.l = byteBuffer.getLong();
        int n3 = byteBuffer.get();
        for (n2 = 0; n2 < n3; ++n2) {
            this.i.add(byteBuffer.getLong());
        }
        n2 = byteBuffer.get();
        this.c = new long[n2];
        this.d = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.c[n] = byteBuffer.getLong();
            this.d[n] = byteBuffer.get();
        }
        n = byteBuffer.get();
        this.h = elp_0.a((byte)n);
        this.m = byteBuffer.get() == 1;
        this.n = byteBuffer.get() == 1;
        this.o = byteBuffer.get() == 1;
        this.p = byteBuffer.get() == 1;
        for (byte by = (byte)(byteBuffer.get() - 1); by >= 0; by = (byte)(by - 1)) {
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            this.j.add(new abo_2<Short, Short>(s2, s3));
        }
        this.k = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.k);
        return true;
    }

    public int b() {
        return this.c.length;
    }

    public long b(int n) {
        return this.c[n];
    }

    public byte c(int n) {
        return this.d[n];
    }

    @Override
    public int a() {
        return 12126;
    }

    public byte c() {
        return this.b;
    }

    public long e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public byte[] g() {
        return this.k;
    }

    public elp_0 h() {
        return this.h;
    }

    public ArrayList<Long> i() {
        return this.i;
    }

    public ArrayList<abo_2<Short, Short>> j() {
        return this.j;
    }

    public short k() {
        return this.g;
    }

    public long o() {
        return this.l;
    }

    public boolean p() {
        return this.m;
    }

    public boolean q() {
        return this.n;
    }

    public boolean r() {
        return this.o;
    }

    public boolean s() {
        return this.p;
    }
}

