/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

public class fgf {
    private final acy_2<azj_2> a = new acy_2();

    void a(int n, azj_2 azj_22) {
        this.a.a(n, azj_22);
    }

    public void a(TIntObjectProcedure<azj_2> tIntObjectProcedure) {
        int n = this.a.d();
        for (int k = 0; k < n; ++k) {
            if (tIntObjectProcedure.execute(this.a.e(k), (Object)this.a.h(k))) continue;
            return;
        }
    }

    public String toString() {
        return "PetDefinitionColor{m_colorParts=" + this.a.d() + "}";
    }
}

