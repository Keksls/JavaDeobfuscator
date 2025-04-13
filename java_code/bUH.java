/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class bUH
extends fdb {
    private boolean g;
    private boolean h;
    private bUF i;
    private fhD j;
    private boolean k;

    private bUH(@NotNull faU faU2) {
        super(faU2);
    }

    public static bUH a(@NotNull faU faU2) {
        bUH bUH2 = new bUH(faU2);
        bUH2.b();
        bUH2.a(new bUG(bUH2));
        return bUH2;
    }

    public void a(bUF bUF2) {
        this.i = bUF2;
    }

    public bUF a() {
        return this.i;
    }

    @Override
    public void a(faV faV2) {
        super.a(faV2);
        this.i = new bUG(this);
        this.g = faV2.c();
        this.h = faV2.j();
    }

    @Override
    public void a(Collection<fct_0> collection) {
        for (fct_0 fct_02 : collection) {
            if (fct_02 != fct_0.a) continue;
            bua_0.a.a(new bug_1());
            break;
        }
        super.a(collection);
    }

    @Override
    public void a(@NotNull faX faX2) {
        boolean bl;
        super.a(faX2);
        blx_1 blx_12 = (blx_1)this.b;
        boolean bl2 = bl = blx_12 instanceof bmr_1 && blx_12.U_() > 0L;
        if (blx_12.bo() && bl && !euv_2.a.b(blx_12.U_(), blx_12.a_())) {
            ebe_0 ebe_02;
            Optional optional = bhh_1.a(end_0.b);
            if (optional.isPresent() && (ebe_02 = (ebe_0)optional.get()).a() == this.b.a_() && ebe_02.b() != faX2.c()) {
                ebe_02.a(faX2.c());
            }
            bUW.a().a(faX2);
            Cr.b(bUW.a().b());
            fis_1.a().a((ajf_1)azu_0.j().k(), "hasNation");
        }
        if (this.i != null) {
            this.i.a(faX2);
        }
    }

    @Override
    public void b(@NotNull faX faX2) {
        super.b(faX2);
        this.g = false;
        this.h = false;
    }

    @Override
    public void b() {
        super.b();
        this.c.clear();
        this.f = false;
        if (this.e != null) {
            this.e.h();
            this.d();
        }
    }

    @Override
    public boolean c() {
        return this.g || super.c();
    }

    public void a(boolean bl) {
        this.g = bl;
        if (this.i != null) {
            this.i.a();
        }
    }

    @Override
    public void a(int n) {
        this.d = n;
        if (this.e != null) {
            a.info((Object)"Cooldown de Purgation d\u00e9j\u00e0 d\u00e9marr\u00e9");
            return;
        }
        this.e = new bUI(this);
        ado_1.a().a(this.e, 1000L, -1);
        this.e.e();
    }

    @Override
    public void d() {
        ado_1.a().b(this.e);
        this.D();
        this.e = null;
        this.d = -1;
    }

    public void e() {
        ado_1.a().b(this.e);
        this.e.d();
        this.e = null;
        this.d = -1;
    }

    public void b(int n) {
        if (this.i != null) {
            this.i.a(n);
        }
    }

    public void a(int n, int n2) {
        fbm_0 fbm_02 = fbo_0.a().a(n2);
        int n3 = this.c.get(n) - n2;
        ((bnh_1)this.b).a(n, this, fbm_02, this.c(n), n3);
        if (this.d == n) {
            if (this.e != null) {
                this.e.a(n3, n2);
            } else {
                a.warn((Object)"Donn\u00e9es erron\u00e9es dans le client, on ne peut pas purger une peine de prison sans avoir de cooldown");
            }
        }
        if (this.i != null) {
            this.i.a(n, n2);
        }
    }

    public faU f() {
        return this.b;
    }

    public void g() {
        if (this.i != null) {
            this.i.b();
        }
    }

    public void h() {
        if (this.i != null) {
            this.i.g();
        }
    }

    public void i() {
        if (this.i != null) {
            this.i.c();
        }
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        if (this.i != null) {
            this.i.e();
        }
    }

    @Override
    public boolean j() {
        return this.h;
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    @Override
    public void a(fcu_0 fcu_02) {
        super.a(fcu_02);
        this.i();
        if (this.b == azu_0.j().k()) {
            bdk_1.a().c();
        }
    }

    @Override
    public void a(fhD fhD2) {
        this.j = fhD2;
    }

    @Override
    public fhD k() {
        if (this.b instanceof bmr_1) {
            return ((bmr_1)this.b).ba();
        }
        return this.j == null ? fhD.a : this.j;
    }

    @Override
    public void d(boolean bl) {
        this.k = bl;
    }

    @Override
    public boolean l() {
        return this.k;
    }
}

