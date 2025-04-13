/*
 * Decompiled with CFR 0.152.
 */
class bVi
implements fbx_0 {
    final /* synthetic */ bUW a;

    bVi(bUW bUW2) {
        this.a = bUW2;
    }

    @Override
    public void a() {
        bmr_1 bmr_12 = azu_0.j().k();
        this.a.a(bmr_12.fE().v().d);
        dbd.a().a(true);
        if (fpm_0.b().q("nationDialog")) {
            fyy_0 fyy_02 = fpm_0.b().h().d("nationDialog");
            fso fso2 = (fso)fyy_02.a("crownCursorContainer");
            fso2.invalidate();
        }
    }
}

