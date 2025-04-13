/*
 * Decompiled with CFR 0.152.
 */
public class adL
extends adN {
    private final int b;
    private int c;

    public adL(int n) {
        super(1.0f);
        this.b = n;
    }

    public adL(int n, float f2) {
        this(n);
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.c = (int)Hw.a((float)this.b, 0.0f, f2);
    }

    @Override
    public boolean a(int n) {
        this.c += n;
        if (this.c > this.b) {
            return false;
        }
        return super.a(n);
    }

    @Override
    public float a() {
        float f2 = Hw.b((float)(this.b - this.c) / (float)this.b, 0.0f, 1.0f);
        return super.a() * f2;
    }
}

