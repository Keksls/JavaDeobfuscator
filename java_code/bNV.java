/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bNV
implements TObjectProcedure<bNK> {
    final /* synthetic */ acb_0 a;
    final /* synthetic */ bNT b;

    bNV(bNT bNT2, acb_0 acb_02) {
        this.b = bNT2;
        this.a = acb_02;
    }

    public boolean a(bNK bNK2) {
        if (bNK2.a(this.a)) {
            bNT.a(this.b, bNK2, this.a);
            bNT.b(this.b).add(bNK2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNK)object);
    }
}

