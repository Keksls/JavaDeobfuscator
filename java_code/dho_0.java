/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from dhO
 */
final class dho_0
implements Comparable<dho_0> {
    final int a;

    dho_0(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        dho_0 dho_02 = (dho_0)object;
        return this.a == dho_02.a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        if (this.a == 0) {
            return "Default";
        }
        return Integer.toString(this.a) + " Hz";
    }

    public int a(@NotNull dho_0 dho_02) {
        return this.a - dho_02.a;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((dho_0)object);
    }
}

