/*
 * Decompiled with CFR 0.152.
 */
class cGf
implements Runnable {
    private fue_0 a;
    private Boolean b;
    private boolean c;

    cGf() {
    }

    public void a(fue_0 fue_02) {
        this.a = fue_02;
    }

    public void a(Boolean bl) {
        this.b = bl;
    }

    @Override
    public void run() {
        ftx_0 ftx_02 = this.a.getVerticalScrollBar();
        float f2 = ftx_02.getValue();
        float f3 = ftx_02.getButtonJump();
        if (this.b.booleanValue()) {
            if (f2 == 1.0f) {
                cFS.a();
                return;
            }
            if ((f2 += f3) > 1.0f) {
                f2 = 1.0f;
            }
        } else {
            if (f2 == 0.0f) {
                cFS.a();
                return;
            }
            if ((f2 -= f3) < 0.0f) {
                f2 = 0.0f;
            }
        }
        this.a.setVerticalScrollBarPosition(f2);
        fis_1.a().a("chat.scrollOffset", (Object)Float.valueOf(ftx_02.getValue()), this.a.getElementMap().c());
    }

    public boolean a() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }
}

