/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fse
 */
class fse_0
implements fzu {
    final /* synthetic */ fsg a;
    final /* synthetic */ fsb b;

    fse_0(fsb fsb2, fsg fsg2) {
        this.b = fsb2;
        this.a = fsg2;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.b.setSelectedDate(this.b.j.indexOf(this.a) + 1);
        return false;
    }
}

