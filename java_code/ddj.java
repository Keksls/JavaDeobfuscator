/*
 * Decompiled with CFR 0.152.
 */
class ddj
implements ans_1 {
    final /* synthetic */ ddi_0 a;

    ddj(ddi_0 ddi_02) {
        this.a = ddi_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("storageBoxDialog") || string.equals("inventoryDialog")) {
            azu_0.j().b(ddi_0.d());
        }
    }
}

