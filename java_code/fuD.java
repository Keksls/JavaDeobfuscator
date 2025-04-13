/*
 * Decompiled with CFR 0.152.
 */
class fuD
implements fzu {
    final /* synthetic */ fxs_0 a;
    final /* synthetic */ fru_0 b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ fuc_0 e;

    fuD(fuc_0 fuc_02, fxs_0 fxs_02, fru_0 fru_02, String string, String string2) {
        this.e = fuc_02;
        this.a = fxs_02;
        this.b = fru_02;
        this.c = string;
        this.d = string2;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.e.dispatchEvent(new fcn_2(this.e, this.a.getColumnId()));
        int n = this.e.w.size();
        for (int k = 0; k < n; ++k) {
            fru_0 fru_02 = this.e.w.get(k);
            if (this.b == fru_02) continue;
            if (!this.c.equals(fru_02.getStyle())) {
                fru_02.setPixmap(null);
            }
            fru_02.setStyle(this.c, false);
        }
        if (this.e.Z != null) {
            this.e.P = this.e.Z.a(this.e.y, this.a.getColumnId());
            StringBuilder stringBuilder = new StringBuilder("table");
            if (this.d != null) {
                stringBuilder.append(this.d);
            }
            stringBuilder.append("$");
            if (this.e.Z.c()) {
                stringBuilder.append("directSortButton");
            } else {
                stringBuilder.append("indirectSortButton");
            }
            this.b.setStyle(stringBuilder.toString(), true);
            this.e.setValuesDirty();
        }
        return false;
    }
}

