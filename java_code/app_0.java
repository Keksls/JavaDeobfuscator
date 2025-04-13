/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPP
 */
public class app_0
extends abv_0 {
    private static final String b = "pathDisplayer";
    private static final app_0 c = new app_0();

    public static app_0 b() {
        return c;
    }

    private app_0() {
        super(b, anr_0.H);
    }

    public void a(apl_1 apl_12) {
        this.a();
        int n = apl_12.a();
        for (int k = 0; k < n; ++k) {
            int[] nArray = apl_12.a(k);
            this.a(nArray[0], nArray[1], (short)nArray[2]);
        }
    }
}

