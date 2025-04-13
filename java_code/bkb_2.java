/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkB
 */
public class bkb_2
implements ajh_1 {
    public static final String a = "backgroundImage";
    public static final String b = "backgroundSize";
    public static final String d = "leftPage";
    public static final String e = "rightPage";
    public static final String f = "previousExisting";
    public static final String g = "nextExisting";
    public static final String h = "hasPages";
    public static final String[] i = new String[]{"backgroundImage", "backgroundSize", "leftPage", "rightPage", "previousExisting", "nextExisting", "hasPages"};
    private int j = -1;
    private final bke_2[] k;
    private final bka_2 l;
    private final fjf_2 m;

    public bkb_2(bka_2 bka_22, bke_2[] bke_2Array) {
        this.l = bka_22;
        this.k = bke_2Array;
        this.j = 0;
        this.m = this.l.b() ? new fjf_2(1000, 612) : new fjf_2(450, 612);
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.l == bka_2.f ? null : azs_0.a().w(this.l.a());
        }
        if (string.equals(b)) {
            return this.m;
        }
        if (string.equals(d)) {
            return this.k[this.j];
        }
        if (string.equals(e)) {
            int n = this.j + 1;
            return n < this.k.length ? this.k[n] : null;
        }
        if (string.equals(f)) {
            return this.e();
        }
        if (string.equals(g)) {
            return this.f();
        }
        if (string.equals(h)) {
            return this.k.length > 2;
        }
        return null;
    }

    private boolean e() {
        return this.j - 2 >= 0;
    }

    private boolean f() {
        return this.j + 2 < this.k.length;
    }

    public void a() {
        if (!this.e()) {
            return;
        }
        this.j -= 2;
        fis_1.a().a((ajf_1)this, i);
    }

    public void b() {
        if (!this.f()) {
            return;
        }
        this.j += 2;
        fis_1.a().a((ajf_1)this, i);
    }

    public bka_2 c() {
        return this.l;
    }
}

