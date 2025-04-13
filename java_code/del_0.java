/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from del
 */
public class del_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(del_0.class);
    private static final del_0 b = new del_0();
    private final bqt_0 c = new bqt_0();
    private bFN d;
    private ans_1 e;

    public static del_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (dez.d(adt_12)) {
            return false;
        }
        switch (adt_12.a()) {
            case 18370: {
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                this.c.a(l);
                return false;
            }
            case 17165: {
                dfc dfc3 = (dfc)adt_12;
                String string = dfc3.h();
                this.c.a(string);
                return false;
            }
            case 17128: {
                bqp_0 bqp_02;
                dfc dfc4 = (dfc)adt_12;
                String string = dfc4.h();
                this.c.a(string);
                List<bqp_0> list = this.c.a();
                if (list.size() == 1) {
                    bqp_02 = list.get(0);
                } else if (list.size() == 2 && list.get(0).a() == 10001) {
                    bqp_02 = list.get(1);
                } else {
                    return false;
                }
                List<bqs_0> list2 = bqp_02.c();
                if (list2.size() != 1) {
                    return false;
                }
                bqs_0 bqs_02 = list2.get(0);
                if (bqs_02 == null) {
                    return false;
                }
                this.b(bqs_02.a());
                return false;
            }
            case 17770: {
                dfc dfc5 = (dfc)adt_12;
                long l = dfc5.d();
                this.b(l);
                return false;
            }
        }
        return true;
    }

    public void b(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        bra_1 bra_12 = (bra_1)fjq_0.a(this.d.ao());
        bra_12.c(bmr_12, this.d, l);
    }

    public void a(bFN bFN2) {
        this.d = bFN2;
        if (bFN2.ao() == fjv.a) {
            this.c.a(bFN2.a_(), false);
        } else if (bFN2.ao() == fjv.e) {
            this.c.a(bFN2.a_(), true);
        } else {
            a.error((Object)"Type de voyage inconnu, on ne peut pas initialiser le provider");
        }
        azu_0.j().a(this);
    }

    public void c() {
        fvE fvE2 = (fvE)fpm_0.b().k("zaapDialog");
        if (fvE2 != null) {
            fvE2.setVisible(false);
        }
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
        if (bl) {
            return;
        }
        bqt_0.g = "";
        this.e = string -> {
            if (string.equals("zaapDialog")) {
                azu_0.j().b(del_0.a());
            }
        };
        fpm_0.b().a(this.e);
        fis_1.a().a("ticketOffice", this.c);
        fis_1.a().a("boatTicketOffice", false);
        fpm_0.b().a("zaapDialog", cfi_0.a("zaapDialog"), 1L, (short)10000);
        fpm_0.b().a("wakfu.zaap", cKs.class);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().b(this.e);
        fpm_0.b().o("zaapDialog");
        fis_1.a().a("ticketOffice");
        fpm_0.b().e("wakfu.zaap");
        this.d = null;
    }
}

