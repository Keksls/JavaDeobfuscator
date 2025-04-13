/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWD
 */
public abstract class bwd_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "endangeredStatus";
    public static final String d = "endangeredStatus";
    public static final String e = "isProtected";
    public static final String f = "isExtinct";
    public static final String g = "canBeReintroduced";
    public static final String h = "protectionPrice";
    public static final String i = "protectionPriceValue";
    public static final String j = "reintroductionPrice";
    public static final String k = "reintroductionPriceValue";
    public static final String l = "iconUrl";
    public static final String m = "getSeedsText";
    protected final int n;
    protected final int o;
    protected final int p;
    protected final int q;

    protected bwd_2(int n, int n2, int n3, int n4) {
        this.n = n;
        this.o = n2;
        this.p = n3;
        this.q = n4;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(e)) {
            return this.b();
        }
        if (string.equals(f)) {
            return this.g();
        }
        if (string.equals(h)) {
            return this.p + "\u00a7";
        }
        if (string.equals(j)) {
            return this.q + "\u00a7";
        }
        if (string.equals(i)) {
            return this.p;
        }
        if (string.equals(k)) {
            return this.q;
        }
        if (string.equals(l)) {
            return this.e();
        }
        if (string.equals(g)) {
            return this.c();
        }
        if (string.equals(m)) {
            return bae.h().a("craft.getSeeds", this.i());
        }
        if (string.equals("endangeredStatus")) {
            if (this.g()) {
                return bae.h().a("protector.ecosystem.extinct.species", new Object[0]);
            }
            if (this.f()) {
                return bae.h().a("protector.ecosystem.endangered.species", new Object[0]);
            }
            return bae.h().a("protector.ecosystem.well.representated.species", new Object[0]);
        }
        if (string.equals("endangeredStatus")) {
            if (this.g()) {
                return azf_2.h.w();
            }
            if (this.f()) {
                return azf_2.w.w();
            }
            return azf_2.f.w();
        }
        return null;
    }

    public int j() {
        return this.n;
    }

    public int k() {
        return this.p;
    }

    public int l() {
        return this.q;
    }

    protected abstract boolean c();

    protected abstract String e();

    protected abstract String a();

    protected abstract boolean b();

    protected abstract boolean f();

    protected abstract boolean g();

    public abstract boolean h();

    public abstract String i();

    public void m() {
        fis_1.a().a((ajf_1)this, e);
    }

    public void n() {
        fis_1.a().a((ajf_1)this, f, "endangeredStatus", "endangeredStatus", l);
    }
}

