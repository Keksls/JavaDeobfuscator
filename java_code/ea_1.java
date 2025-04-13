/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EA
 */
public final class ea_1 {
    private ea_1() {
    }

    public static Ft a(eg_1 eg_12) {
        byte by = eg_12.a();
        int n = eg_12.c();
        switch (by) {
            case 1: {
                return new fu_0(eg_12.a(n));
            }
            case 2: {
                return new fw_0(eg_12.b(n));
            }
            case 4: {
                return new fv_0(eg_12.c(n));
            }
        }
        return null;
    }
}

