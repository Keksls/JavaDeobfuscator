/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHR
 */
public class chr_0
implements Runnable {
    public static final chr_0 a = new chr_0();
    public static final int b = 250;
    private dfc c;
    private boolean d;
    private long e;
    private boolean f;
    private static final int g = 225;
    private static final int h = 350;
    private static final int i = 3500;
    private fru_0 j;
    private final fzu k = new cHS(this);

    public void a(dfc dfc2, fru_0 fru_02) {
        this.e = System.currentTimeMillis();
        this.f = false;
        this.c = dfc2;
        this.j = fru_02;
        ado_1.a().a(this, 250L);
        fta_0.getInstance().addEventListener(frd_0.B, this.k, true);
        this.d = true;
        this.run();
    }

    @Override
    public void run() {
        if (!this.d) {
            if (!this.f) {
                this.d();
            }
            ado_1.a().b(this);
            return;
        }
        long l = System.currentTimeMillis() - this.e;
        if (l < 350L) {
            return;
        }
        this.d();
        int n = (int)((float)l / 3500.0f * 225.0f);
        if (n > 0 && n <= 225) {
            ado_1.a().b(this);
            ado_1.a().a(this, (long)(250 - n));
        }
    }

    private void d() {
        add_2.b().a(this.c);
        this.f = true;
    }

    public boolean a() {
        return this.d;
    }

    public void b() {
        if (!this.f) {
            this.d();
        }
        this.d = false;
    }

    public final void c() {
        if (this.j != null && this.j.getAppearance() != null) {
            this.j.getAppearance().b();
        }
        ado_1.a().b(this);
        this.b();
        fta_0.getInstance().removeEventListener(frd_0.B, this.k, true);
    }
}

