/*
 * Decompiled with CFR 0.152.
 */
public class adO
extends adN {
    public static final float a = 0.0f;
    public static final float b = 1.0f;
    private final int c;
    private final int d;
    private final int e;
    private int f;

    public adO(int n, int n2, int n3) {
        super(1.0f);
        this.c = n;
        this.d = n2;
        this.e = n3;
    }

    @Override
    public boolean a(int n) {
        this.f += n;
        int n2 = this.c + this.d + this.e;
        if (this.f > n2) {
            return false;
        }
        return super.a(n);
    }

    @Override
    public float a() {
        float f2 = Hw.b(this.b(), 0.0f, 1.0f);
        return super.a() * f2;
    }

    private float b() {
        float f2 = this.f;
        if (f2 < (float)this.c) {
            return f2 / (float)this.c;
        }
        if ((f2 -= (float)this.c) < (float)this.d) {
            return 1.0f;
        }
        if ((f2 -= (float)this.d) < (float)this.e) {
            return 1.0f - f2 / (float)this.e;
        }
        return 0.0f;
    }

    @Override
    public String toString() {
        return "TimedStrength{m_startDuration=" + this.c + ", m_middleDuration=" + this.d + ", m_endDuration=" + this.e + ", m_elapsedTime=" + this.f + "}";
    }
}

