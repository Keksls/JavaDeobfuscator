/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from bzE
 */
public class bze_1
implements bzc_1 {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private final int e;
    private final int f;
    private final boolean g;

    public bze_1(int n, int n2, boolean bl) {
        this.e = n;
        this.f = n2;
        this.g = bl;
    }

    public static bze_1 d() {
        return new bze_1(-1, -1, false);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        short s2;
        if (exk_22.aQ_()) {
            return true;
        }
        Short s3 = exk_22.F();
        short s4 = s2 = s3 != null ? s3.shortValue() : exk_22.T().G();
        if (this.e == -1 && this.f == -1) {
            return true;
        }
        if (this.e == -1) {
            return s2 <= this.f;
        }
        if (this.f == -1) {
            return this.e <= s2;
        }
        return this.e <= s2 && s2 <= this.f;
    }

    @Override
    public boolean a() {
        if (this.e == -1) {
            return this.f != -1;
        }
        if (this.f == -1) {
            return true;
        }
        return this.f >= this.e;
    }

    @Override
    public bzd_1 b() {
        return bzd_1.b;
    }

    @Override
    public int c() {
        if (!this.a()) {
            return 0;
        }
        return this.g ? 1 : 2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bze_1 bze_12 = (bze_1)object;
        return this.e == bze_12.e && this.f == bze_12.f;
    }

    public int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}

