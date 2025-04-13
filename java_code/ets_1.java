/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTS
 */
public class ets_1
implements TObjectProcedure<ese_1> {
    private final int a;
    private int b;

    public ets_1(int n) {
        this.a = n;
        this.b = 0;
    }

    public boolean a(ese_1 ese_12) {
        etk_2 etk_22 = eti_2.a.c(ese_12.a().d());
        if (eta_2.e(ese_12.a()) != etf_2.c) {
            return true;
        }
        int n = etk_22.h();
        if (eoD.a(n, this.a) || n == this.a) {
            ++this.b;
        }
        return true;
    }

    public int a() {
        return this.b;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

