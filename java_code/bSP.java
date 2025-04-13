/*
 * Decompiled with CFR 0.152.
 */
class bSP
implements bro_1 {
    final /* synthetic */ bSO a;

    bSP(bSO bSO2) {
        this.a = bSO2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(int n) {
        Object object = this.a.w;
        synchronized (object) {
            bSO.s.info((Object)"Money initialized.");
            this.a.b(n);
            this.a.T = 3;
            this.a.p();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a() {
        bSO.s.warn((Object)"Erreur \u00e0 la r\u00e9cup\u00e9ration du wallet.");
        Object object = this.a.w;
        synchronized (object) {
            this.a.T = 1;
        }
    }
}

