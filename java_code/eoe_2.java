/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOe
 */
final class eoe_2 {
    eoe_2() {
    }

    static boolean a(emh_1 emh_12, emh_1 emh_13, aff_1 aff_12) {
        aff_1 aff_13;
        if (emh_12 == null || emh_13 == null) {
            return true;
        }
        int n = emh_12.X() + emh_13.X();
        aff_1 aff_14 = aff_12 == null ? emh_13.gg() : aff_12;
        if (aff_14.equals(aff_13 = emh_12.gg())) {
            return true;
        }
        int n2 = Math.abs(aff_13.d() - aff_14.d());
        if (n2 > n + 1) {
            return true;
        }
        int n3 = Math.abs(aff_13.e() - aff_14.e());
        if (n3 > n + 1) {
            return true;
        }
        return n2 == n + 1 && n3 == n + 1;
    }
}

