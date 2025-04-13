/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from dhQ
 */
public class dhq_0
implements Comparable<dhq_0> {
    private final int a;
    private final int b;

    public dhq_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        dhq_0 dhq_02 = (dhq_0)object;
        if (this.b != dhq_02.b) {
            return false;
        }
        return this.a == dhq_02.a;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        return n;
    }

    public String toString() {
        return String.valueOf(this.a) + "x" + this.b;
    }

    public int a(@NotNull dhq_0 dhq_02) {
        return this.a * this.b - dhq_02.a * dhq_02.b;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((dhq_0)object);
    }
}

