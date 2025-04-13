/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ctj
 */
public class ctj_1
extends csy_2 {
    private byte b;
    private long c;
    private long[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[][] i;
    private byte[][] j;
    private byte[] k;
    private long l;
    private long m;
    private ctk_1[] n;
    private long o;
    private long p;
    private final List<byte[]> q = new ArrayList<byte[]>();
    private boolean r;
    private final TByteHashSet s = new TByteHashSet();
    private final TByteHashSet t = new TByteHashSet();

    protected void b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3;
        int n4;
        this.a(byteBuffer);
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.l = byteBuffer.getLong();
        this.m = byteBuffer.getLong();
        int n5 = byteBuffer.getInt();
        this.h = new byte[n5];
        byteBuffer.get(this.h);
        this.k = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.k);
        this.o = byteBuffer.getLong();
        this.p = byteBuffer.getLong();
        this.r = byteBuffer.get() == 1;
        int n6 = byteBuffer.get();
        this.d = new long[n6];
        this.e = new byte[n6];
        this.f = new byte[n6];
        this.g = new byte[n6];
        this.i = new byte[n6][];
        this.j = new byte[n6][];
        for (n4 = 0; n4 < n6; ++n4) {
            this.d[n4] = byteBuffer.getLong();
            this.e[n4] = byteBuffer.get();
            this.f[n4] = byteBuffer.get();
            this.g[n4] = byteBuffer.get();
            if (this.r) continue;
            this.i[n4] = new byte[byteBuffer.getShort()];
            byteBuffer.get(this.i[n4]);
            this.j[n4] = new byte[byteBuffer.getShort()];
            byteBuffer.get(this.j[n4]);
        }
        n4 = byteBuffer.get();
        this.n = new ctk_1[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = byteBuffer.get();
            long l = byteBuffer.getLong();
            this.n[n3] = new ctk_1((byte)n2, l);
        }
        n3 = byteBuffer.get();
        for (n2 = 0; n2 < n3; ++n2) {
            this.s.add(byteBuffer.get());
        }
        n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            this.t.add(byteBuffer.get());
        }
        n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            this.q.add(byArray);
        }
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        return true;
    }

    public int e() {
        return this.d.length;
    }

    public long b(int n) {
        return this.d[n];
    }

    public long[] f() {
        return this.d;
    }

    public byte c(int n) {
        return this.e[n];
    }

    public byte d(int n) {
        return this.f[n];
    }

    public byte e(int n) {
        return this.g[n];
    }

    public byte[] f(int n) {
        return this.i[n];
    }

    public byte[] g(int n) {
        return this.j[n];
    }

    public byte[] g() {
        return this.k;
    }

    @Override
    public int a() {
        return 12843;
    }

    public byte[] h() {
        return this.h;
    }

    public byte i() {
        return this.b;
    }

    public long j() {
        return this.l;
    }

    public long k() {
        return this.m;
    }

    public long o() {
        return this.o;
    }

    public long p() {
        return this.p;
    }

    public ctk_1[] q() {
        return this.n;
    }

    public TByteHashSet r() {
        return this.s;
    }

    public TByteHashSet s() {
        return this.t;
    }

    public List<byte[]> t() {
        return this.q;
    }

    public boolean u() {
        return this.r;
    }
}

