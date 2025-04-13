/*
 * Decompiled with CFR 0.152.
 */
class ftE
extends fjh_2<Float> {
    private boolean o;
    final /* synthetic */ ftv a;

    private ftE(ftv ftv2) {
        this.a = ftv2;
        this.o = false;
    }

    ftE(ftv ftv2, float f2, float f3, ftv ftv3, int n, int n2, fjw_2 fjw_22) {
        this.a = ftv2;
        super(Float.valueOf(f2), Float.valueOf(f3), ftv3, n, n2, fjw_22);
        this.o = false;
    }

    public void a(float f2, float f3) {
        if (this.o) {
            this.e += 500;
            this.k = Float.valueOf(f3);
        }
        this.o = true;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null && this.j instanceof Float && this.k instanceof Float) {
            this.a.z = this.c.a(((Float)this.j).floatValue(), ((Float)this.k).floatValue(), this.d, this.e);
            this.a.a();
        }
        return true;
    }

    @Override
    public void a() {
        this.a.z = ((Float)this.k).floatValue();
        this.a.a();
        super.a();
    }

    public String toString() {
        return "[ProgressBarTween] " + this.j + " -> " + this.k;
    }
}

