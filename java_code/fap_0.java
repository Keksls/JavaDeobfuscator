/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fap
 */
public class fap_0
implements far {
    private final int b;
    private final int c;
    private final int d;
    private final wx_0 e;
    private final wu_0 f;
    private wu_0 g;
    private wu_0 h = wt_0.b();
    private wu_0 i = wt_0.b();
    private int j;
    private final boolean k;

    public fap_0(faq faq2) {
        this.b = faq2.a();
        this.c = faq2.b();
        this.d = faq2.c();
        this.e = faq2.d();
        this.f = faq2.e();
        this.g = faq2.f();
        this.k = faq2.g();
    }

    @Override
    public wu_0 h() {
        return this.h;
    }

    public void a(wu_0 wu_02) {
        this.h = wu_02;
    }

    public void b(wu_0 wu_02) {
        this.g = wu_02;
    }

    @Override
    public wu_0 i() {
        return this.i;
    }

    public void a(int n) {
        this.j = n;
    }

    public void c(wu_0 wu_02) {
        this.i = wu_02;
    }

    public void j() {
        ++this.j;
    }

    public void k() {
        this.j = 0;
    }

    @Override
    public int l() {
        return this.j;
    }

    @Override
    public int c() {
        return this.d;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public wu_0 e() {
        return this.f;
    }

    @Override
    public wx_0 d() {
        return this.e;
    }

    @Override
    public wu_0 f() {
        return this.g;
    }

    @Override
    public boolean g() {
        return this.k;
    }

    public String toString() {
        return "LockData{m_lockId=" + this.b + ", m_lockedItem=" + this.c + ", m_lockValue=" + this.d + ", m_periodDuration=" + this.e + ", m_periodStartTime=" + this.f + ", m_unlockDate=" + this.g + ", m_lockDate=" + this.h + ", m_currentLockValueDate=" + this.i + ", m_currentLockValue=" + this.j + ", m_availableToCitizensOnly=" + this.k + "}";
    }
}

