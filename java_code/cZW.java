/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cZW
implements ahr_1,
bwe_1 {
    protected static final Logger b = Logger.getLogger(cZW.class);
    private static final cZW c = new cZW();
    private ans_1 d;
    bsh e;
    private fyy_0 f;
    private fzu g;
    private aei_1 h;
    boolean i;
    private eee_0 j;
    private long k;

    public static cZW d() {
        return c;
    }

    private cZW() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (dez.d(adt_12)) {
            return false;
        }
        switch (adt_12.a()) {
            case 17204: {
                dfc dfc2 = (dfc)adt_12;
                int n = dfc2.c();
                if (n == -1) {
                    azu_0.j().b(this);
                    return false;
                }
                if (n == -2) {
                    this.e.g();
                    cZW.d().e();
                    return false;
                }
                cmx cmx2 = new cmx();
                cmx2.b(this.e.c());
                cmx2.c(n);
                azu_0.j().K().c(cmx2);
                this.e.i();
                bua_0.a.a(new buz_1(this.e.c(), n));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new czx_0(this);
            fpm_0.b().a(this.d);
            this.f = fpm_0.b().a("interactiveDialogDialog", cfi_0.a("interactiveDialogDialog"), 257L, (short)18000).getElementMap();
            this.h = new czy_0(this);
            this.g = new czz_0(this);
            fta_0.getInstance().addEventListener(frd_0.A, this.g, true);
            ans_0.D().e().a(this.h, true);
            this.e();
            fpm_0.b().a("wakfu.interactiveDialog", cHv.class);
            bwh_1.a.a(bwg_0.i, this);
        }
    }

    void f() {
        if (!this.i) {
            fuk_0 fuk_02 = (fuk_0)this.f.a("textView");
            fuk_02.j();
            this.a(true);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            Object object;
            this.e = null;
            fta_0.getInstance().removeEventListener(frd_0.A, this.g, true);
            ans_0.D().e().a(this.h);
            fpm_0.b().o("interactiveDialogDialog");
            fpm_0.b().b(this.d);
            fpm_0.b().e("wakfu.interactiveDialog");
            bYf.a.a();
            blx_1 blx_12 = null;
            if (this.j == eee_0.c) {
                blx_12 = bmf_2.a().c(this.k);
            } else if (this.j == eee_0.b && (object = (bMn)bMs.a.e((int)this.k)) != null) {
                blx_12 = ((bMn)object).m();
            }
            if (blx_12 != null) {
                object = blx_12.bv();
                ((abu)object).b(true);
            }
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(int n, eee_0 eee_02, long l) {
        bMn bMn2;
        this.k = l;
        this.j = eee_02;
        Object d2 = Sf.a.a(n);
        String string = this.a(eee_02, l);
        String string2 = this.b(eee_02, l).orElse(string);
        blx_1 blx_12 = null;
        if (eee_02 == eee_0.c) {
            blx_12 = bmf_2.a().c(l);
        } else if (eee_02 == eee_0.b && (bMn2 = (bMn)bMs.a.e((int)l)) != null) {
            blx_12 = bMn2.m();
        }
        if (blx_12 != null) {
            blx_12.bv().b(false);
        }
        this.e = new bsh((Sd)d2, eee_02, l, string, string2);
        fis_1.a().a("currentDialog", this.e);
        azu_0.j().a(this);
    }

    @NotNull
    private String a(eee_0 eee_02, long l) {
        bmv_1 bmv_12;
        if (eee_02 == eee_0.c) {
            bmv_1 bmv_13 = (bmv_1)bmf_2.a().c(l);
            String string = bmv_13.cD();
            return string.isEmpty() ? eee_02.a(bmv_13.gO()) : string;
        }
        bMn bMn2 = bMs.a.a((int)l);
        if (bMn2 != null && (bmv_12 = bMn2.m()) != null) {
            return bmv_12.cD();
        }
        return eee_02.a(this.k);
    }

    private Optional<String> b(eee_0 eee_02, long l) {
        if (eee_02 != eee_0.c) {
            return Optional.empty();
        }
        blx_1 blx_12 = bmf_2.a().c(l);
        String string = ((bmv_1)blx_12).cD();
        if (string.isEmpty() || "default".equalsIgnoreCase(string)) {
            return Optional.of(eee_02.a(blx_12.gO()));
        }
        return Optional.of(string);
    }

    public void a(int n) {
        if (this.e == null) {
            b.error((Object)("On tente de passer \u00e0 un dialogue d'id=" + n + " alors qu'il n'y a pas de dialog en cours !"));
            return;
        }
        if (n == 0) {
            azu_0.j().b(this);
            return;
        }
        this.e.a((Sd)Sf.a.a(n));
        this.e();
    }

    public void e() {
        this.i = false;
        fuk_0 fuk_02 = (fuk_0)this.f.a("textView");
        fuk_02.a(new daa(this, fuk_02));
        if (this.e != null) {
            bYf.a.a();
            bYf.a.b(this.e.b());
        }
    }

    void a(boolean bl) {
        for (bsg bsg2 : this.e.e()) {
            bsg2.a(bl);
        }
        this.i = true;
    }

    @Override
    public void a(epq_2 epq_22) {
        if (epq_22 != azu_0.j().k()) {
            return;
        }
        azu_0.j().b(this);
    }
}

