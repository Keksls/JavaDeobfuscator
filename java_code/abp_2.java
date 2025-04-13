/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from aBP
 */
public class abp_2<F, S, T> {
    private F a;
    private S b;
    private T c;

    public abp_2() {
    }

    public abp_2(F f2, S s2, T t) {
        this.a = f2;
        this.b = s2;
        this.c = t;
    }

    public F a() {
        return this.a;
    }

    public void a(F f2) {
        this.a = f2;
    }

    public S b() {
        return this.b;
    }

    public void b(S s2) {
        this.b = s2;
    }

    public T c() {
        return this.c;
    }

    public void c(T t) {
        this.c = t;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        abp_2 abp_22 = (abp_2)object;
        if (!Objects.equals(this.a, abp_22.a)) {
            return false;
        }
        if (!Objects.equals(this.b, abp_22.b)) {
            return false;
        }
        return Objects.equals(this.c, abp_22.c);
    }

    public int hashCode() {
        int n = this.a != null ? this.a.hashCode() : 0;
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        n = 31 * n + (this.c != null ? this.c.hashCode() : 0);
        return n;
    }
}

