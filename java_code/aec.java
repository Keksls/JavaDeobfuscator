/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TObjectProcedure;

class aec
implements TObjectProcedure<adS> {
    private float b;
    private int c;
    final TIntArrayList a = new TIntArrayList();

    aec() {
    }

    public boolean a(adS adS2) {
        if (adS2.f()) {
            adS2.b(this.b);
        }
        adS2.a(this.c);
        if (adS2.p()) {
            this.a.add(adS2.d());
        }
        return true;
    }

    void a(float f2, int n) {
        this.b = f2;
        this.c = n;
        this.a.resetQuick();
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((adS)object);
    }
}

