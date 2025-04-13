/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntLongHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableList;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bhR
 */
public final class bhr_1
implements ro_0 {
    private static final int a = 5;
    private static final boolean b = true;
    private static final Logger c = Logger.getLogger(bhr_1.class);
    private int d;
    final TIntObjectHashMap<bic_1> e = new TIntObjectHashMap();
    final TIntObjectHashMap<bhj_1> f = new TIntObjectHashMap();
    final TIntObjectHashMap<bhx_2> g = new TIntObjectHashMap();
    final TIntObjectHashMap<TIntArrayList> h = new TIntObjectHashMap();
    private final TIntArrayList i = new TIntArrayList();
    private final ArrayList<bhm_1> j = new ArrayList();
    private bho_1 k;
    private final TIntLongHashMap l = new TIntLongHashMap();
    private int m = -1;

    bhr_1(int n, TIntObjectHashMap<bic_1> tIntObjectHashMap, TIntObjectHashMap<bhj_1> tIntObjectHashMap2) {
        this.d = n;
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new bhs_1(this));
        tIntObjectHashMap2.forEachEntry((TIntObjectProcedure)new bht_2(this));
    }

    bhr_1(bhr_1 bhr_12) {
        this(bhr_12.d, bhr_12.e, bhr_12.f);
    }

    private void c(int n, boolean bl) {
        this.m = bl ? n : -1;
        this.k.a(n, bl);
    }

    public boolean o(int n) {
        return this.m == n;
    }

    public boolean p(int n) {
        bhj_1 bhj_12 = this.w(n);
        if (bhj_12 == null) {
            return false;
        }
        return bhj_12.w();
    }

    public void a(bho_1 bho_12) {
        this.k = bho_12;
    }

    public bho_1 b() {
        return this.k;
    }

    public TIntArrayList q(int n) {
        return (TIntArrayList)this.h.get(n);
    }

    public void a(int n, long l) {
        bic_1 bic_12 = (bic_1)this.e.get(n);
        if (bic_12 != null) {
            long l2 = bic_12.c();
            bic_12.a(l);
            if (this.k != null) {
                this.k.a(bic_12, l - l2);
            }
        } else {
            throw new RuntimeException("Variable inconnue : " + n);
        }
    }

    @Override
    public boolean b(int n) {
        bhx_2 bhx_22 = (bhx_2)this.g.get(n);
        if (bhx_22 != null) {
            return bhx_22.b();
        }
        throw new RuntimeException("Objectif inconnu : " + n);
    }

    @Override
    public boolean a(int n) {
        return this.g.containsKey(n);
    }

    public boolean r(int n) {
        return this.e.containsKey(n);
    }

    @Override
    public boolean c(int n) {
        return this.f.containsKey(n);
    }

    public boolean a(int n, rp_0 rp_02) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return bhj_12.b(rp_02);
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    public boolean b(int n, rp_0 rp_02) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return bhj_12.a(rp_02);
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public boolean g(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return rl_0.c(bhj_12, wn_0.a.a());
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public boolean h(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return rl_0.a(bhj_12, wn_0.a.a()) && !bhj_12.l();
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public long i(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return bhj_12.j();
        }
        throw new RuntimeException("Specified achievement with id " + n + " doesn't exists");
    }

    @Override
    public boolean f(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return bhj_12.d();
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public boolean e(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return bhj_12.l();
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public rn_0 a(String string) {
        return bhp_1.a.a(string);
    }

    @Override
    public boolean d(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            return rl_0.a(bhj_12, wn_0.a.a());
        }
        throw new RuntimeException("Achievement inconnu : " + n);
    }

    @Override
    public rr_0 j(int n) {
        return bhp_1.a.c(n);
    }

    @Override
    public long k(int n) {
        bic_1 bic_12 = (bic_1)this.e.get(n);
        if (bic_12 != null) {
            return bic_12.c();
        }
        throw new RuntimeException("Variable inconnue : " + n);
    }

    @Override
    public boolean l(int n) {
        return this.i.contains(n);
    }

    @Override
    public boolean a(int n, boolean bl) {
        if (this.p(n)) {
            this.c(n, bl);
            return true;
        }
        return bl ? this.A(n) : this.B(n);
    }

    private boolean A(int n) {
        if (this.i.contains(n)) {
            return false;
        }
        if (this.i.size() >= 4) {
            this.B(this.i.get(0));
        }
        this.i.add(n);
        this.k.a(n, true);
        return true;
    }

    private boolean B(int n) {
        if (!ahx_2.a(this.i, n)) {
            return false;
        }
        this.k.a(n, false);
        return true;
    }

    public void b(int n, long l) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            this.k.a(bhj_12, l);
        }
    }

    public void s(int n) {
        this.b(n, true);
    }

    public void b(int n, boolean bl) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            boolean bl2;
            bhj_12.C();
            bhj_12.a(false);
            if (bl) {
                this.k.c(bhj_12);
            }
            if (bl2 = this.a(n, false)) {
                this.k.a(n, false);
            }
        }
    }

    @Override
    public TIntArrayList a() {
        return this.i;
    }

    public void t(int n) {
        bhx_2 bhx_22 = (bhx_2)this.g.get(n);
        if (bhx_22 != null) {
            bhx_22.a(true);
            if (this.k != null) {
                this.k.a(bhx_22);
            }
            c.info((Object)("Achievement objective completed : " + n));
        } else {
            c.error((Object)("Impossible de trouver l'objectif " + n + " dans le contexte du joueur"));
        }
    }

    public void u(int n) {
        bhx_2 bhx_22 = (bhx_2)this.g.get(n);
        if (bhx_22 != null) {
            bhx_22.i();
            if (this.k != null) {
                this.k.b(bhx_22);
            }
            c.info((Object)("Achievement objective reset : " + n));
        } else {
            c.error((Object)("Impossible de trouver l'objectif " + n + " dans le contexte du joueur"));
        }
    }

    public void v(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            bhj_12.a(this);
            c.info((Object)("Achievement activated : " + n));
            if (this.k != null) {
                this.k.b(bhj_12);
            }
        } else {
            c.error((Object)("Impossible de trouver l'achievement " + n + " dans le contexte du joueur"));
        }
    }

    public void c(int n, long l) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 != null) {
            bhj_12.b(this);
            c.info((Object)("! Achievement unlocked ! : " + n + " on " + new Date(l) + " (server time)"));
            this.j.add(new bhm_1(n, l));
            int n2 = this.j.size();
            if (n2 > 5) {
                this.j.remove(0);
            }
            boolean bl = this.a(n, false);
            if (this.k != null) {
                this.k.a(bhj_12);
                if (bl) {
                    this.k.a(n, false);
                }
            }
        } else {
            c.error((Object)("Impossible de trouver l'achievement " + n + " dans le contexte du joueur"));
        }
    }

    public ArrayList<bhm_1> c() {
        return this.j;
    }

    public bhj_1 w(int n) {
        return (bhj_1)this.f.get(n);
    }

    public TIntObjectIterator<bhj_1> d() {
        return this.f.iterator();
    }

    private void e() {
        this.f.forEachEntry((TIntObjectProcedure)new bhu_2(this));
    }

    public void a(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        c.info((Object)("D\u00e9serialisation des achievements : size=" + byArray.length));
        this.d = byteBuffer.getInt();
        int n6 = byteBuffer.get() & 0xFF;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = byteBuffer.getInt();
            long l = byteBuffer.getLong();
            this.j.add(new bhm_1(n4, l));
        }
        n5 = byteBuffer.getInt();
        for (n4 = 0; n4 < n5; ++n4) {
            int n7 = byteBuffer.getInt();
            long l = byteBuffer.getLong();
            bic_1 bic_12 = (bic_1)this.e.get(n7);
            if (bic_12 == null) continue;
            bic_12.a(l);
        }
        n4 = byteBuffer.getInt();
        for (n3 = 0; n3 < n4; ++n3) {
            bhj_1 bhj_12;
            int n8 = byteBuffer.getInt();
            n2 = byteBuffer.get() == 1 ? 1 : 0;
            boolean bl = byteBuffer.get() == 1;
            boolean bl2 = true;
            boolean bl3 = true;
            if (this.d >= 4) {
                bl2 = byteBuffer.get() == 1;
                bl3 = byteBuffer.get() == 1;
            }
            long l = 0L;
            if (this.d >= 1 && this.d < 4 || this.d >= 4 && bl2) {
                l = byteBuffer.getLong();
            }
            long l2 = 0L;
            if (this.d >= 2 && this.d < 4 || this.d >= 4 && bl3) {
                l2 = byteBuffer.getLong();
            }
            if ((bhj_12 = (bhj_1)this.f.get(n8)) != null) {
                bhj_12.a(n2 != 0);
                bhj_12.b(bl);
                bhj_12.a(l);
                bhj_12.b(l2);
                continue;
            }
            c.warn((Object)("Achievement inexistant : Id=" + n8));
        }
        n3 = byteBuffer.getInt();
        for (n = 0; n < n3; ++n) {
            n2 = byteBuffer.getInt();
            bhx_2 bhx_22 = (bhx_2)this.g.get(n2);
            if (bhx_22 != null) {
                bhx_22.a(true);
                continue;
            }
            c.warn((Object)("Objectif inexistant : Id=" + n2));
        }
        n = byteBuffer.get() & 0xFF;
        for (n2 = 0; n2 < n; n2 += 1) {
            this.i.add(byteBuffer.getInt());
        }
        this.e();
        if (this.k != null) {
            this.k.a(this);
        }
    }

    public void x(int n) {
        long l = System.currentTimeMillis();
        long l2 = this.l.get(n);
        if (l2 == 0L || l2 + 30000L > l) {
            this.l.put(n, l);
            this.k.a(n);
        }
    }

    @Override
    public boolean m(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 == null) {
            return false;
        }
        return rl_0.b(bhj_12, wn_0.a.a());
    }

    @Override
    public void a(rp_0 rp_02, int n) {
    }

    @Override
    public void b(rp_0 rp_02, int n) {
    }

    @Override
    public void c(rp_0 rp_02, int n) {
    }

    public List<bhj_1> n(int n) {
        bhq_1 bhq_12 = bhp_1.a.b(n);
        return bhq_12 != null && bhq_12.d() != null ? ImmutableList.copyOf(bhq_12.d()) : ImmutableList.of();
    }

    public void y(int n) {
        bhj_1 bhj_12 = (bhj_1)this.f.get(n);
        if (bhj_12 == null) {
            c.error((Object)("Unknown achievement for reset " + n));
            return;
        }
        bhj_12.C();
        ArrayList<bhx_2> arrayList = bhj_12.r();
        for (int k = 0; k < arrayList.size(); ++k) {
            bhx_2 bhx_22 = arrayList.get(k);
            this.g.put(bhx_22.c(), (Object)bhx_22);
            bhx_2 bhx_23 = bhp_1.a.c(bhx_22.c());
            bic_1[] bic_1Array = bhx_23.g();
            for (int i2 = 0; bic_1Array != null && i2 < bic_1Array.length; ++i2) {
                this.a(bic_1Array[i2].a(), 0L);
            }
        }
        if (this.k != null) {
            this.k.d(bhj_12);
        }
    }

    public boolean z(int n) {
        return this.l(n) || this.p(n);
    }
}

