/*
 * Decompiled with CFR 0.152.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

/*
 * Renamed from bvC
 */
public class bvc_2
extends ty_0<exk_2, bvd_2>
implements ajh_1 {
    public static final String i = "exchangeId";
    public static final String j = "localItemsExchange";
    public static final String k = "remoteItemsExchange";
    public static final String l = "localMoneyExchange";
    public static final String m = "remoteMoneyExchange";
    public static final String n = "remoteUserState";
    public static final String o = "localUserState";
    public static final String p = "kamaValueHasChanged";
    public static final String[] q = new String[]{"exchangeId", "localItemsExchange", "remoteItemsExchange", "localMoneyExchange", "remoteMoneyExchange", "remoteUserState", "localUserState", "kamaValueHasChanged"};
    private fzm_0 t = null;
    private static final NumberFormat u = DecimalFormat.getIntegerInstance();
    private ell_0 v = ell_0.a;
    protected long r;
    private long w;

    public bvc_2(long l, bvd_2 bvd_22, bvd_2 bvd_23) {
        super(l, bvd_22, bvd_23);
    }

    @Override
    protected boolean a(bvd_2 bvd_22) {
        bvd_22.k().a(true, false);
        bpu_2 bpu_22 = new bpu_2(this);
        if (bpu_22.g()) {
            bvd_22.a(bpu_22);
            bpu_22.a();
            return true;
        }
        return false;
    }

    @Override
    protected void b(bvd_2 bvd_22) {
        bpu_2 bpu_22 = bvd_22.m();
        if (bpu_22 != null) {
            bvd_22.o();
        }
    }

    @Override
    public void f(long l) {
        this.r = l;
    }

    public long o() {
        return this.r;
    }

    public void a(fzm_0 fzm_02) {
        this.t = fzm_02;
    }

    public fzm_0 p() {
        return this.t;
    }

    public boolean q() {
        return ((bvd_2)this.b).l();
    }

    @Override
    protected boolean i() {
        return true;
    }

    @Override
    protected boolean j() {
        return true;
    }

    @Override
    protected boolean m() {
        return this.v == ell_0.a;
    }

    @Override
    protected boolean l() {
        return false;
    }

    @Override
    public void a(long l, long l2) {
        bvd_2 bvd_22 = (bvd_2)this.a(l);
        if (bvd_22 == null) {
            a.error((Object)"[Trade] On essaye de modifier les kamas d'un echange pour un utilisateur qui n'y est pas");
            return;
        }
        if (l2 < 0L) {
            a.error((Object)("[Trade] Impossible de placer une quantit\u00e9 n\u00e9gative de kamas dans l'\u00e9change. La quantit\u00e9 de monnaie donn\u00e9e par " + bvd_22.h() + " n'a pas \u00e9t\u00e9 mise a jour"));
            return;
        }
        ((bvd_2)this.b).a(false);
        ((bvd_2)this.c).a(false);
        long l3 = l2;
        if (bvd_22.l()) {
            l3 = bvd_22.f() - l2;
        }
        bvd_22.d(l2);
        a.info((Object)("[Trade] Le joueur " + bvd_22.h() + " mets la somme de kamas \u00e0 " + l2));
        this.a(eLJ.a((ty_0)this, Ux.c, l, l3));
    }

    @Override
    public void a(bvd_2 bvd_22, exk_2 exk_22, short s2) {
        this.a(bvd_22, exk_22, s2, false);
        a.info((Object)("[Trade] Le joueur " + bvd_22.h() + " ajoute " + s2 + "x" + exk_22.N() + " (refId=" + exk_22.aT_() + ")"));
    }

    @Override
    public void a(bvd_2 bvd_22, exk_2 exk_22, short s2, boolean bl) {
        if (!this.c((TP)bvd_22)) {
            return;
        }
        if (s2 < 1) {
            a.error((Object)("[Trade] Cannot add less than 1 of an item, but got " + s2));
            return;
        }
        ((bvd_2)this.b).a(false);
        ((bvd_2)this.c).a(false);
        exk_2 exk_23 = (exk_2)bvd_22.a(exk_22.a());
        int n = Optional.ofNullable(exk_23).map(exk_2::e).orElse((short)0) + s2;
        if (this.l() && n > exk_22.e()) {
            a.warn((Object)String.format("[Trade] %d is adding too many items to exchange: %d but only has %d", bvd_22.g(), n, exk_22.e()));
            return;
        }
        if (exk_23 != null) {
            if (bl) {
                exk_23.a(s2);
            } else {
                exk_23.b(s2);
            }
        } else {
            exk_2 exk_24 = exk_22.v();
            exk_24.a(s2);
            bvd_22.a(exk_24.a(), exk_24);
        }
        if (!bl) {
            this.a(Uv.a(this, Ux.d, bvd_22.g(), exk_22, s2));
        }
    }

    @Override
    public void b(bvd_2 bvd_22, exk_2 exk_22, short s2) {
        super.b(bvd_22, exk_22, s2);
        a.info((Object)("[Trade] Le joueur " + bvd_22.h() + " retire " + s2 + "x" + exk_22.N() + " (refId=" + exk_22.aT_() + ")"));
    }

    @Override
    protected void n() {
        bvd_2 bvd_22 = this.z();
        bvd_2 bvd_23 = this.A();
        assert (bvd_22 != null && bvd_23 != null);
        a.info((Object)"[Trade] Fin de l'\u00e9change");
        String string = "[Trade] le joueur " + bvd_22.h() + " donne : " + bvd_22.f() + "K ; ";
        if (!bvd_22.b()) {
            for (Object object : bvd_22.j()) {
                string = string + ((exk_2)object).e() + "x" + ((exk_2)object).N() + " (refId=" + ((exk_2)object).aT_() + ") ";
            }
        }
        string = string + "\nle joueur " + bvd_23.h() + " donne : " + bvd_23.f() + "K ; ";
        if (!bvd_23.b()) {
            bmr_1 bmr_12 = azu_0.j().k();
            for (exk_2 exk_22 : bvd_23.j()) {
                string = string + exk_22.e() + "x" + exk_22.N() + " (refId=" + exk_22.aT_() + ") ";
                exk_2 exk_23 = exk_22.v();
                exg_2 exg_22 = bmr_12.da().c(exk_23);
                if (exg_22 != null) continue;
                a.error((Object)("[Trade] On a pas pu ajouter les " + exk_22.e() + "de " + exk_22.N() + " a l'inventaire local"));
            }
        }
        a.info((Object)string);
    }

    @Override
    public boolean e(long l) {
        return ((bvd_2)this.b).b(l) || ((bvd_2)this.c).b(l);
    }

    @Override
    public String[] d() {
        return q;
    }

    @Override
    public Object b(String string) {
        if (string.equals(i)) {
            return this.a();
        }
        if (string.equals(o)) {
            return this.v == ell_0.a ? (this.z().e() ? 1 : 0) : -1;
        }
        if (string.equals(n)) {
            return this.v == ell_0.a ? (this.A().e() ? 1 : 0) : -1;
        }
        if (string.equals(j)) {
            return this.c(this.z());
        }
        if (string.equals(k)) {
            return this.c(this.A());
        }
        if (string.equals(l)) {
            return this.w == 0L ? "" : bae.h().a(this.w);
        }
        if (string.equals(m)) {
            return u.format(this.A().f());
        }
        if (p.equals(string)) {
            return this.z().f() != this.w;
        }
        return null;
    }

    private Collection<exk_2> c(bvd_2 bvd_22) {
        if (!bvd_22.b()) {
            ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
            for (exk_2 exk_22 : bvd_22.j()) {
                if (exk_22.e() <= 0) continue;
                arrayList.add(exk_22);
            }
            return arrayList;
        }
        return null;
    }

    public void r() {
        fis_1.a().a((ajf_1)this, j);
    }

    public void s() {
        fis_1.a().a((ajf_1)this, k);
    }

    public void t() {
        fis_1.a().a((ajf_1)this, l);
    }

    public void u() {
        fis_1.a().a((ajf_1)this, m);
    }

    public void v() {
        fis_1.a().a((ajf_1)this, o);
    }

    public void w() {
        fis_1.a().a((ajf_1)this, n);
    }

    public ell_0 x() {
        return this.v;
    }

    public void a(ell_0 ell_02) {
        this.v = ell_02;
    }

    public String y() {
        return bae.h().a("exchange.error." + this.v, new Object[0]);
    }

    public bvd_2 z() {
        return (bvd_2)this.a(azu_0.j().k().a_());
    }

    public bvd_2 A() {
        return this.d(this.z());
    }

    @Override
    public void g(long l) {
        eyu_1 eyu_12 = azu_0.j().k().dK();
        this.w = eyu_12 != null ? Math.min(eyu_12.a(), l) : l;
        fis_1.a().a((ajf_1)this, p, l);
    }

    public long B() {
        return this.w;
    }
}

