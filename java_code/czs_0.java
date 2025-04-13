/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZs
 */
class czs_0
implements fxv_0 {
    final /* synthetic */ czr_0 a;

    czs_0(czr_0 czr_02) {
        this.a = czr_02;
    }

    @Override
    public void onColumnSortChanged(String string, boolean bl) {
        if ("level".equals(string)) {
            this.a.f = bl ? eqn_0.a : eqn_0.b;
        } else if ("guildPoints".equals(string)) {
            this.a.f = bl ? eqn_0.c : eqn_0.d;
        } else if ("conquestPoints".equals(string)) {
            this.a.f = bl ? eqn_0.e : eqn_0.f;
        }
        this.a.e.a((short)0);
        this.a.a(this.a.e.a());
    }
}

