/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eWv
 */
final class ewv_1
implements TObjectProcedure<exk_2> {
    static final ewv_1 a = new ewv_1();

    private ewv_1() {
    }

    public boolean a(exk_2 exk_22) {
        exk_22.release();
        return false;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((exk_2)object);
    }
}

