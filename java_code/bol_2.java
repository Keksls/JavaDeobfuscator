/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bol
 */
final class bol_2
extends boq_2 {
    private final blx_1 B;

    bol_2(epa_1 epa_12, bor_1 bor_12, blx_1 blx_12) {
        super(epa_12, bor_12, (byte)1);
        this.B = blx_12;
    }

    @Override
    protected int a() {
        if (this.B.a(eoz_1.X)) {
            return 0;
        }
        return super.a();
    }

    @Override
    protected int b() {
        if (this.B.a(eoz_1.X)) {
            return 0;
        }
        return super.b();
    }
}

