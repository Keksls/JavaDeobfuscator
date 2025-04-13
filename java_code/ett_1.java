/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTT
 */
public class ett_1
implements TObjectProcedure<esy_2> {
    private final int a;
    private int b;

    public ett_1(int n) {
        this.a = n;
        this.b = 0;
    }

    public boolean a(esy_2 esy_22) {
        etk_2 etk_22 = eti_2.a.c(esy_22.g().d());
        if (eta_2.e(esy_22.g()) != etf_2.c) {
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
        return this.a((esy_2)object);
    }
}

