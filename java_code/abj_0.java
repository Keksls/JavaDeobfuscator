/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abJ
 */
public class abj_0
implements atz_1<fe_1> {
    @Override
    public final boolean a(aty_1 aty_12, fe_1 fe_12) {
        String string = aty_12.O();
        String[] stringArray = fe_12.c();
        String[] stringArray2 = fe_12.d();
        for (int k = 0; k < stringArray.length; ++k) {
            if (!string.endsWith(stringArray[k])) continue;
            return aty_12.e(stringArray2[k]);
        }
        return aty_12.e(fe_12.e());
    }
}

