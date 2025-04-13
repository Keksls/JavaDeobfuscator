/*
 * Decompiled with CFR 0.152.
 */
class bET
implements ans_1 {
    final /* synthetic */ bES a;

    bET(bES bES2) {
        this.a = bES2;
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

