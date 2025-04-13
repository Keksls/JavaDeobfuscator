/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCI
 */
class bci_1
implements ans_1 {
    final /* synthetic */ bch_2 a;

    bci_1(bch_2 bch_22) {
        this.a = bch_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("arcadeDungeonTeaserDialog")) {
            cdw_0.n().c(600121L);
            fis_1.a().a("arcadeDungeon", (Object)null);
            fpm_0.b().e("wakfu.arcadeDungeon");
            fpm_0.b().b(this);
        }
    }
}

