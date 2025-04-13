/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bNU
implements TObjectProcedure<bNK> {
    final /* synthetic */ acb_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ bNT c;

    bNU(bNT bNT2, acb_0 acb_02, int n) {
        this.c = bNT2;
        this.a = acb_02;
        this.b = n;
    }

    public boolean a(bNK bNK2) {
        if (bNK2.a(this.a, this.b, bNT.h)) {
            if (bNK2.aK()) {
                this.c.e.add(bNK2);
            } else {
                bNT.a(this.c).add(bNK2);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNK)object);
    }
}

