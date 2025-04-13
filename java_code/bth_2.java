/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bTH
 */
public class bth_2
implements ajh_1 {
    public static final String a = "iconUrl";
    public static final String b = "name";
    public static final String d = "surface";
    public static final String e = "description";
    public static final String f = "effects";
    public static final String g = "sidoaNeed";
    public static final String h = "buildDelay";
    public static final String i = "conditions";
    public static final String j = "ressourcesCost";
    public static final String k = "kamasCost";
    public static final String l = "canBeDestroyed";
    public static final String[] m = new String[]{"iconUrl", "name", "surface", "description", "effects", "sidoaNeed", "buildDelay", "conditions", "ressourcesCost", "kamasCost", "canBeDestroyed"};
    private final etw_2 n;
    private final cco_1 o;

    public bth_2(etw_2 etw_22, cco_1 cco_12) {
        this.n = etw_22;
        this.o = cco_12;
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f();
        }
        if (string.equals(b)) {
            return this.c();
        }
        if (string.equals(k)) {
            etw_2 etw_22 = this.i();
            if (etw_22 == null) {
                return null;
            }
            long l = fkb_0.a(etw_22, bua_2.a.a());
            return bae.h().a(l);
        }
        if (string.equals(d)) {
            cdl_1 cdl_12 = (cdl_1)cdm_1.a.c(this.n.c());
            if (cdl_12 == null) {
                return "Mod\u00e8le de batiment inconnu";
            }
            return cdl_12.d() + "x" + cdl_12.e();
        }
        if (string.equals(e)) {
            etk_2 etk_22 = eta_2.a(this.n.a());
            return bae.h().a(123, (long)etk_22.i(), new Object[0]);
        }
        if (string.equals(f)) {
            return this.a();
        }
        if (string.equals(g)) {
            if (this.n == null) {
                return 0;
            }
            return this.n.e();
        }
        if (string.equals(h)) {
            wx_0 wx_02 = this.h();
            if (wx_02.f()) {
                return null;
            }
            int n = wx_02.d();
            int n2 = wx_02.c();
            int n3 = wx_02.b();
            return bae.h().a("remainingDurationShort", n, n2, n3, wx_02);
        }
        if (string.equals(j)) {
            if (this.n.i()) {
                return null;
            }
            int n = fkb_0.b(this.n, bua_2.a.a());
            return bae.h().a((long)n);
        }
        if (string.equals(l)) {
            return this.n.h();
        }
        return null;
    }

    public ArrayList<String> a() {
        if (this.n.i()) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = eta_2.f(this.n);
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    private wx_0 h() {
        if (this.n.i()) {
            return ww_0.g;
        }
        return eta_2.a(this.n);
    }

    public wx_0 b() {
        if (this.n.i()) {
            return ww_0.g;
        }
        return eta_2.b(this.n);
    }

    public String c() {
        return bae.h().a(126, (long)this.n.a(), new Object[0]);
    }

    public int e() {
        etw_2 etw_22 = this.i();
        if (etw_22 == null) {
            return -1;
        }
        return etw_22.c();
    }

    public ays_2 f() {
        etw_2 etw_22 = this.i();
        if (etw_22 == null) {
            return null;
        }
        return this.o.d(etw_22.c());
    }

    private etw_2 i() {
        return eta_2.c(this.n);
    }

    public etw_2 g() {
        return this.n;
    }
}

