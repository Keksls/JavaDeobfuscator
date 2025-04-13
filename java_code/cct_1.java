/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cct
 */
public class cct_1
implements fjv_0 {
    public final long a;
    public oo_0[] b;
    public final long c;
    public final int d;
    public final azf_2 e = new azf_2(new float[0]);
    public final byte f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final fka p;
    public final azf_2 q = new azf_2(new float[0]);
    public final azf_2 r = new azf_2(new float[0]);
    public final short s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final TLongObjectHashMap<bmf_0> w = new TLongObjectHashMap();
    public final TIntObjectHashMap<ccu_1> x = new TIntObjectHashMap();

    public void a(ffa ffa2) {
        this.b = new oo_0[]{new oo_0(ffa2.a(), true, ffa2.b(), ffa2.c(), ffa2.d())};
    }

    public cct_1(long l, short s2, int n, azj_2 azj_22, azj_2 azj_23, byte by, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, oo_0[] oo_0Array, boolean bl6, boolean bl7, short s3, fka fka2, azj_2 azj_24, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12) {
        this.a = l;
        this.c = s2;
        this.d = n;
        this.g = bl;
        this.h = bl12;
        this.e.a(azj_24.i());
        this.r.a(azj_22.i());
        this.q.a(azj_23.i());
        this.b = oo_0Array;
        this.f = by;
        this.j = bl2;
        this.k = bl3;
        this.l = bl4;
        this.m = bl5;
        this.n = bl6;
        this.o = bl7;
        this.p = fka2;
        this.s = s3;
        this.u = bl9;
        this.t = bl8;
        this.v = bl10;
        this.i = bl11;
    }

    cct_1(ByteBuffer byteBuffer) {
        int n;
        int n2;
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.r.a(byteBuffer.getInt());
        this.q.a(byteBuffer.getInt());
        byte by = byteBuffer.get();
        if (by == 0) {
            this.b = null;
        } else {
            this.b = new oo_0[by];
            for (n2 = 0; n2 < this.b.length; ++n2) {
                this.b[n2] = new oo_0(byteBuffer);
            }
        }
        this.f = byteBuffer.get();
        this.g = byteBuffer.get() != 0;
        this.i = byteBuffer.get() != 0;
        this.h = byteBuffer.get() != 0;
        this.j = byteBuffer.get() != 0;
        this.v = byteBuffer.get() != 0;
        this.k = byteBuffer.get() != 0;
        this.l = byteBuffer.get() != 0;
        this.m = byteBuffer.get() != 0;
        this.n = byteBuffer.get() != 0;
        this.o = byteBuffer.get() != 0;
        this.p = fka.a(byteBuffer.get());
        this.e.a(byteBuffer.getInt());
        this.u = byteBuffer.get() != 0;
        this.t = byteBuffer.get() != 0;
        this.s = byteBuffer.getShort();
        n2 = byteBuffer.get() & 0xFF;
        for (n = 0; n < n2; ++n) {
            bmf_0 bmf_02 = new bmf_0();
            bmf_02.a(this.a);
            bmf_02.a(byteBuffer);
            if (fkb.a.contains((long)bmf_02.e())) continue;
            this.w.put((long)bmf_02.e(), (Object)bmf_02);
            fgT.a.a(bmf_02);
        }
        n = byteBuffer.get() & 0xFF;
        for (int k = 0; k < n; ++k) {
            ccu_1 ccu_12 = new ccu_1(byteBuffer);
            this.x.put(ccu_12.a, (Object)ccu_12);
        }
    }

    @Override
    public boolean a() {
        return this.h;
    }

    @Override
    public boolean b() {
        return this.g;
    }

    @Override
    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.k || this.l || this.m;
    }

    @Override
    public boolean e() {
        return this.m;
    }

    public void a(ccu_1 ccu_12) {
        this.x.put(ccu_12.a, (Object)ccu_12);
    }

    public void a(bmf_0 bmf_02) {
        this.w.put((long)bmf_02.e(), (Object)bmf_02);
    }

    public final Xd f() {
        return Xd.a(this.f);
    }

    public void a(gk_0 gk_02) {
        int n;
        int n2;
        gk_02.c(this.a);
        gk_02.c(this.c);
        gk_02.a(this.d);
        gk_02.a(this.r.i());
        gk_02.a(this.q.i());
        if (this.b == null) {
            gk_02.a((byte)0);
        } else {
            gk_02.a((byte)this.b.length);
            for (n2 = 0; n2 < this.b.length; ++n2) {
                this.b[n2].a(gk_02);
            }
        }
        gk_02.a(this.f);
        gk_02.a((byte)(this.g ? 1 : 0));
        gk_02.a((byte)(this.i ? 1 : 0));
        gk_02.a((byte)(this.h ? 1 : 0));
        gk_02.a((byte)(this.j ? 1 : 0));
        gk_02.a((byte)(this.v ? 1 : 0));
        gk_02.a((byte)(this.k ? 1 : 0));
        gk_02.a((byte)(this.l ? 1 : 0));
        gk_02.a((byte)(this.m ? 1 : 0));
        gk_02.a((byte)(this.n ? 1 : 0));
        gk_02.a((byte)(this.o ? 1 : 0));
        gk_02.a(this.p.a());
        gk_02.a(this.e.i());
        gk_02.a(this.u ? (byte)1 : 0);
        gk_02.a(this.t ? (byte)1 : 0);
        gk_02.a(this.s);
        n2 = this.w.size();
        if (n2 >= 255) {
            throw new IllegalArgumentException("trop de territoire dans le monde " + this.a);
        }
        gk_02.a((byte)n2);
        TLongObjectIterator tLongObjectIterator = this.w.iterator();
        for (n = 0; n < n2; ++n) {
            tLongObjectIterator.advance();
            ((bmf_0)tLongObjectIterator.value()).a(gk_02);
        }
        n = this.x.size();
        if (n >= 255) {
            throw new IllegalArgumentException("trop de territoire dans le monde " + this.a);
        }
        gk_02.a((byte)n);
        TIntObjectIterator tIntObjectIterator = this.x.iterator();
        for (int k = 0; k < n; ++k) {
            tIntObjectIterator.advance();
            ((ccu_1)tIntObjectIterator.value()).a(gk_02);
        }
    }

    public bmf_0 a(int n) {
        return (bmf_0)this.w.get((long)n);
    }

    public ccu_1 b(int n) {
        return (ccu_1)this.x.get(n);
    }

    public TLongObjectIterator<bmf_0> g() {
        return this.w.iterator();
    }

    public int h() {
        return this.b == null ? 0 : this.b.length;
    }

    public oo_0 c(int n) {
        return this.b[n];
    }

    public cct_1 a(long l, cct_1 cct_12) {
        return new cct_1(l, (short)cct_12.c, cct_12.d, cct_12.r, cct_12.q, cct_12.f, cct_12.g, cct_12.j, cct_12.k, cct_12.l, cct_12.m, cct_12.b, cct_12.n, cct_12.o, cct_12.s, cct_12.p, cct_12.e, cct_12.t, cct_12.u, cct_12.v, cct_12.c(), cct_12.h);
    }
}

