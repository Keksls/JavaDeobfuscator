/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bNW
implements TObjectProcedure<bNK> {
    final /* synthetic */ bNT a;

    bNW(bNT bNT2) {
        this.a = bNT2;
    }

    public boolean a(bNK bNK2) {
        this.a.b(bNK2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNK)object);
    }
}

