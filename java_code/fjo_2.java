/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fJo
 */
public class fjo_2
extends fjg_2<azj_2> {
    private final ArrayList<fqt> a;

    public fjo_2(azj_2 azj_22, azj_2 azj_23, ArrayList<fqt> arrayList, int n, int n2, int n3, fjw_2 fjw_22) {
        this.a(azj_22);
        this.b(azj_23);
        this.a = arrayList;
        this.c(n);
        this.b(n2);
        this.d(n3);
        this.a(fjw_22);
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            azj_2 azj_22 = (azj_2)this.j;
            azj_2 azj_23 = (azj_2)this.k;
            float f2 = this.c.a(azj_22.q(), azj_23.q(), this.d, this.e);
            float f3 = this.c.a(azj_22.r(), azj_23.r(), this.d, this.e);
            float f4 = this.c.a(azj_22.s(), azj_23.s(), this.d, this.e);
            float f5 = this.c.a(azj_22.p(), azj_23.p(), this.d, this.e);
            azf_2 azf_22 = new azf_2(f2, f3, f4, f5);
            for (int k = this.a.size() - 1; k >= 0; --k) {
                this.a.get(k).setModulationColor(azf_22);
            }
        }
        return true;
    }

    @Override
    public void a() {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            this.a.get(k).setModulationColor((azj_2)this.k);
        }
        super.a();
    }

    public String toString() {
        return "[ModulationColorListTween] " + this.j + " -> " + this.k;
    }
}

