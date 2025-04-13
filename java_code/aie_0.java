/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aie
 */
class aie_0
implements Runnable {
    final /* synthetic */ aid_0 a;

    aie_0(aid_0 aid_02) {
        this.a = aid_02;
    }

    @Override
    public void run() {
        if (this.a.a.h != null) {
            this.a.a.h.a(this.a.a.b, this.a.a.c);
        }
        String string = "PSys Debug  Part.: " + this.a.a.b.size() + " (max " + this.a.a.d + ") Lights: " + this.a.a.c.size() + " (max " + this.a.a.e + ")";
        this.a.a.g.setTitle(string);
    }
}

