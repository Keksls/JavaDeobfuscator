/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eMG
 */
final class emg_2
extends emb_1<fio_0, epq_2> {
    private static final Logger b = Logger.getLogger(emg_2.class);
    private final enx_1 c = new enx_1();
    private boolean d = true;

    emg_2(elm_0 elm_02) {
        super(elm_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    fir_0 a(epq_2 epq_22, fio_0 fio_02, aff_1 aff_12, boolean bl) {
        fir_0 fir_02;
        if (fio_02 == null) {
            b.error((Object)this.a.a("casting a null SpellLevel"));
            return fir_0.c;
        }
        Object Spell = fio_02.r();
        if (Spell == null) {
            b.error((Object)this.a.a("casting a SpellLevel with a null spell"));
            return fir_0.c;
        }
        if (emf_1.a(Spell)) {
            return fir_0.t;
        }
        if (epq_22.a(eoz_1.aO)) {
            return fir_0.y;
        }
        if (enp_2.a.h(ens_2.aI).contains(((fin_0)Spell).i())) {
            return fir_0.y;
        }
        if (!emf_1.a(epq_22, Spell)) {
            return fir_0.s;
        }
        if (bl) {
            if (!emf_1.c(epq_22, fio_02, Spell)) {
                return fir_0.g;
            }
            if (!emf_1.b(epq_22, fio_02, Spell)) {
                return fir_0.h;
            }
            if (!emf_1.a(epq_22, fio_02, Spell)) {
                return fir_0.i;
            }
            if (!emf_1.a(epq_22, eps_0.J, fio_02, Spell)) {
                return fir_0.j;
            }
            if (!emf_1.d(epq_22, fio_02, Spell)) {
                return fir_0.k;
            }
            if (!emf_1.e(epq_22, fio_02, Spell)) {
                return fir_0.l;
            }
        }
        if (!(fir_02 = epq_22.gh().b(epq_22, fio_02, (int)this.a.O().u())).a()) {
            return fir_02;
        }
        int n = ((fin_0)Spell).j(fio_02, epq_22, aff_12, this.a.h());
        int n2 = ((fin_0)Spell).i(fio_02, epq_22, aff_12, this.a.h());
        boolean bl2 = ((fin_0)Spell).d(fio_02, (Object)epq_22, (Object)aff_12, (Object)this.a.h());
        int n3 = this.a(epq_22, bl2, n, n2);
        this.c.a(this.a, epq_22, fio_02, n, n3, aff_12);
        if (this.d) {
            this.c.a();
        }
        fir_0 fir_03 = fir_0.z;
        try {
            if (aff_12 != null) {
                Object t = this.a.a(aff_12.d(), aff_12.e());
                if (!this.a(epq_22, aff_12, fio_02, (epq_2)t, this.a, n, n3)) {
                    fir_0 fir_04 = fir_0.r;
                    return fir_04;
                }
                List<Su> list = this.a.a(aff_12);
                for (Su su : list) {
                    fir_0 fir_05 = epq_22.gh().a(epq_22, fio_02, (int)this.a.O().u(), su);
                    if (fir_05.a()) continue;
                    fir_0 fir_06 = fir_05;
                    return fir_06;
                }
            }
            fir_03 = this.a(epq_22, fio_02, aff_12, bl2, n, n2, ((fin_0)Spell).a(fio_02, (Object)epq_22, (Object)aff_12, (Object)this.a.h()), ((fin_0)Spell).f(fio_02, epq_22, (Object)aff_12, (Object)this.a.h()), ((fin_0)Spell).n(), ((fin_0)Spell).l(fio_02, epq_22, aff_12, this.a.h()), ((fin_0)Spell).p());
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            this.c.h();
        }
        return fir_03;
    }

    @Override
    public boolean a(epq_2 epq_22, fio_0 fio_02, int n, int n2, boolean bl, int n3, int n4) {
        if (((fin_0)fio_02.r()).b(fic_0.n) && this.a(epq_22, n3, n4)) {
            return true;
        }
        if (((fin_0)fio_02.r()).b(fic_0.p) && this.b(epq_22, n3, n4)) {
            return true;
        }
        if (!((fin_0)fio_02.r()).b(fic_0.l)) {
            return super.a(epq_22, fio_02, n, n2, bl, n3, n4);
        }
        if (!this.c.b()) {
            return super.a(epq_22, fio_02, n, n2, bl, n3, n4);
        }
        boolean bl2 = this.c.c();
        if (!bl2) {
            return super.a(epq_22, fio_02, n, n2, bl, n3, n4);
        }
        return bl2;
    }

    private boolean a(epq_2 epq_22, int n, int n2) {
        List<sr_0> list = this.a.i().c(new aff_1(n, n2));
        boolean bl = false;
        for (sr_0 sr_02 : list) {
            if (sr_02.w() != ele_0.q.a() || sr_02.Y() != epq_22.Y()) continue;
            bl = true;
        }
        return bl;
    }

    private boolean b(epq_2 epq_22, int n, int n2) {
        List<sr_0> list = this.a.i().c(new aff_1(n, n2));
        boolean bl = false;
        for (sr_0 sr_02 : list) {
            Su su;
            if (sr_02.w() != ele_0.b.a() || (su = sr_02.v()) == null || su.a_() != epq_22.a_()) continue;
            bl = true;
        }
        return bl;
    }

    @Override
    protected boolean a(epq_2 epq_22, fio_0 fio_02, int n, int n2, short s2, int n3, int n4, boolean bl) {
        if (((fin_0)fio_02.r()).b(fic_0.n) && this.a(epq_22, n, n2)) {
            return true;
        }
        if (((fin_0)fio_02.r()).b(fic_0.p) && this.b(epq_22, n, n2)) {
            return true;
        }
        if (!((fin_0)fio_02.r()).b(fic_0.l)) {
            return super.a(epq_22, fio_02, n, n2, s2, n3, n4, bl);
        }
        if (!this.c.b()) {
            return super.a(epq_22, fio_02, n, n2, s2, n3, n4, bl);
        }
        boolean bl2 = this.c.e();
        if (!bl2) {
            return super.a(epq_22, fio_02, n3, n4, bl, n, n2) && emg_2.a(epq_22, new aff_1(n, n2), fio_02, null, this.a) && super.a(epq_22, fio_02, n, n2, s2, n3, n4, bl);
        }
        return bl2;
    }

    boolean a(epq_2 epq_22, aff_1 aff_12, fio_0 fio_02, epq_2 epq_23, elm_0 elm_02, int n, int n2) {
        Object Spell = fio_02.r();
        boolean bl = ((fin_0)Spell).b(fio_02, (Object)epq_22, (Object)aff_12, (Object)elm_02.h());
        boolean bl2 = ((fin_0)Spell).k(fio_02, epq_22, aff_12, elm_02.h());
        if (!bl && !bl2) {
            return true;
        }
        boolean bl3 = ((fin_0)Spell).c(fio_02, (Object)epq_22, (Object)aff_12, (Object)elm_02.h());
        boolean bl4 = emg_2.a(epq_22, aff_12, fio_02, epq_23, elm_02, bl3);
        if (!((fin_0)Spell).b(fic_0.l)) {
            return bl4;
        }
        if (!this.c.b()) {
            return bl4;
        }
        boolean bl5 = this.c.d();
        if (!bl5) {
            boolean bl6 = ((fin_0)Spell).l(fio_02, epq_22, aff_12, elm_02.h());
            boolean bl7 = super.a(epq_22, fio_02, n, n2, bl6, aff_12.d(), aff_12.e());
            return bl7 && bl4;
        }
        return bl5;
    }

    public void a() {
        this.d = false;
    }

    public void b() {
        this.d = true;
    }
}

