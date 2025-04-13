/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbt
 */
public class cbt_2
implements adv_1 {
    private long a;
    private long b;
    private long c;
    private final int d;
    private final int e;
    private final String f;

    public cbt_2(int n, int n2, String string) {
        this.d = n;
        this.e = n2;
        this.f = string;
    }

    public String e() {
        return this.f;
    }

    public void b(long l) {
        this.c();
        this.b = l;
        this.c(l);
        this.c = adi_2.a().a(this, 1000L, 0, l);
    }

    public void c() {
        this.b = 0L;
        this.c(0L);
        adi_2.a().a(this.c);
    }

    protected byte d(long l) {
        if (l > (long)this.d) {
            return 0;
        }
        if (l > (long)this.e) {
            return 1;
        }
        return 2;
    }

    protected void c(long l) {
        this.a = Math.max(l, 0L);
        if (this.f != null) {
            fis_1.a().a("countdownValue", (Object)this.a, this.f);
            fis_1.a().a("countdownText", (Object)this.d(), this.f);
            fis_1.a().a("countdownPercentage", (Object)Float.valueOf((float)this.a / (float)this.b), this.f);
            fis_1.a().a("countdownState", (Object)this.d(l), this.f);
        } else {
            fis_1.a().a("countdownValue", this.a);
            fis_1.a().a("countdownText", (Object)this.d());
            fis_1.a().a("countdownPercentage", Float.valueOf((float)this.a / (float)this.b));
            fis_1.a().a("countdownState", this.d(l));
        }
    }

    protected final long f() {
        return this.a;
    }

    protected String d() {
        return String.valueOf(this.a);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        this.c(this.a - 1L);
        if (this.a == 0L) {
            this.c();
        }
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

