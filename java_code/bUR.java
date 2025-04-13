/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bUR
implements ajh_1,
Comparable {
    public static final String a = "name";
    public static final String b = "categoryName";
    public static final String d = "points";
    public static final String e = "percentPoints";
    public static final String f = "iconUrl";
    public static final String g = "cost";
    public static final String h = "description";
    public static final String i = "activated";
    public static final String j = "isRight";
    public static final String k = "locked";
    public static final String[] l = new String[]{"name", "categoryName", "points", "percentPoints", "iconUrl", "cost", "description", "activated", "isRight", "locked"};
    private fde m;
    private bUS n = bUS.a;

    public int compareTo(@NotNull Object object) {
        if (object instanceof bUR) {
            bUR bUR2;
            int n;
            int n2 = this.a().b();
            return n2 == (n = (bUR2 = (bUR)object).a().b()) ? this.e().compareTo(bUR2.e()) : n2 - n;
        }
        return 0;
    }

    public bUR(fde fde2) {
        this.m = fde2;
    }

    @Override
    public String[] d() {
        return l;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(b)) {
            if (this.m.b() >= -5) {
                return bae.h().a("nation.lawMinorDeliquency", new Object[0]);
            }
            if (this.m.b() >= -20) {
                return bae.h().a("nation.lawMajorDeliquency", new Object[0]);
            }
            return bae.h().a("nation.lawCrimeDeliquency", new Object[0]);
        }
        if (string.equals(d)) {
            int n = this.m.b();
            return n > 0 ? "+" + n : Integer.valueOf(n);
        }
        if (string.equals(e)) {
            int n = this.m.e();
            if (n == 0) {
                return null;
            }
            return n + "%";
        }
        if (string.equals(f)) {
            return azs_0.a().a(this.m.a());
        }
        if (string.equals(g)) {
            return this.m.c();
        }
        if (string.equals(h)) {
            return bae.h().a(98, (long)((int)this.m.a()), new Object[0]);
        }
        if (string.equals(i)) {
            if (bUS.a == this.n) {
                return this.f();
            }
            return this.b();
        }
        if (string.equals(k)) {
            return this.m.d();
        }
        if (string.equals(j)) {
            return this.m.b() > 0;
        }
        return null;
    }

    private String e() {
        return bae.h().a(97, (long)((int)this.m.a()), new Object[0]);
    }

    private boolean f() {
        return bUW.a().x().m().c(this.m.a());
    }

    public fde a() {
        return this.m;
    }

    public void a(fde fde2) {
        this.m = fde2;
    }

    public boolean b() {
        return this.n == bUS.c || this.n == bUS.a && this.f();
    }

    public void a(boolean bl) {
        this.n = bl ? bUS.c : bUS.b;
        fis_1.a().a((ajf_1)this, i);
    }

    public void c() {
        this.n = bUS.a;
        fis_1.a().a((ajf_1)this, i);
    }
}

