/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fgG
 */
class fgg_0
implements TObjectProcedure<TProtector> {
    final /* synthetic */ fge_0 a;

    fgg_0(fge_0 fge_02) {
        this.a = fge_02;
    }

    public boolean a(TProtector TProtector) {
        for (fgh_0 fgh_02 : this.a.c) {
            try {
                fgh_02.b(TProtector);
            }
            catch (Exception exception) {
                fge_0.b.error((Object)("Exception lev\u00e9e lors du d\u00e9-enregitrement d'un protecteur ID=" + ((fgy_0)TProtector).B()));
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fgy_0)object);
    }
}

