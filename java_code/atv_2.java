/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from atV
 */
class atv_2
implements TObjectProcedure<ato_2> {
    atv_2() {
    }

    public boolean a(ato_2 ato_22) {
        return ato_22.c.i() <= 1;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ato_2)object);
    }
}

