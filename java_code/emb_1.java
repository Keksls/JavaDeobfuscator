/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eMb
 */
public class emb_1<T extends efi_0, E extends Su> {
    private static final Logger b = Logger.getLogger(emb_1.class);
    final elm_0 a;
    private elz_0 c = new elz_0();

    public emb_1(elm_0 elm_02) {
        this.a = elm_02;
    }

    public fir_0 a(E e2, T t, aff_1 aff_12, boolean bl, int n, int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, apc_2 apc_22) {
        if (t == null) {
            b.error((Object)this.a.a("cast d'un conteneur null"));
            return fir_0.c;
        }
        if (this.c.a() && (!this.a.O().p() || this.a.O().q() != e2.a_())) {
            return fir_0.v;
        }
        int n3 = this.a(e2, bl, n, n2);
        if (n > n3) {
            return fir_0.f;
        }
        tg_0 tg_02 = this.a.g();
        if (aff_12 != null && tg_02 != null) {
            Object object;
            int n4 = aff_12.d();
            int n5 = aff_12.e();
            short s2 = aff_12.f();
            Object t2 = this.a.a(aff_12.d(), aff_12.e());
            if (!this.a(e2, t, n, n3, bl5, n4, n5)) {
                return fir_0.f;
            }
            if (!tg_02.o(n4, n5)) {
                return fir_0.e;
            }
            if (bl4 && tg_02.a(n4, n5)) {
                return fir_0.e;
            }
            if (!tg_02.c(n4, n5)) {
                return fir_0.e;
            }
            if (bl2 ? !this.a(e2, t, n4, n5, s2, n, n3, bl5) : !tg_02.d(n4, n5, s2)) {
                return fir_0.d;
            }
            if (apc_22 != null && !apc_22.b(e2, aff_12, t, this.a)) {
                return fir_0.s;
            }
            List<Su> list = this.a.a(aff_12);
            if (apc_22 != null && !list.isEmpty()) {
                boolean bl6 = false;
                int n6 = list.size();
                for (int k = 0; k < n6; ++k) {
                    object = list.get(k);
                    if (!this.c.b() && object instanceof epq_2 && ((epq_2)object).fW()) {
                        bl6 = true;
                        break;
                    }
                    if (!apc_22.b(e2, object, t, this.a)) continue;
                    bl6 = true;
                    break;
                }
                if (!bl6) {
                    return fir_0.s;
                }
            }
            for (efh_0 efh_02 : t) {
                aqd_1 aqd_12;
                if (efh_02.U() == null || efh_02.k() == null || tg_02.a(aqd_12 = efh_02.U(), aff_12.d(), aff_12.e(), aff_12.f(), e2.G(), e2.H(), e2.I(), e2.F())) continue;
                return fir_0.u;
            }
            if (bl3 && tg_02.a(n4, n5, s2)) {
                return fir_0.q;
            }
            if (t2 != null) {
                if (t2.a(eoz_1.u) && t2 != e2) {
                    return fir_0.s;
                }
                if (e2 instanceof epq_2 && t2 instanceof epq_2 && e2.a(eoz_1.j)) {
                    epq_2 epq_22 = (epq_2)e2;
                    epq_2 epq_23 = (epq_2)t2;
                    if (epq_22.dr() < epq_23.dr()) {
                        return fir_0.s;
                    }
                }
                boolean bl7 = false;
                for (Sl sl : t) {
                    if (sl.k() == null) {
                        bl7 = true;
                        break;
                    }
                    object = sl.k().a((apq_2)t2, (apq_2)e2);
                    switch ((apu_2)((Object)((abo_2)object).a())) {
                        case a: 
                        case e: 
                        case b: {
                            bl7 = true;
                        }
                    }
                }
                if (!bl7) {
                    return fir_0.b;
                }
            }
        } else if (apc_22 != null && !apc_22.b(e2, aff_12, t, this.a)) {
            return fir_0.s;
        }
        return fir_0.a;
    }

    int a(E e2, boolean bl, int n, int n2) {
        int n3 = e2.c(eps_0.j);
        if (e2 instanceof erc_2 && ((erc_2)e2).hh()) {
            ++n3;
        }
        if (n2 >= 1 && bl) {
            n2 = Math.max(n2 + n3, n);
        }
        if (e2.a(eoz_1.c) && n2 > 1) {
            n2 = 1;
        }
        return n2;
    }

    protected boolean a(E e2, T t, int n, int n2, short s2, int n3, int n4, boolean bl) {
        return emj_2.a(e2, this.a, n, n2, s2);
    }

    public boolean a(E e2, T t, int n, int n2, boolean bl, int n3, int n4) {
        int n5 = Math.abs(n3 - e2.G()) + Math.abs(n4 - e2.H());
        if (n5 >= n && n5 <= n2) {
            return true;
        }
        return n5 == 0 && bl;
    }

    public static boolean a(epq_2 epq_22, aff_1 aff_12, fio_0 fio_02, epq_2 epq_23, elm_0 elm_02) {
        return emb_1.a(epq_22, aff_12, fio_02, epq_23, elm_02, false);
    }

    public static boolean a(epq_2 epq_22, aff_1 aff_12, fio_0 fio_02, epq_2 epq_23, elm_0 elm_02, boolean bl) {
        Object Spell = fio_02.r();
        tg_0 tg_02 = elm_02.g();
        boolean bl2 = ((fin_0)Spell).b(fio_02, (Object)epq_22, (Object)aff_12, (Object)elm_02.h());
        boolean bl3 = ((fin_0)Spell).k(fio_02, epq_22, aff_12, elm_02.h());
        if (!bl3 && !bl2) {
            return true;
        }
        boolean bl4 = bl2;
        if (bl2) {
            if (aff_12.d() != epq_22.P_().d() && aff_12.e() != epq_22.P_().e()) {
                bl4 = false;
            }
            boolean bl5 = ((fin_0)Spell).e(fio_02, epq_22, (Object)aff_12, (Object)elm_02.h());
            if (bl4 && bl5) {
                uq_0 uq_02 = uq_0.a();
                uq_02.a((int)epq_22.W(), epq_22.X(), epq_22.fV());
                uq_02.a(tg_02);
                if (epq_23 != null) {
                    tg_02.b(epq_23);
                }
                boolean bl6 = uq_02.a(epq_22.gg(), aff_12, bl);
                tg_02.j();
                uq_02.release();
                if (!bl6) {
                    bl4 = false;
                }
            }
        }
        if (!bl3 || bl4) {
            return bl4;
        }
        return Math.abs(aff_12.d() - epq_22.P_().d()) == Math.abs(aff_12.e() - epq_22.P_().e());
    }

    public void a(elz_0 elz_02) {
        this.c = elz_02;
    }
}

