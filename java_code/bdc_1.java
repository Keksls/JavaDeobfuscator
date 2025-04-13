/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bDc
 */
class bdc_1
implements TObjectProcedure<Object> {
    bdc_1() {
    }

    public boolean execute(Object object) {
        if (object instanceof afv) {
            afz_0.d().b((afv)object);
        }
        return true;
    }
}

