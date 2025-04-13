/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

public final class bMn
extends fgy_0
implements fjc_0 {
    private long b;
    private fgP c;
    private bnh_0 d;
    private bnh_0 e;
    bwt_2 f = null;
    private final ArrayList<Yi> g;
    private final TIntArrayList h;
    private final TIntArrayList i;
    private final TIntArrayList j;
    private final TIntArrayList k;
    private final ArrayList<bmx_0> l;
    private final EnumMap<fjb_0, fja_0> m;
    private final bMw n;
    private final bMq o;
    private final aff_1 p = new aff_1();
    private int[] q = null;
    private fat<blx_2> r;

    bMn(int n) {
        super(n);
        this.m = new EnumMap(fjb_0.class);
        this.g = new ArrayList();
        this.i = new TIntArrayList();
        this.j = new TIntArrayList();
        this.n = new bMw(this);
        this.l = new ArrayList();
        this.k = new TIntArrayList();
        this.h = new TIntArrayList();
        this.o = new bMq(this);
    }

    public String d() {
        return bae.h().a(48, (long)this.B(), new Object[0]);
    }

    public long e() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public aff_1 f() {
        return this.p;
    }

    public void a(int n, int n2, short s2) {
        this.p.c(n, n2, s2);
    }

    public int[] g() {
        return this.q;
    }

    public void a(int[] nArray) {
        this.q = nArray;
    }

    public bnh_0 h() {
        return this.d;
    }

    public void a(bnh_0 bnh_02) {
        this.d = bnh_02;
        this.f = new bwt_2(bnh_02);
        this.d.a(new bMo(this));
    }

    public void i() {
        if (this.f != null) {
            this.f.a();
        }
    }

    public void j() {
        if (this.f != null) {
            this.f.b();
        }
    }

    public bwt_2 k() {
        return this.f;
    }

    public fgP l() {
        return this.c;
    }

    public void a(fgP fgP2) {
        this.c = fgP2;
    }

    public bmv_1 m() {
        blx_1 blx_12 = bmf_2.a().c(this.b);
        if (blx_12 instanceof bmv_1) {
            return (bmv_1)blx_12;
        }
        if (blx_12 != null) {
            a.error((Object)("Un protecteur a un uid qui ne correspond pas \u00e0 celui d'un NPC uid=" + this.b));
        }
        return null;
    }

    public String n() {
        String string;
        bmf_0 bmf_02 = (bmf_0)this.E();
        if (bmf_02 == null) {
            return null;
        }
        if (bae.h().a(66, (long)bmf_02.e()) && (string = bae.h().a(66, (long)bmf_02.e(), new Object[0])) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public bnh_0 o() {
        return this.e;
    }

    public void b(bnh_0 bnh_02) {
        this.e = bnh_02;
    }

    public ArrayList<Yi> p() {
        return this.g;
    }

    public TIntArrayList q() {
        return this.i;
    }

    public TIntArrayList r() {
        return this.h;
    }

    public TIntArrayList s() {
        return this.j;
    }

    public TIntArrayList t() {
        return this.k;
    }

    public EnumMap<fjb_0, fja_0> u() {
        return this.m;
    }

    public bMw v() {
        return this.n;
    }

    @Override
    public fgk_0 w() {
        return this.n.f();
    }

    public void a(bmx_0 bmx_02) {
        this.l.add(bmx_02);
    }

    public Iterator<bmx_0> x() {
        return this.l.iterator();
    }

    public bMq y() {
        return this.o;
    }

    @Override
    public float a(fjb_0 fjb_02) {
        return this.m.get((Object)fjb_02).a();
    }

    @Override
    public void a(fjb_0 fjb_02, float f2) {
        this.m.get((Object)fjb_02).a(f2);
    }

    @Override
    public long a(eyg_2 eyg_22, fjb_0 fjb_02, long l) {
        if (!this.a(eyg_22)) {
            return 0L;
        }
        fja_0 fja_02 = this.m.get((Object)fjb_02);
        return fja_02 != null ? fja_02.a(l) : 0L;
    }

    @Override
    public void a(fjb_0 fjb_02, int n) {
        throw new UnsupportedOperationException("Non support\u00e9 dnas le client");
    }

    @Override
    public boolean a(eyg_2 eyg_22) {
        return eyg_22 instanceof blx_1;
    }

    @Override
    public aff_1 P_() {
        return this.p;
    }

    public void a(fat<blx_2> fat2) {
        this.r = fat2;
    }

    public fat<blx_2> z() {
        return this.r;
    }

    @Override
    public /* synthetic */ fgr_0 A() {
        return this.v();
    }
}

