/*
 * Decompiled with CFR 0.152.
 */
public class aPz {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final float g;
    public final float h;

    public aPz(boolean bl, int n, int n2, int n3, int n4, int n5, boolean bl2) {
        this.a = bl;
        this.c = n;
        this.b = bl2;
        this.d = n2 * 10;
        this.e = n3 * 10;
        this.f = (n4 + n5) % 2 != 0;
        this.g = acm_0.b(n4, n5);
        this.h = acm_0.b(n4, n5, n);
    }

    public float a() {
        return this.g;
    }

    public float b() {
        return this.h;
    }

    public float c() {
        return this.g - 43.0f;
    }

    public float d() {
        return this.g + 43.0f;
    }

    public float e() {
        return this.h + 21.5f;
    }

    public float f() {
        return this.h - 21.5f;
    }

    public boolean g() {
        return !this.a;
    }
}

