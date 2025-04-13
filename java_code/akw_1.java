/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from aKw
 */
class akw_1
implements TIntObjectProcedure<akx_2> {
    private int b;
    final /* synthetic */ aks_1 a;

    akw_1(aks_1 aks_12) {
        this.a = aks_12;
    }

    public boolean a(int n, akx_2 akx_22) {
        akx_22.d(this.b);
        if (akx_22.g() == akz_1.f) {
            this.a.f(n);
        }
        return true;
    }

    public void a(int n) {
        this.b = n;
    }

    public String toString() {
        return "updateScript{m_deltaTime=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (akx_2)object);
    }
}

