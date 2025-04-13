/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.procedure.TShortObjectProcedure;

/*
 * Renamed from acC
 */
class acc_0
implements TShortObjectProcedure<acA> {
    int a;
    final TShortArrayList b = new TShortArrayList();
    final /* synthetic */ acz c;

    acc_0(acz acz2) {
        this.c = acz2;
    }

    public boolean a(short s2, acA acA2) {
        if (acA2.a(this.a)) {
            this.b.add(s2);
        }
        return true;
    }

    void a() {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            this.c.r.remove(this.b.getQuick(k));
        }
        this.b.clear();
    }

    public /* synthetic */ boolean execute(short s2, Object object) {
        return this.a(s2, (acA)object);
    }
}

