/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMw
 */
public class amw_1
extends abj_2<String, amv_1> {
    public static final amw_1 b = new amw_1();

    private amw_1() {
        super(20);
    }

    public long g() {
        long l = 0L;
        for (amv_1 amv_12 : this.a.values()) {
            l += ((amc_2)amv_12).c(-1);
        }
        return l / 0x100000L;
    }
}

