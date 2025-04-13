/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from aBI
 */
public class abi_2<S> {
    private int a;
    private S b;

    public abi_2() {
    }

    public abi_2(int n, S s2) {
        this.a = n;
        this.b = s2;
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public S b() {
        return this.b;
    }

    public void a(S s2) {
        this.b = s2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof abi_2)) {
            return false;
        }
        abi_2 abi_22 = (abi_2)object;
        if (this.a != abi_22.a) {
            return false;
        }
        return Objects.equals(this.b, abi_22.b);
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    public String toString() {
        return "IntObjectPair{m_first=" + this.a + ", m_second=" + this.b + "}";
    }
}

