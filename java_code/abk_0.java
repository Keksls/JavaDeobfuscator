/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abK
 */
public class abk_0
implements atz_1<ff_1> {
    @Override
    public final boolean a(aty_1 aty_12, ff_1 ff_12) {
        String[] stringArray = ff_12.c();
        byte[] byArray = ff_12.d();
        if (stringArray == null) {
            return false;
        }
        int n = Hw.a(101);
        for (int k = 0; k < stringArray.length; ++k) {
            if ((n -= byArray[k]) > 0 || stringArray[k] == null) continue;
            if (stringArray[k].isEmpty()) break;
            return aty_12.e(stringArray[k]);
        }
        return false;
    }
}

