/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from aOG
 */
class aog_0
implements TLongObjectProcedure<bNK> {
    final /* synthetic */ aof_0 a;

    aog_0(aof_0 aof_02) {
        this.a = aof_02;
    }

    public boolean a(long l, bNK bNK2) {
        byte by;
        byte by2 = this.a.h.get((Object)bNK2);
        if (by2 != (by = this.a.d(bNK2))) {
            this.a.i = true;
        }
        this.a.h.put((Object)bNK2, by);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bNK)object);
    }
}

