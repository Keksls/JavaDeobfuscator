/*
 * Decompiled with CFR 0.152.
 */
public class adP
extends adO {
    private static final float c = 0.0f;
    private int d;

    public adP(int n, int n2, int n3, int n4) {
        super(n2, n3, n4);
        this.d = n;
    }

    @Override
    public boolean a(int n) {
        if (this.d > 0) {
            this.d -= n;
            return true;
        }
        return super.a(n);
    }

    @Override
    public float a() {
        if (this.d > 0) {
            return 0.0f;
        }
        return super.a();
    }

    @Override
    public String toString() {
        return "WaitTimedStrength{m_wait=" + this.d + "}";
    }
}

