/*
 * Decompiled with CFR 0.152.
 */
public class acO
implements aei_0 {
    private float a;
    private float b;
    private float c;
    private boolean d;

    @Override
    public void b(int n) {
    }

    public void a(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = auc_1.a(this.a, 0.0f) && auc_1.a(this.b, 0.0f) && auc_1.a(this.c, 0.0f);
    }

    @Override
    public int e() {
        return 500;
    }

    @Override
    public boolean d() {
        return this.d;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = fArray[0] + this.a;
        fArray[1] = fArray[1] + this.b;
        fArray[2] = fArray[2] + this.c;
    }
}

