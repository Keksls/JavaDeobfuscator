/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOM
 */
class com_2
implements fzc {
    final /* synthetic */ col_1 a;

    com_2(col_1 col_12) {
        this.a = col_12;
    }

    @Override
    public boolean a(int n) {
        if (!fyP.a().h(this.a.b.a)) {
            this.a.b.a.removePostProcessCallback(this);
            this.a.a.run();
        }
        return true;
    }
}

