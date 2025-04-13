/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

public class cYA
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cYA.class);
    public static final cYA a = new cYA();
    private ans_1 c;
    private boolean d = true;
    private bvw_1 e;
    private long f = -1L;

    public static cYA a() {
        return a;
    }

    private cYA() {
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17249: {
                fvE fvE2 = (fvE)fpm_0.b().a("eventsCalendarCreateDialog", cfi_0.a("eventsCalendarCreateDialog"), 256L, (short)10000);
                this.e = new bvw_1();
                this.e.a(bvt_2.a().c(), bvt_2.a().e() + 1, bvt_2.a().f());
                fis_1.a().a("calendar.event.editable", this.e);
                cdw_0.n().z();
                return false;
            }
            case 19727: {
                dfc dfc2 = (dfc)adt_12;
                if (dfc2.i()) {
                    dgb dgb2 = (dgb)adt_12;
                    this.e.a(dgb2.k());
                    this.e.c(dgb2.o());
                    if (this.e.a()) {
                        this.e.a(dgb2.p());
                        this.e.b(dgb2.q());
                    }
                    czi_1 czi_12 = new czi_1();
                    bmr_1 bmr_12 = azu_0.j().k();
                    eLo eLo2 = this.e.l();
                    czi_12.a(eLo2);
                    eLo2.a(bmr_12.a_(), bmr_12.dp());
                    bvs_2.a().a(eLo2);
                    azu_0.j().K().c(czi_12);
                    bvt_2.a().g();
                }
                fpm_0.b().o("eventsCalendarCreateDialog");
                this.e = null;
                return false;
            }
            case 19515: {
                dgc dgc2 = (dgc)adt_12;
                if (dgc2.k() == null) {
                    return false;
                }
                this.e = new bvw_1();
                this.e.b(dgc2.k().l());
                fpm_0.b().a("eventsCalendarEditDialog", cfi_0.a("eventsCalendarEditDialog"), 256L, (short)10000);
                cdw_0.n().z();
                fis_1.a().a("calendar.event.editable", this.e);
                boolean bl = this.e.l().d() == azu_0.j().k().a_() || this.e.l().e() == 3 && emp_0.b(azu_0.j().n().v(), emq_0.bf);
                fis_1.a().a("calendar.event.editable.isOwner", bl);
                return false;
            }
            case 16188: {
                dfc dfc3 = (dfc)adt_12;
                if (dfc3.i()) {
                    dgb dgb3 = (dgb)adt_12;
                    this.e.a(dgb3.k());
                    this.e.c(dgb3.o());
                    if (this.e.a()) {
                        this.e.a(dgb3.p());
                        this.e.b(dgb3.q());
                    }
                    this.e.n();
                    bvt_2.a().g();
                }
                fpm_0.b().o("eventsCalendarEditDialog");
                this.e = null;
                return false;
            }
            case 16206: {
                if (fpm_0.b().q("calendarDialog")) {
                    fpm_0.b().o("calendarDialog");
                } else {
                    dfc dfc4 = (dfc)adt_12;
                    this.d = dfc4.i();
                    bvr_2 bvr_22 = new bvr_2();
                    wu_0 wu_02 = this.d ? this.e.l().a() : this.e.l().m();
                    bvr_22.a(wu_02);
                    fis_1.a().a("calendar.editable", bvr_22);
                    fpm_0.b().a("calendarDialog", cfi_0.a("calendarDialog"), 256L, (short)10000);
                    cdw_0.n().z();
                }
                return false;
            }
            case 19786: {
                dfc dfc5 = (dfc)adt_12;
                if (this.d) {
                    this.e.a((int)dfc5.g(), (int)dfc5.d(), dfc5.b(), dfc5.e(), dfc5.c());
                } else {
                    this.e.b((int)dfc5.g(), (int)dfc5.d(), dfc5.b(), dfc5.e(), dfc5.c());
                }
                fpm_0.b().o("calendarDialog");
                return false;
            }
            case 17746: {
                czn_1 czn_12 = new czn_1();
                czn_12.a(this.e.l().i());
                azu_0.j().K().c(czn_12);
                return false;
            }
            case 17421: {
                czu_2 czu_22 = new czu_2();
                czu_22.a(this.e.l().i());
                azu_0.j().K().c(czu_22);
                this.e.k();
                return false;
            }
            case 19073: {
                fpm_0.b().o("eventsCalendarEditDialog");
                bvs_2.a().c(this.e.m());
                bvt_2.a().g();
                czo_1 czo_12 = new czo_1();
                czo_12.a(this.e.l().i());
                azu_0.j().K().c(czo_12);
                this.e = null;
                return false;
            }
            case 19464: {
                dfc dfc6 = (dfc)adt_12;
                czw_2 czw_22 = new czw_2();
                czw_22.b(dfc6.d());
                czw_22.a(this.e.l().i());
                azu_0.j().K().c(czw_22);
                return false;
            }
            case 17033: {
                dfc dfc7 = (dfc)adt_12;
                czv_2 czv_22 = new czv_2();
                czv_22.b(dfc7.d());
                czv_22.a(this.e.l().i());
                azu_0.j().K().c(czv_22);
                return false;
            }
            case 19235: {
                TLongObjectIterator tLongObjectIterator = this.e.l().q().iterator();
                while (tLongObjectIterator.hasNext()) {
                    tLongObjectIterator.advance();
                    if (((String)tLongObjectIterator.value()).equals(azu_0.j().k().dp())) continue;
                    dgs_0 dgs_02 = new dgs_0();
                    dgs_02.a(Xd.b);
                    dgs_02.b((String)tLongObjectIterator.value());
                    add_2.b().a(dgs_02);
                }
                return false;
            }
            case 19430: {
                dfc dfc8 = (dfc)adt_12;
                czk_1 czk_12 = new czk_1();
                czk_12.a(this.e.l().i());
                czk_12.a(dfc8.h());
                azu_0.j().K().c(czk_12);
                return false;
            }
        }
        return true;
    }

    public void c() {
        if (this.e != null) {
            this.e.i();
        }
    }

    public void d() {
        if (this.e != null) {
            this.e.j();
        }
    }

    public void e() {
        this.f = -1L;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            return;
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("eventsCalendarDialog");
            fpm_0.b().e("wakfu.eventsCalendar");
            fis_1.a().a("eventsCalendar");
            cdw_0.n().A();
        }
    }
}

