/*
 * Decompiled with CFR 0.152.
 */
class cXn
implements ans_1 {
    final /* synthetic */ cXm a;

    cXn(cXm cXm2) {
        this.a = cXm2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("inventoryDialog") || string.equals("freeCollectMachineDialog") || string.equals("lockedCollectMachineDialog") && azu_0.j().c(cXm.d())) {
            azu_0.j().b(cXm.d());
        }
    }
}

