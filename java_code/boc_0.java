/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bOc
 */
class boc_0
implements TObjectProcedure<bNK> {
    final /* synthetic */ bob_0 a;

    boc_0(bob_0 bob_02) {
        this.a = bob_02;
    }

    public boolean a(bNK bNK2) {
        short s2 = bNK2.aR().j();
        bob_0.a(this.a, s2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNK)object);
    }
}

