/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJb
 */
class ajb_2
implements Runnable {
    final /* synthetic */ aiu_2 a;
    final /* synthetic */ ajd_2 b;
    final /* synthetic */ ain_2 c;
    final /* synthetic */ aja_2 d;

    ajb_2(aja_2 aja_22, aiu_2 aiu_22, ajd_2 ajd_22, ain_2 ain_22) {
        this.d = aja_22;
        this.a = aiu_22;
        this.b = ajd_22;
        this.c = ain_22;
    }

    @Override
    public void run() {
        this.a.a(this.b, this.c);
    }
}

