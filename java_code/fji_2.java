/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJi
 */
public class fji_2
extends fjh_2<azj_2> {
    private final float[] a;
    private final atm_1 o;

    public fji_2(float[] fArray, azj_2 azj_22, azj_2 azj_23, atm_1 atm_12, frO frO2, int n, int n2, fjw_2 fjw_22, int n3) {
        super(azj_22, azj_23, frO2, n, n2, fjw_22);
        this.a = (float[])fArray.clone();
        this.o = atm_12;
        this.d(n3);
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        float[] fArray = new float[]{this.c.a(((azj_2)this.j).q(), ((azj_2)this.k).q(), this.d, this.e), this.c.a(((azj_2)this.j).r(), ((azj_2)this.k).r(), this.d, this.e), this.c.a(((azj_2)this.j).s(), ((azj_2)this.k).s(), this.d, this.e), this.c.a(((azj_2)this.j).p(), ((azj_2)this.k).p(), this.d, this.e)};
        ((frO)this.m).getAnimatedElement().a(this.o, fArray);
        ((frO)this.m).getAnimatedElement().i(true);
        return true;
    }

    @Override
    public void a() {
        ((frO)this.m).getAnimatedElement().a(this.o, this.a);
        ((frO)this.m).getAnimatedElement().i(true);
        super.a();
    }
}

