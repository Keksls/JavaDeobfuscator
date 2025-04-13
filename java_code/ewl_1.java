/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWl
 */
public enum ewl_1 {
    a(new ewm_1()),
    b(new ewn_1());

    private final abr_1<? extends ewr_2> c;

    private ewl_1(abr_1<? extends ewr_2> abr_12) {
        this.c = abr_12;
    }

    public ewr_2 a() {
        return this.c.createNew();
    }
}

