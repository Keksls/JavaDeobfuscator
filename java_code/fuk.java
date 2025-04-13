/*
 * Decompiled with CFR 0.152.
 */
public class fuk
extends fjh_2<Float> {
    final /* synthetic */ fue_0 a;

    public fuk(fue_0 fue_02, float f2, float f3, fue_0 fue_03, int n, int n2, fjw_2 fjw_22) {
        this.a = fue_02;
        super(Float.valueOf(f2), Float.valueOf(f3), fue_03, n, n2, fjw_22);
    }

    @Override
    public boolean a(int n) {
        float f2;
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null && (f2 = this.c.a(((Float)this.j).floatValue(), ((Float)this.k).floatValue(), this.d, this.e)) <= this.a.v) {
            this.a.v = f2;
        }
        return true;
    }
}

