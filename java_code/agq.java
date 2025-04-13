/*
 * Decompiled with CFR 0.152.
 */
class agq
implements Runnable {
    final /* synthetic */ agp a;

    agq(agp agp2) {
        this.a = agp2;
    }

    @Override
    public void run() {
        if (this.a.a.d != null && this.a.a.e != null) {
            this.a.a.d.a(this.a.a.e);
        }
    }
}

