/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbb
 */
class dbb_0
implements ans_1 {
    final /* synthetic */ daz_0 a;

    dbb_0(daz_0 daz_02) {
        this.a = daz_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("moderatorChatDialog")) {
            this.a.c();
        }
    }
}

