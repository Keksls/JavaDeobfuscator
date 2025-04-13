/*
 * Decompiled with CFR 0.152.
 */
class frS
implements Runnable {
    final /* synthetic */ frR a;

    frS(frR frR2) {
        this.a = frR2;
    }

    @Override
    public void run() {
        this.a.setPixmap(this.a.t.get(this.a.v));
        this.a.v = (this.a.v + 1) % this.a.t.size();
    }
}

