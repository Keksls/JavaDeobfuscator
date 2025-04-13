/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from daO
 */
class dao_0
implements ans_1 {
    final /* synthetic */ dan_0 a;

    dao_0(dan_0 dan_02) {
        this.a = dan_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("mixDebuggerDialog")) {
            azu_0.j().b(dan_0.a());
        }
    }
}

