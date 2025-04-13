/*
 * Decompiled with CFR 0.152.
 */
class cXD
implements ans_1 {
    final /* synthetic */ cXC a;

    cXD(cXC cXC2) {
        this.a = cXC2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("craftTableDialog") || string.equals("craftTableFreeDialog")) {
            azu_0.j().b(cXC.a());
        }
    }
}

