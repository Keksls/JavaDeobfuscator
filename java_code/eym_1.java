/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eYm
 */
class eym_1
implements TObjectProcedure<exk_2> {
    final /* synthetic */ kQ a;
    final /* synthetic */ exg_2 b;

    eym_1(kQ kQ2, exg_2 exg_22) {
        this.a = kQ2;
        this.b = exg_22;
    }

    public boolean a(exk_2 exk_22) {
        this.a.a(eyl_1.a(exk_22, this.b));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((exk_2)object);
    }
}

