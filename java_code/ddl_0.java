/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddL
 */
class ddl_0
implements ans_1 {
    final /* synthetic */ ddK a;

    ddl_0(ddK ddK2) {
        this.a = ddK2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("weatherInfoDialog")) {
            azu_0.j().b(ddK.a());
        }
    }
}

