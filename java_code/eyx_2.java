/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eyX
 */
public class eyx_2 {
    private boolean a;
    private boolean b;
    private final wt_0 c = new wt_0(wt_0.c);
    private final ww_0 d = new ww_0(wx_0.g);

    public void a() {
        if (!this.a) {
            return;
        }
        wu_0 wu_02 = wc_0.p().a();
        ww_0 ww_02 = this.c.g(wu_02);
        if (this.b) {
            this.d.e(ww_02);
        }
        if (!this.d.e()) {
            this.d.a(wx_0.g);
        }
        this.c.a(wu_02);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public boolean b() {
        return this.a;
    }

    public void b(boolean bl) {
        this.a = bl;
    }

    public void a(wx_0 wx_02) {
        this.d.a(wx_02);
    }

    public void a(wu_0 wu_02) {
        this.c.a(wu_02);
    }

    public wx_0 c() {
        return this.d;
    }

    public wu_0 d() {
        return this.c;
    }

    public void e() {
        this.a = false;
        this.b = false;
        this.c.a(wt_0.c);
        this.d.a(wx_0.g);
    }

    public String toString() {
        return "AntiAddictionDataHandler{m_currentUsedQuota=" + this.d + ", m_enabled=" + this.a + ", m_lastConnectionDate=" + this.c + "}";
    }
}

