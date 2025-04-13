/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boz
 */
public class boz_1
extends boq_2 {
    private final blx_1 B;

    public boz_1(epa_1 epa_12, bor_1 bor_12, blx_1 blx_12) {
        this(epa_12, bor_12, blx_12, 4);
    }

    public boz_1(epa_1 epa_12, bor_1 bor_12, blx_1 blx_12, byte by) {
        super(epa_12, bor_12, by);
        this.B = blx_12;
    }

    @Override
    protected Object o() {
        if (this.B.p()) {
            return this.B.c(eps_0.l);
        }
        return super.o();
    }
}

