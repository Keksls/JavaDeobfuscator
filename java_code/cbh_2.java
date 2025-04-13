/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cbh
 */
class cbh_2
implements TObjectProcedure<epl_0> {
    private final long a;
    private int b;
    private int c;

    cbh_2(long l) {
        this.a = l;
    }

    public boolean a(epl_0 epl_02) {
        if (!epl_02.w()) {
            return true;
        }
        if (epl_02.o() == this.a) {
            ++this.c;
        }
        ++this.b;
        return true;
    }

    int a() {
        return this.b;
    }

    int b() {
        return this.c;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epl_0)object);
    }
}

