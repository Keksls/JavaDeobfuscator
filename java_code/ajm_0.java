/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ajm
 */
class ajm_0
implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ajh_0 b;

    ajm_0(ajh_0 ajh_02, boolean bl) {
        this.b = ajh_02;
        this.a = bl;
    }

    @Override
    public void run() {
        this.b.a(this.a);
    }
}

