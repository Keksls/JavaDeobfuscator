/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

public class fgi {
    private final acr_2 a = new acr_2();
    private final wx_0 b;
    private final wx_0 c;
    private final byte d;

    public fgi(long l, long l2, byte by) {
        this.b = ww_0.a(l);
        this.c = ww_0.a(l2);
        this.d = by;
    }

    public wx_0 a() {
        return this.b;
    }

    public wx_0 b() {
        return this.c;
    }

    public byte c() {
        return this.d;
    }

    public void a(int n, boolean bl) {
        this.a.a(n, bl);
    }

    public boolean a(int n) {
        return this.a.d(n);
    }

    public boolean a(TIntProcedure tIntProcedure) {
        int n = this.a.d();
        for (int k = 0; k < n; ++k) {
            if (!this.a.h(k) || tIntProcedure.execute(this.a.e(k))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "PetDefinitionMeal{m_mealItemRefIds=" + this.a.d() + ", m_mealMinInterval=" + this.b + ", m_mealMaxInterval=" + this.c + ", m_xpPerMeal=" + this.d + "}";
    }
}

