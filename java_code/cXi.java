/*
 * Decompiled with CFR 0.152.
 */
class cXi
implements anm_2 {
    private final Runnable a;

    cXi(Runnable runnable) {
        this.a = runnable;
    }

    @Override
    public void c() {
    }

    @Override
    public void a() {
        this.a.run();
    }

    @Override
    public void b() {
        this.a.run();
    }

    @Override
    public void a(float f2) {
    }

    public String toString() {
        return "VideoStopOrEndCallback{m_callback=" + this.a + "}";
    }
}

