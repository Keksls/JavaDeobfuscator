/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEv
 */
class bev_0
implements ahr_1 {
    private final bes_0 a;

    bev_0(bes_0 bes_02) {
        this.a = bes_02;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 14049: {
                this.a((cwc_1)adt_12);
                return false;
            }
        }
        return true;
    }

    private void a(cwc_1 cwc_12) {
        dbl dbl2 = dbl.a();
        dbl2.a(cwc_12.b());
        azu_0.j().a(dbl2);
        azu_0.j().b(this);
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "Frame{m_board=" + this.a + "}";
    }
}

