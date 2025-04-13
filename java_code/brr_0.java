/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brr
 */
public abstract class brr_0
implements ajh_1 {
    public static final String a = "type";
    public static final String b = "name";
    public static final String d = "iconUrl";
    public static final String e = "duration";
    public static final String f = "sourceName";
    public static final String g = "sourceId";
    public static final String h = "actionDescription";
    public static final String i = "level";
    public static final String j = "levelText";
    public static final String k = "multiple";
    public static final String l = "canUseAsIngredient";
    public static final String m = "craftXp";
    public static final String n = "baseCraftXp";
    public static final String o = "rarity";
    private final eAJ p;
    private final int q;
    private final int r;
    private final int s;
    private int t;
    private final int u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final int y;
    private final float z;
    private final exw_1 A;

    protected brr_0(int n, int n2, int n3, int n4, boolean bl, eAJ eAJ2, boolean bl2, int n5, float f2) {
        this.q = n;
        this.s = n2;
        this.t = n3;
        Object r2 = eyo_1.g().d(this.q);
        this.r = r2 == null ? 0 : ((ezr_0)r2).C();
        this.u = n4;
        this.v = bl;
        this.p = eAJ2;
        this.w = ecn_0.a.a(new int[]{this.q});
        this.x = bl2;
        this.y = n5;
        this.z = f2;
        this.A = r2 == null ? exw_1.a : ((ezr_0)r2).M();
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(d)) {
            return azs_0.a().a("itemsIconsPath", "defaultIconPath", this.r);
        }
        if (string.equals(f)) {
            return this.i();
        }
        if (string.equals(g)) {
            return this.j();
        }
        if (string.equals(h)) {
            return this.a();
        }
        if (string.equals(e)) {
            long l = this.u;
            float f2 = (float)l * 0.5f;
            float f3 = (float)l / 60.0f;
            bmr_1 bmr_12 = azu_0.j().k();
            ece_0 ece_02 = bmr_12.eX();
            short s2 = ece_02.f(this.y);
            long l2 = l - (long)((float)(s2 - this.t) * f3);
            float f4 = Math.max(f2, (float)l2);
            float f5 = 0.01f * (float)bmr_12.cv().a(eAE.c, this.y, 3);
            float f6 = 1.0f / (1.0f + f5);
            return String.format("%.1f s", Float.valueOf((float)Math.round(f4 * f6) / 1000.0f));
        }
        if (string.equals(a)) {
            return this.k().c;
        }
        if (string.equals(k)) {
            return this.v;
        }
        if (string.equals(i)) {
            return this.t;
        }
        if (string.equals(l)) {
            return this.w;
        }
        if (string.equals(j)) {
            return bae.h().a("levelShort.custom", this.t);
        }
        if (string.equals(m)) {
            bmr_1 bmr_13 = azu_0.j().k();
            return bmr_13.dO().c(this.y).a(this, 3);
        }
        if (string.equals(n)) {
            bmr_1 bmr_14 = azu_0.j().k();
            return bmr_14.dO().c(this.y).a(this);
        }
        if (string.equals(o)) {
            return this.A;
        }
        Object r2 = eyo_1.g().d(this.q);
        return r2 == null ? null : new bht_1((ezr_0<bhg_0>)r2).b(string);
    }

    public String a() {
        fii fii2 = fij.a().a(this.s);
        String string = bae.h().a("desc.mru." + fii2.d(), new Object[0]);
        String string2 = this.i();
        return bae.h().a("harvest.action", string, string2);
    }

    public String b() {
        return bae.h().a(15, (long)this.q, new Object[0]);
    }

    public String c() {
        return this.b() + this.i() + this.a();
    }

    public int e() {
        return this.t;
    }

    public float f() {
        return this.z;
    }

    public int g() {
        return this.q;
    }

    public eAJ h() {
        return this.p;
    }

    public void a(int n) {
        this.t = n;
    }

    public abstract String i();

    public abstract int j();

    public abstract void b(int var1);

    public abstract brs_1 k();

    public boolean l() {
        return this.x;
    }

    public int m() {
        return this.y;
    }

    public exw_1 n() {
        return this.A;
    }
}

