/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dac
 */
class dac_0
implements fzp_0 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ dab_0 b;

    dac_0(dab_0 dab_02, exk_2 exk_22) {
        this.b = dab_02;
        this.a = exk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cnN cnN2 = new cnN();
            cnN2.a(this.a.a());
            azu_0.j().K().c(cnN2);
            fis_1.a().a("itemDetail", (Object)null, "inventoryDialog");
            fis_1.a().a("itemDetail", (Object)null, "heroBuildDialog");
            fis_1.a().a("pet", null, (Object)"inventoryDialog");
        }
    }
}

