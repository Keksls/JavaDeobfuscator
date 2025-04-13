/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class deq
implements fzu {
    final /* synthetic */ aUv a;
    final /* synthetic */ dep b;

    deq(dep dep2, aUv aUv2) {
        this.b = dep2;
        this.a = aUv2;
    }

    @Override
    public boolean run(fzs fzs2) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
        if (fyy_02 != null && fyy_02.c() != null && fyy_02.c().equals(dey.a(this.a.a()))) {
            this.a.h().n();
            this.a.a((TObjectProcedure<? super aUr>)((TObjectProcedure)aUr2 -> {
                fis_1.a().a((ajf_1)aUr2, "allFiltersList");
                return true;
            }));
            return false;
        }
        return true;
    }
}

