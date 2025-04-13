/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfH
 */
public class bfh_1
implements agw_0 {
    @Override
    public String m_() {
        return bae.h().a("contentLoader.spell", new Object[0]);
    }

    public void a(YK yK) {
        aTz aTz2 = new aTz();
        for (bks_1 bks_12 : bkt_1.a().d()) {
            this.a(aTz2, bks_12.a());
        }
        this.a(aTz2, epn_2.a.s());
        yK.b(this);
    }

    private void a(aTz aTz2, int n) {
        asw_2.a().a(aTz2, "breed_id", n, new bfi_2(this));
    }
}

