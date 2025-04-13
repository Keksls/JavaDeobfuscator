/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bcm
 */
class bcm_2
implements TObjectProcedure<bcn_2> {
    final /* synthetic */ bcl_2 a;

    bcm_2(bcl_2 bcl_22) {
        this.a = bcl_22;
    }

    public boolean a(bcn_2 bcn_22) {
        bcn_22.a(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bcn_2)object);
    }
}

