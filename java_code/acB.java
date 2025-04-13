/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TLongObjectProcedure;

class acB
implements TLongObjectProcedure<acA> {
    int a;
    final TLongArrayList b = new TLongArrayList();
    final /* synthetic */ acz c;

    acB(acz acz2) {
        this.c = acz2;
    }

    public boolean a(long l, acA acA2) {
        if (acA2.a(this.a)) {
            this.b.add(l);
        }
        return true;
    }

    void a() {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            this.c.q.remove(this.b.getQuick(k));
        }
        this.b.clear();
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (acA)object);
    }
}

