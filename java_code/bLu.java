/*
 * Decompiled with CFR 0.152.
 */
class bLu
extends bLt {
    bLu() {
    }

    @Override
    public void a(fjg_1 fjg_12) {
        if (!bLt.b(fjg_12)) {
            fjg_12.f(false);
            return;
        }
        long l = azu_0.j().n().u();
        boolean bl = false;
        if (fjg_12.j() instanceof afc) {
            afc afc2 = (afc)fjg_12.j();
            switch (afc2.b) {
                case 16: {
                    fhT fhT2 = azu_0.j().k().cV();
                    bl = !fhT2.a((int)afc2.a);
                    break;
                }
                case 47: {
                    Object Info = fjs.a.a(fjv.b, afc2.a);
                    bLu.a(fjg_12, ((fjB)Info).h());
                    bl = !fjq_0.a(l, ay_0.b, (int)afc2.a);
                    break;
                }
                case 26: {
                    Object Info = fjs.a.a(fjv.a, afc2.a);
                    bl = !fjq_0.a(l, ay_0.a, (int)afc2.a);
                    bLu.a(fjg_12, ((fjB)Info).h());
                    break;
                }
                case 49: {
                    Object Info = fjs.a.a(fjv.c, afc2.a);
                    bLu.a(fjg_12, ((fjB)Info).h());
                    break;
                }
                case 48: {
                    Object Info = fjs.a.a(fjv.d, afc2.a);
                    bLu.a(fjg_12, ((fjB)Info).h());
                    break;
                }
            }
        }
        fjg_12.f(true);
        fjg_12.d(false);
        fjg_12.e(fjg_12.r() || bl);
    }
}

