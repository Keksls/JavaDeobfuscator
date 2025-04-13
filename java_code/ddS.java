/*
 * Decompiled with CFR 0.152.
 */
class ddS
implements fjv_2 {
    final /* synthetic */ ddO a;

    ddS(ddO ddO2) {
        this.a = ddO2;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        if (fju_22 == fju_2.a) {
            this.a.i = (int)this.a.h.getOffset();
            int n = this.a.m.c();
            if (n == 0) {
                return;
            }
            int n2 = (this.a.i % n + n) % n;
            this.a.m.a(n2);
        }
    }
}

