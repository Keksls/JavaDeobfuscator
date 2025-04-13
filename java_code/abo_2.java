/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from aBO
 */
public class abo_2<F, S> {
    private F a;
    private S b;

    public abo_2() {
    }

    public abo_2(F f2, S s2) {
        this.a = f2;
        this.b = s2;
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof abo_2)) {
            return false;
        }
        abo_2 abo_22 = (abo_2)object;
        if (!Objects.equals(this.a, abo_22.a)) {
            return false;
        }
        return Objects.equals(this.b, abo_22.b);
    }

    public int hashCode() {
        int n = this.a != null ? this.a.hashCode() : 0;
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    public String toString() {
        return "ObjectPair{m_first=" + this.a + ", m_second=" + this.b + "}";
    }
}

