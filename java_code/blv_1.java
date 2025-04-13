/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from blV
 */
public class blv_1
implements YT,
adv_1 {
    private static final int a = 3000;
    private final blx_1 b;
    private FreeParticleSystem c;
    private final TIntArrayList d = new TIntArrayList();
    private int e;

    blv_1(blx_1 blx_12) {
        this.b = blx_12;
        adi_2.a().a(this, 3000L, -1);
    }

    void a() {
        adi_2.a().a(this);
        adi_2.a().a(this, 3000L, -1);
        this.c();
    }

    void a(blv_1 blv_12) {
        this.d();
        if (blv_12.c != null) {
            this.a(blv_12.c.B, blv_12.b.bA());
        }
    }

    void c() {
        this.g();
    }

    void d() {
        if (this.c == null) {
            return;
        }
        if (this.b.bm()) {
            this.b.bv().b(this);
        }
        aik_0.a().b(this.c.ac());
        this.c = null;
    }

    private void a(int n) {
        int n2 = this.b.bA();
        this.a(n, n2);
    }

    private void a(int n, int n2) {
        if (this.c != null) {
            throw new UnsupportedOperationException("Tentative d'ajout de particule d'apparence sans avoir d\u00e9s-appliqu\u00e9 l'ancienne");
        }
        biI biI2 = this.b.bv();
        this.c = aij_0.a().a(n, 0);
        this.c.a(biI2, 1.0f, 2);
        this.c.a(n2);
        this.c.b(biI2.at());
        aik_0.a().b(this.c);
        biI2.a(this);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        this.h();
        this.f();
        return false;
    }

    private void f() {
        int n = this.i();
        if (this.c != null && this.c.ad() != n) {
            this.d();
        }
        if (n == -1) {
            return;
        }
        if (this.c == null) {
            this.a(n);
        }
    }

    private void g() {
        this.d.clear();
        if (euv_2.a.b(this.b.U_(), this.b.a_())) {
            return;
        }
        int n = this.i();
        if (this.b.bz() == null && !this.b.cX()) {
            int n2;
            fcu_0 fcu_02;
            int n3;
            Object object;
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 != null && ((byn_1)(object = bmr_12.dE())).d() && ((byn_1)object).a().f(this.b.a_())) {
                this.d.add(800255);
            }
            if ((n3 = biZ.a(fcu_02 = (object = this.b.fE()).w())) != -1) {
                this.d.add(n3);
            }
            if ((n2 = biY.a(this.b)) != -1) {
                this.d.add(n2);
            }
        }
        this.e = this.d.indexOf(n);
    }

    private void h() {
        if (this.d.isEmpty()) {
            this.e = -1;
            return;
        }
        this.e = (this.e + 1) % this.d.size();
    }

    private int i() {
        if (this.e >= 0 && this.e < this.d.size()) {
            return this.d.get(this.e);
        }
        return -1;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(boolean bl, YU yU) {
        this.c.b(bl);
    }

    public void e() {
        this.d();
        adi_2.a().a(this);
    }
}

