/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boF
 */
public class bof_2
extends bob_1 {
    private final blx_1 C;

    public bof_2(epa_1 epa_12, bor_1 bor_12, blx_1 blx_12, epa_1 ... epa_1Array) {
        super(epa_12, bor_12, (byte)39, epa_1Array);
        this.C = blx_12;
    }

    @Override
    protected Object o() {
        if (this.C.p()) {
            return this.C.c(eps_0.l);
        }
        return super.o();
    }
}

