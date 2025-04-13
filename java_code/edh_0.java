/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eDH
 */
public class edh_0
extends eDq<fie_0> {
    public edh_0(fie_0 fie_02, eDk eDk2) {
        this(fie_02, eDk2, 0);
    }

    public edh_0(fie_0 fie_02, eDk eDk2, int n) {
        super(fie_02, fie_02.p(), fie_02.c(), true, null, null, eDk2, n);
    }

    public edh_0(fie_0 fie_02, eDk eDk2, short s2) {
        super(fie_02, fie_02.p(), s2, true, null, null, eDk2, 0);
    }
}

