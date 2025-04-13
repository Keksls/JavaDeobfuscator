/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cih
 */
final class cih_2
extends chd_1<ctb_1, bvx_2> {
    private static final bwi_0 b = new bwi_0();

    cih_2() {
    }

    @Override
    public boolean a(ctb_1 ctb_12) {
        long l = ctb_12.b();
        byte by = ctb_12.c();
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(l);
        if (blx_12 == null) {
            return false;
        }
        String string = null;
        if (by == 0) {
            string = bae.h().a("fight.disconnection", blx_12.dp());
        } else if (by == 1) {
            string = bae.h().a("fight.reconnection", blx_12.dp());
        }
        if (string != null) {
            b.b(string);
        }
        return false;
    }
}

