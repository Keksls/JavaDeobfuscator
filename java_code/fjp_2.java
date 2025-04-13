/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJp
 */
public class fjp_2
extends fjg_2<azj_2> {
    private final azj_2 a;
    private final boolean o;

    public fjp_2(azj_2 azj_22, azj_2 azj_23, fqt fqt2, int n, int n2, int n3, fjw_2 fjw_22) {
        this(azj_22, azj_23, fqt2, n, n2, n3, true, fjw_22);
    }

    public fjp_2(azj_2 azj_22, azj_2 azj_23, fqt fqt2, int n, int n2, int n3, boolean bl, fjw_2 fjw_22) {
        this.a(azj_22);
        this.b(azj_23);
        this.a((fjt_2)((Object)fqt2));
        this.c(n);
        this.b(n2);
        this.d(n3);
        this.a(fjw_22);
        this.a = fqt2.getModulationColor();
        this.o = bl;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        float f2 = this.c.a(((azj_2)this.j).q(), ((azj_2)this.k).q(), this.d, this.e);
        float f3 = this.c.a(((azj_2)this.j).r(), ((azj_2)this.k).r(), this.d, this.e);
        float f4 = this.c.a(((azj_2)this.j).s(), ((azj_2)this.k).s(), this.d, this.e);
        float f5 = this.c.a(((azj_2)this.j).p(), ((azj_2)this.k).p(), this.d, this.e);
        azf_2 azf_22 = new azf_2(f2, f3, f4, f5);
        ((fqt)((Object)this.m)).setModulationColor(azf_22);
        return true;
    }

    @Override
    public void a() {
        if (this.o) {
            ((fqt)((Object)this.m)).setModulationColor(this.a);
        } else {
            ((fqt)((Object)this.m)).setModulationColor((azj_2)this.k);
        }
        super.a();
    }

    public String toString() {
        return "[ModulationColorTween] " + this.j + " -> " + this.k;
    }
}

