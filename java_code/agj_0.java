/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agJ
 */
class agj_0
implements agr_0 {
    final /* synthetic */ agi_0 a;

    agj_0(agi_0 agi_02) {
        this.a = agi_02;
    }

    @Override
    public void a(ags_0 ags_02, ajb_1 ajb_12) {
        if (!this.a.b.contains((Object)ags_02) || this.a.c.get((Object)ags_02) == ajb_12) {
            return;
        }
        if (ajb_12.g()) {
            this.a.a(ags_02, ajb_12);
        } else {
            ajb_12.a(this.a.a(ags_02));
        }
    }

    @Override
    public void b(ags_0 ags_02, ajb_1 ajb_12) {
        if (!this.a.b.contains((Object)ags_02) || this.a.c.get((Object)ags_02) != ajb_12) {
            return;
        }
        this.a.b(ags_02, ajb_12);
    }
}

