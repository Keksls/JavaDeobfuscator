/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfa
 */
class bfa_1
implements asb_2<asm_0> {
    final /* synthetic */ bjy_2 a;
    final /* synthetic */ bex_2 b;

    bfa_1(bex_2 bex_22, bjy_2 bjy_22) {
        this.b = bex_22;
        this.a = bjy_22;
    }

    public void a(asm_0 asm_02) {
        Object object;
        if (asm_02.H() != null) {
            object = bhw_0.a(asm_02);
            eZv.a.a(asm_02.c(), (eZu)object);
        }
        if (asm_02.I() != null && (object = bhw_0.b(asm_02)) != null) {
            bie_0.a().a(asm_02.c(), (ezf_0)object);
        }
        bhb_0.d().a(this.a.b(asm_02));
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((asm_0)asu_22);
    }
}

