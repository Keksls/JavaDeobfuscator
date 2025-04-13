/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from dcx
 */
public class dcx_0
extends cVb {
    protected static final Logger b = Logger.getLogger(dcx_0.class);
    private static final dcx_0 c = new dcx_0();
    private exi_2 d;
    private bew_0 e;
    private final TLongShortHashMap f = new TLongShortHashMap();
    private fzi g;
    private ans_1 h;

    public static dcx_0 d() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19480: {
                cqb_0 cqb_02 = new cqb_0(this.e.a_());
                azu_0.j().K().c(cqb_02);
                this.d = null;
                this.f.clear();
                fis_1.a().a("seedSpreaderItem", (Object)null);
                fis_1.a().a("seedSpreaderDirty", false);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (!bl) {
            if (this.e == null) {
                return;
            }
            fis_1.a().a("seedSpreaderItem", this.d);
            fis_1.a().a("seedSpreaderDirty", false);
            this.g = new dcy(this);
            cff_0.b().a(this.g);
            this.h = new dca_0(this);
            fpm_0.b().a(this.h);
            fpm_0.b().a("seedSpreaderDialog", cfi_0.a("seedSpreaderDialog"), 1L, (short)10000);
            fpm_0.b().a("wakfu.seedSpreader", cjt_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (!bl) {
            cjt_0.setDraggedItem(null);
            this.d = null;
            this.f.clear();
            azu_0.j().b(this.e.Z());
            fis_1.a().a("seedSpreaderItem");
            fis_1.a().a("seedSpreaderDirty");
            fpm_0.b().b(this.h);
            fpm_0.b().o("seedSpreaderDialog");
            fpm_0.b().e("wakfu.seedSpreader");
        }
    }

    public void a(bew_0 bew_02) {
        this.e = bew_02;
    }

    public exi_2 e() {
        return this.d;
    }

    public void a(int n, short s2) {
        if (n <= 0) {
            return;
        }
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            b.error((Object)("Impossible de retrouver l'item d'id=" + n));
            return;
        }
        if (this.d == null) {
            this.d = new exi_2((ezr_0)r2);
        }
        this.d.a(s2);
        fis_1.a().a("seedSpreaderItem", this.d);
    }

    public boolean a(exk_2 exk_22) {
        eyw_1 eyw_12 = exk_22.T().p();
        if (!(eyw_12 instanceof bjc_2)) {
            return false;
        }
        bjc_2 bjc_22 = (bjc_2)eyw_12;
        int n = bjc_22.i();
        bNI bNI2 = (bNI)bNJ.a().a(n);
        if (bNI2 == null) {
            return false;
        }
        return bNI2 instanceof bNF;
    }

    private void a(fso fso2, azj_2 azj_22) {
        fqj fqj2 = fso2.getAppearance();
        azf_2 azf_22 = new azf_2(azf_2.e.i());
        fqj2.removeTweensOfType(fjp_2.class);
        fqj2.setModulationColor(azf_22);
        fjp_2 fjp_22 = new fjp_2(azf_22, azj_22, fqj2, 0, 300, -1, fjw_2.b);
        fqj2.addTween(fjp_22);
    }

    public void f() {
        if (!azu_0.j().c(dcx_0.d())) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("seedSpreaderDialog");
        fso fso2 = (fso)fyy_02.a("seedSlot");
        fso2.getAppearance().removeTweensOfType(fjp_2.class);
    }

    public boolean g() {
        return !this.f.isEmpty();
    }

    public boolean b(long l) {
        return this.f.contains(l);
    }
}

