/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bon
 */
public abstract class bon_2
implements rv_0,
ajh_1 {
    private static final Logger B = Logger.getLogger(bon_2.class);
    public static final String a = "name";
    public static final String b = "shortName";
    public static final String d = "description";
    public static final String e = "shortDescription";
    public static final String f = "iconStyle";
    public static final String g = "iconPath";
    public static final String h = "value";
    public static final String i = "max";
    public static final String j = "minMax";
    public static final String k = "percent";
    public static final String l = "valueDescription";
    public static final String m = "formattedValueDescription";
    public static final String n = "formattedValueDescriptionNewGreen";
    public static final String o = "percentDescription";
    public static final String p = "formattedWithoutColor";
    public static final String q = "isMaxed";
    public static final String r = "formattedValue";
    public static final String s = "formattedPercentDescription";
    public static final String t = "percentDescriptionWithoutBaseValue";
    public static final String u = "colorFloat";
    public static final String v = "highlighted";
    public static final String w = "modulationColor";
    public static final String[] x = new String[]{"max", "minMax", "percent", "percentDescription", "value", "valueDescription", "formattedValueDescription", "formattedPercentDescription", "formattedWithoutColor", "percentDescriptionWithoutBaseValue", "modulationColor", "isMaxed", "formattedValue", "formattedValueDescriptionNewGreen"};
    protected final epa_1 y;
    protected final byte z;
    protected final bor_1 A;
    private boolean C;

    protected bon_2(epa_1 epa_12, byte by, bor_1 bor_12) {
        this.y = epa_12;
        this.z = by;
        this.A = bor_12;
    }

    @Override
    public String[] d() {
        return x;
    }

    void a(boolean bl) {
        this.C = bl;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.m();
            }
            case "shortName": {
                return this.n();
            }
            case "description": {
                return this.l();
            }
            case "shortDescription": {
                return this.k();
            }
            case "iconStyle": {
                return this.i();
            }
            case "iconPath": {
                return this.j();
            }
            case "value": {
                return this.a();
            }
            case "max": {
                return this.b();
            }
            case "minMax": {
                return this.t();
            }
            case "formattedValueDescription": {
                return this.a(elw_1.dF);
            }
            case "formattedValueDescriptionNewGreen": {
                return this.a(elw_1.dE);
            }
            case "valueDescription": {
                return this.c();
            }
            case "percent": {
                return this.o();
            }
            case "percentDescriptionWithoutBaseValue": {
                return this.p();
            }
            case "formattedPercentDescription": {
                return this.q();
            }
            case "formattedWithoutColor": {
                return this.r();
            }
            case "percentDescription": {
                return this.s();
            }
            case "colorFloat": {
                return this.h();
            }
            case "highlighted": {
                return this.C;
            }
            case "modulationColor": {
                return this.e();
            }
            case "isMaxed": {
                return this.a() >= this.b();
            }
            case "formattedValue": {
                return "(" + this.a() + ")";
            }
        }
        return null;
    }

    protected azj_2 e() {
        return azf_2.e;
    }

    protected abstract int a();

    protected abstract int b();

    public eps_0 f() {
        return this.y.t();
    }

    protected azj_2 g() {
        switch (this.y.t()) {
            case b: {
                return fys_0.a.a(elw_1.o);
            }
            case c: {
                return fys_0.a.a(elw_1.p);
            }
            case d: {
                return fys_0.a.a(elw_1.q);
            }
            case e: {
                return fys_0.a.a(elw_1.r);
            }
            case al: {
                return fys_0.a.a(elw_1.t);
            }
            case ax: {
                return fys_0.a.a(elw_1.s);
            }
            case r: {
                return fys_0.a.a(elw_1.dB);
            }
            case s: {
                return fys_0.a.a(elw_1.dD);
            }
            case t: {
                return fys_0.a.a(elw_1.dC);
            }
            case q: {
                return fys_0.a.a(elw_1.dA);
            }
        }
        return azf_2.e;
    }

    protected String h() {
        azj_2 azj_22 = this.g();
        return String.valueOf(azj_22.q()) + "," + azj_22.r() + "," + azj_22.s() + "," + azj_22.p();
    }

    protected Object i() {
        return "icon" + this.y.t().name();
    }

    protected String j() {
        try {
            return String.format(azs_0.a().a("characteristicsIconsPath"), this.y.t().name());
        }
        catch (gm_0 gm_02) {
            B.warn((Object)("Missing characteristic icon " + this.y.t().name()), (Throwable)gm_02);
            return null;
        }
    }

    protected Object k() {
        String string = this.y.t().name() + "ShortDesc";
        return bae.h().a(string, new Object[0]);
    }

    protected String a(elw_1 elw_12) {
        return bot_1.a(this.a(), elw_12);
    }

    protected Object l() {
        String string = this.y.t().name() + "Description";
        return bae.h().a(string, new Object[0]);
    }

    protected Object m() {
        return bae.h().a(this.y.t().name(), new Object[0]);
    }

    protected Object n() {
        String string = this.y.t().name() + "Short";
        return bae.h().a(string, new Object[0]);
    }

    protected Object o() {
        float f2 = this.b();
        if (f2 == 0.0f) {
            return 0;
        }
        return Float.valueOf((float)this.a() / f2);
    }

    protected Object p() {
        return bot_1.a(this.a(), true, elw_1.dE);
    }

    protected Object q() {
        return bot_1.a(this.a(), true);
    }

    protected Object r() {
        return bot_1.a(this.a(), true);
    }

    protected Object s() {
        return bot_1.a(this.a(), false);
    }

    public String c() {
        if (this.z != -1) {
            ani_2 ani_22 = new ani_2();
            try {
                ani_22.a(bac.a(this.z), 16, 16, null).a((CharSequence)" ");
            }
            catch (gm_0 gm_02) {
                B.warn((Object)gm_02.getMessage());
                ani_22.a(this.n()).a((CharSequence)" : ");
            }
            ani_22.a((CharSequence)this.t());
            return ani_22.r();
        }
        return this.t();
    }

    protected String t() {
        return String.valueOf(this.a()) + "/" + this.b();
    }

    public void u() {
        fis_1.a().a((ajf_1)this, this.d());
    }

    @Override
    public void a(rs_0 rs_02) {
        this.u();
        this.A.a(rs_02);
    }
}

