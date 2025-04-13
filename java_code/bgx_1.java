/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bGX
 */
final class bgx_1
implements TObjectProcedure<epq_2> {
    private boolean a = true;
    private final int b;

    bgx_1(int n) {
        this.b = n;
    }

    public boolean a(epq_2 epq_22) {
        if (epq_22.dr() >= this.b) {
            return true;
        }
        this.a = false;
        return false;
    }

    public boolean a() {
        return this.a;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epq_2)object);
    }
}

