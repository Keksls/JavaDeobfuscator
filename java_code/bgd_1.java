/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bGd
 */
class bgd_1
implements TObjectProcedure<pj_0> {
    private final int a;
    private final int b;
    private final short c;
    private boolean d;

    bgd_1(int n, int n2, short s2) {
        this.a = n;
        this.b = n2;
        this.c = s2;
    }

    public boolean a(pj_0 pj_02) {
        if (pj_02.G() != this.a || pj_02.H() != this.b || pj_02.I() != this.c) {
            return true;
        }
        if (!pj_02.M()) {
            return true;
        }
        this.d = true;
        return false;
    }

    public boolean a() {
        return this.d;
    }

    public String toString() {
        return "CheckCellBlockedProcedure{cellBlocked=" + this.d + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((pj_0)object);
    }
}

