/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dag
 */
class dag_0
implements ans_1 {
    final /* synthetic */ dab_0 a;

    dag_0(dab_0 dab_02) {
        this.a = dab_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals(this.a.e)) {
            this.a.e = null;
        }
        this.a.d.remove(string);
    }
}

