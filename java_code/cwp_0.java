/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWp
 */
public class cwp_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cwp_0.class);
    private static final cwp_0 b = new cwp_0();
    private ans_1 c;
    private bkO d;

    public static cwp_0 a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new cWq(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("bookcaseDialog", cfi_0.a("bookcaseDialog"), 1L, (short)10000);
            cdw_0.n().c(600012L);
            fpm_0.b().a("wakfu.bookcase", cFI.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("bookcaseDialog");
            fis_1.a().a("bookcase");
            cdw_0.n().c(600013L);
            fpm_0.b().e("wakfu.bookcase");
        }
    }

    private void a(exk_2 exk_22, short s2) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!exk_22.T().b(ext_1.e)) {
            return;
        }
        bat_2 bat_22 = this.d.a();
        bgf_1 bgf_12 = bat_22.aH_();
        if (bgf_12.m() != bmr_12.a_() && !cSW.a(bgf_12.m())) {
            return;
        }
        if (!bat_22.Z().b(exk_22, s2)) {
            return;
        }
        eug_1 eug_12 = new eug_1(exk_22.a(), (byte)s2);
        cnJ cnJ2 = new cnJ();
        cnJ2.a(bat_22.a_());
        cnJ2.a(eug_12);
        azu_0.j().K().c(cnJ2);
    }

    private void a(short s2) {
        bmr_1 bmr_12 = azu_0.j().k();
        bat_2 bat_22 = this.d.a();
        bgf_1 bgf_12 = bat_22.aH_();
        if (bgf_12.m() != bmr_12.a_() && !cSW.a(bgf_12.m())) {
            return;
        }
        euj_1 euj_12 = new euj_1((byte)s2);
        cnJ cnJ2 = new cnJ();
        cnJ2.a(this.d.a().a_());
        cnJ2.a(euj_12);
        azu_0.j().K().c(cnJ2);
    }

    private void a(byte by, byte by2) {
        bmr_1 bmr_12 = azu_0.j().k();
        bat_2 bat_22 = this.d.a();
        bgf_1 bgf_12 = bat_22.aH_();
        if (bgf_12.m() != bmr_12.a_() && !cSW.a(bgf_12.m())) {
            return;
        }
        euk_1 euk_12 = new euk_1(by, by2);
        cnJ cnJ2 = new cnJ();
        cnJ2.a(this.d.a().a_());
        cnJ2.a(euk_12);
        azu_0.j().K().c(cnJ2);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17894: {
                dgL dgL2 = (dgL)adt_12;
                this.a(dgL2.o(), dgL2.e());
                return false;
            }
            case 18250: {
                dfc dfc2 = (dfc)adt_12;
                byte by = dfc2.b();
                byte by2 = (byte)dfc2.e();
                this.a(by, by2);
                return false;
            }
            case 18730: {
                dgL dgL3 = (dgL)adt_12;
                this.a(dgL3.e());
                return false;
            }
            case 17057: {
                dgL dgL4 = (dgL)adt_12;
                exk_2 exk_22 = dgL4.o();
                if (exk_22 != null) {
                    ((bim_1)exk_22.T().p()).g();
                }
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

    public void a(bat_2 bat_22) {
        this.d = new bkO(bat_22);
        fis_1.a().a("bookcase", this.d);
        azu_0.j().a(this);
    }
}

