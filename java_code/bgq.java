/*
 * Decompiled with CFR 0.152.
 */
public class bgq
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "score";
    public static final String e = "finished";
    public static final String f = "succeeded";
    public static final String[] g = new String[]{"name", "score", "finished", "succeeded"};
    private boolean h;
    private boolean i;
    private final bgw j;

    public bgq(bgw bgw2) {
        this.j = bgw2;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.j.c();
        }
        if (string.equals(b)) {
            return this.j.d();
        }
        if (string.equals(d)) {
            return bae.h().a("arcadeDungeon.points", this.c());
        }
        if (string.equals(e)) {
            return this.h;
        }
        if (string.equals(f)) {
            return this.i;
        }
        return null;
    }

    public String a() {
        return this.j.c();
    }

    public String b() {
        return this.j.d();
    }

    public void a(boolean bl) {
        this.h = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    public void b(boolean bl) {
        this.i = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    public int c() {
        return Math.round(this.j.b() * (float)cVA.h().i().n());
    }
}

