/*
 * Decompiled with CFR 0.152.
 */
class bDK
implements ahr_1 {
    private final bdh_0 a;

    bDK(bdh_0 bdh_02) {
        this.a = bdh_02;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 15004: {
                this.a((cug_1)adt_12);
                return false;
            }
        }
        return true;
    }

    private void a(cug_1 cug_12) {
        cZD cZD2 = cZD.d();
        if (azu_0.j().c(cZD2)) {
            cZD2.a(new btw_2(cug_12.b()));
            cZD2.f();
        } else {
            cZD2.a(this.a);
            cZD2.a(new btw_2(cug_12.b()));
            azu_0.j().a(cZD2);
        }
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "Frame{m_collector=" + this.a + "}";
    }
}

