/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXs
 */
public class cxs_0
implements ahr_1,
fjd_2 {
    private static final cxs_0 a = new cxs_0();
    private ans_1 b;

    public static cxs_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17525: {
                dfz_0 dfz_02 = (dfz_0)adt_12;
                aUK aUK2 = dfz_02.k();
                return false;
            }
            case 16949: {
                dfz_0 dfz_03 = (dfz_0)adt_12;
                aUK aUK3 = dfz_03.k();
                if (aUK3 != null) {
                    aUK3.a(!aUK3.b());
                }
                return false;
            }
            case 17227: {
                dft dft2 = (dft)adt_12;
                aUK aUK4 = dft2.o();
                switch (dft2.k()) {
                    case 1: {
                        aUG.a(aUK4);
                        break;
                    }
                    case 2: {
                        aUG.b(aUK4);
                        break;
                    }
                    case 4: {
                        azu_0.j().k().dE().a(aUK4.j());
                        break;
                    }
                }
                return false;
            }
            case 18381: {
                dft dft3 = (dft)adt_12;
                aUK aUK5 = dft3.o();
                switch (dft3.k()) {
                    case 1: {
                        PJ pJ = new PJ();
                        pJ.a(aUK5.i());
                        azu_0.j().K().c(pJ);
                        break;
                    }
                    case 2: {
                        PK pK = new PK();
                        pK.a(aUK5.i());
                        azu_0.j().K().c(pK);
                    }
                }
                return false;
            }
            case 18998: {
                dfz_0 dfz_04 = (dfz_0)adt_12;
                aUK aUK6 = dfz_04.k();
                aUK6.b(true);
                fis_1.a().a((ajf_1)aUK6, "commentaryEdition");
                return false;
            }
            case 17874: {
                dfz_0 dfz_05 = (dfz_0)adt_12;
                String string = dfz_05.h();
                aUK aUK7 = dfz_05.k();
                aUK7.a(string);
                aUK7.b(false);
                fis_1.a().a((ajf_1)aUK7, "commentaryEdition", "commentary");
                PD pD = new PD();
                pD.a(aUK7.j());
                pD.b(string);
                azu_0.j().K().c(pD);
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
        if (!bl) {
            aUL.a().a(true);
            this.b = new cxt_0(this);
            fpm_0.b().a(this.b);
            fis_1.a().a("contact.list", aUL.a());
            fpm_0.b().a("contactListDialog", cfi_0.a("contactListDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.contactList", cGo.class);
            cdw_0.n().z();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            aUL.a().e().e();
            fpm_0.b().b(this.b);
            fpm_0.b().o("contactListDialog");
            fis_1.a().a("contact.list");
            fpm_0.b().e("wakfu.contactList");
            cdw_0.n().A();
        }
    }

    @Override
    public void a(String string) {
        if (string != null && !string.equals("contactListDialog")) {
            azu_0.j().b(this);
        }
    }
}

