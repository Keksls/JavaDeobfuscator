/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFa
 */
class bfa_0
implements ahr_1 {
    private final bew_0 a;

    bfa_0(bew_0 bew_02) {
        this.a = bew_02;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 13540: {
                this.a((cyx_1)adt_12);
                return false;
            }
        }
        return true;
    }

    private void a(cyx_1 cyx_12) {
        dcx_0 dcx_02 = dcx_0.d();
        if (!azu_0.j().c(dcx_02)) {
            azu_0.j().a(dcx_02);
            dcx_02.a(this.a);
        }
        dcx_02.a(cyx_12.b(), cyx_12.c());
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "Frame{m_seedSpreader=" + this.a + "}";
    }
}

