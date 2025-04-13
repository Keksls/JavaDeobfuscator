/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from auO
 */
class auo_1
implements TIntObjectProcedure<auh_1> {
    private int a;

    auo_1() {
    }

    public boolean a(int n, auh_1 auh_12) {
        if (auh_12.h()) {
            auh_12.a(this.a);
        } else {
            auh_12.a();
            aui_1.a().c(n);
        }
        return true;
    }

    public void a(int n) {
        this.a = n;
    }

    public String toString() {
        return "UpdateEffect{m_timeIncrement=" + this.a + "}";
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (auh_1)object);
    }
}

