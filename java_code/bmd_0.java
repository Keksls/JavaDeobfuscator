/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMD
 */
public class bmd_0
extends fgP<bMn> {
    private bwg_2 b;

    public bmd_0(bMn bMn2, abr_1 abr_12) {
        super(bMn2, abr_12, null);
        this.a(this.a(bMn2));
    }

    public bwg_2 a(bMn bMn2) {
        if (this.b == null) {
            this.b = new bwg_2(bMn2, this);
        }
        return this.b;
    }
}

