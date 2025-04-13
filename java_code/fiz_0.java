/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

/*
 * Renamed from fiZ
 */
class fiz_0
implements TObjectProcedure<fiv_0> {
    final /* synthetic */ aq_0 a;
    final /* synthetic */ fiy_0 b;

    fiz_0(fiy_0 fiy_02, aq_0 aq_02) {
        this.b = fiy_02;
        this.a = aq_02;
    }

    public boolean a(fiv_0 fiv_02) {
        at_0 at_02 = ar_0.h();
        at_02.c(fiv_02.a());
        List<exk_2> list = fiv_02.b();
        for (exk_2 exk_22 : list) {
            kT kT2 = eyl_1.a(exk_22, fiv_02.b(exk_22.a()));
            at_02.a(kT2);
        }
        this.a.a(at_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fiv_0)object);
    }
}

