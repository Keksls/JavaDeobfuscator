/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectByteProcedure
 */
import gnu.trove.procedure.TObjectByteProcedure;

/*
 * Renamed from aOH
 */
class aoh_0
implements TObjectByteProcedure<bNK> {
    final /* synthetic */ aof_0 a;

    aoh_0(aof_0 aof_02) {
        this.a = aof_02;
    }

    public boolean a(bNK bNK2, byte by) {
        if (by > 0) {
            int n = bNK2.G();
            int n2 = bNK2.H();
            float[] fArray = (float[])this.a.c.get(by);
            int n3 = 3;
            this.a.k.a(fArray, by + 1, 3, n - 1, n2 - 1);
            bNK2.f(1.0f / fArray[by + 2]);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object, byte by) {
        return this.a((bNK)object, by);
    }
}

