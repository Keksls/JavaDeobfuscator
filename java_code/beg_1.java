/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beg
 */
class beg_1
implements asb_2<arw_0> {
    final /* synthetic */ bef_1 a;

    beg_1(bef_1 bef_12) {
        this.a = bef_12;
    }

    public void a(arw_0 arw_02) {
        switch (arw_02.d()) {
            case 0: {
                bef_1.a.error((Object)("Emote de type invalide id=" + arw_02.c()));
                break;
            }
            case 1: {
                bhA.a.a(arw_02);
                break;
            }
            case 2: {
                bhA.a.b(arw_02);
            }
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((arw_0)asu_22);
    }
}

