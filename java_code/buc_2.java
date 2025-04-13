/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bUc
 */
public class buc_2
extends bue_2<etk_2> {
    public static final String a = "iconUrl";
    public static final String b = "surface";
    public static final String d = "description";
    public static final String e = "sidoaNeed";
    public static final String f = "buildDelay";
    public static final String g = "conditions";
    public static final String h = "effects";
    public static final String i = "ressourcesCost";
    public static final String j = "evolutionName";
    public static final String[] k = buc_2.a("iconUrl", "surface", "description", "sidoaNeed", "buildDelay", "conditions", "effects", "ressourcesCost", "evolutionName");
    private final bth_2 o;

    @Override
    public String[] d() {
        return k;
    }

    public buc_2(etk_2 etk_22) {
        super(etk_22);
        this.o = bua_2.a.a(eta_2.a(etk_22).a());
    }

    @Override
    public Object b(String string) {
        Object object = super.b(string);
        if (object != null) {
            return object;
        }
        if (string.equals(d)) {
            return bae.h().a(123, (long)((etk_2)this.n).i(), new Object[0]);
        }
        if (string.equals(g)) {
            ani_2 ani_22 = new ani_2();
            bto_2 bto_22 = ddZ.d().k();
            ((etk_2)this.n).a(new bud_2(this, ani_22));
            return ani_22.q() > 0 ? ani_22.r() : null;
        }
        if (string.equals(e)) {
            if (this.o == null) {
                return 0;
            }
            etw_2 etw_22 = this.o.g();
            if (etw_22 == null) {
                return 0;
            }
            etw_2 etw_23 = eta_2.d(etw_22);
            ani_2 ani_23 = new ani_2();
            if (this.m != null && this.m.b(fkO.d)) {
                ani_23.a(azf_2.h.w());
            }
            ani_23.a(etw_23.e());
            return ani_23.r();
        }
        if (string.equals(i)) {
            int n = ((etk_2)this.n).c();
            if (n == 0) {
                return null;
            }
            etw_2 etw_24 = eta_2.b((etk_2)this.n);
            int n2 = fkb_0.b(etw_24, bua_2.a.a());
            String string2 = bae.h().a((long)n2);
            ani_2 ani_24 = new ani_2();
            if (this.m != null && this.m.b(fkO.g)) {
                ani_24.a(azf_2.h.w());
            }
            ani_24.a((CharSequence)string2);
            return ani_24.r();
        }
        if (string.equals(j)) {
            etw_2 etw_25 = this.f();
            if (etw_25 == null) {
                return null;
            }
            etg_2 etg_22 = eti_2.a.b(etw_25.a());
            if (etg_22 == null) {
                return null;
            }
            etw_2 etw_26 = eti_2.a.a(etg_22.c());
            if (etw_26 == null) {
                return null;
            }
            return bae.h().a(126, (long)etw_26.a(), new Object[0]);
        }
        return this.o.b(string);
    }

    @Override
    public boolean a() {
        return this.m == null || !this.m.b(fkO.b);
    }

    @Override
    public int b() {
        return ddZ.d().a(this.o.g().a());
    }

    @Override
    public String c() {
        return this.o.c();
    }

    @Override
    public bue_2 e() {
        buc_2 buc_22 = new buc_2((etk_2)this.n);
        return buc_22;
    }

    public etw_2 f() {
        return eta_2.a((etk_2)this.n);
    }

    @Override
    public btu_2 g() {
        return btu_2.b;
    }

    public int h() {
        return eta_2.b((etk_2)this.n).a();
    }

    fkP a(int n) {
        if (this.m == null) {
            return null;
        }
        ArrayList<fkN> arrayList = this.m.a();
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            fkP fkP2;
            fkN fkN2 = arrayList.get(k);
            if (fkN2.a() != fkO.f || (fkP2 = (fkP)fkN2).b() != n) continue;
            return fkP2;
        }
        return null;
    }
}

