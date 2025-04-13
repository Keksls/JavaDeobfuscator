/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUW
 */
class cuw_0
implements ans_1 {
    final /* synthetic */ cuv_0 a;

    cuw_0(cuv_0 cuv_02) {
        this.a = cuv_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!string.startsWith(this.a.c())) {
            return;
        }
        if (string.equals(this.a.a)) {
            this.a.a = null;
        }
        short s2 = Short.parseShort(string.replaceAll(this.a.c(), ""));
        this.a.b(s2);
    }
}

