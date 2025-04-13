/*
 * Decompiled with CFR 0.152.
 */
public abstract class bqO
implements ajh_1,
bqP {
    public static final String a = "maxQuantity";
    public static final String b = "quantity";
    public static final String d = "quantityRatio";
    public static final String e = "currentPlayerQuantity";
    public static final String f = "maxPlayerQuantity";
    public static final String g = "totalPlayerQuantity";
    public static final String h = "canMax";
    public static final String i = "valid";
    public static final String j = "editable";
    public static final String k = "citizenPoints";
    public static final String l = "citizenPointsText";
    private final String[] m = new String[]{"maxQuantity", "quantity", "quantityRatio", "currentPlayerQuantity", "maxPlayerQuantity", "totalPlayerQuantity", "canMax", "valid", "editable", "citizenPoints", "citizenPointsText"};
    private int n = 0;

    @Override
    public String[] d() {
        return this.m;
    }

    @Override
    public Object b(String string) {
        if (string.equals(e)) {
            return this.g();
        }
        if (string.equals(b)) {
            return this.f();
        }
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(f)) {
            return this.b();
        }
        if (string.equals(d)) {
            return Float.valueOf((float)this.f() / (float)this.e());
        }
        if (string.equals(g)) {
            return this.b();
        }
        if (string.equals(h)) {
            return this.h();
        }
        if (string.equals(i)) {
            return this.j();
        }
        if (string.equals(k)) {
            return 0;
        }
        if (string.equals(l)) {
            return bae.h().a("chaos.citizenPointsNeeded", 1, 50);
        }
        if (string.equals(j)) {
            return this.i();
        }
        return null;
    }

    private Boolean i() {
        return this.a() > 0L && this.c() > 0L;
    }

    private boolean j() {
        return this.g() > 0L && this.c() > 0L;
    }

    @Override
    public long a() {
        return Math.min(this.c(), this.b());
    }

    @Override
    public abstract long b();

    @Override
    public long c() {
        return this.e() - this.f();
    }

    @Override
    public abstract long e();

    @Override
    public abstract long f();

    @Override
    public long g() {
        return this.n;
    }

    @Override
    public void a(int n) {
        this.n = n;
    }

    @Override
    public boolean h() {
        return this.g() != this.e() && (this.j() || this.g() == 0L && this.c() > 0L && this.a() > 0L);
    }
}

