/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eBZ
 */
public class ebz_0 {
    private final int a;
    private final int b;

    public int a(@NotNull eco_0 eco_02) {
        return eco_02.h() ? this.c() : this.d();
    }

    public eca_0 a() {
        return ebz_0.b().b(this.d()).a(this.c());
    }

    public static eca_0 b() {
        return new eca_0();
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ebz_0)) {
            return false;
        }
        ebz_0 ebz_02 = (ebz_0)object;
        if (!ebz_02.a(this)) {
            return false;
        }
        if (this.c() != ebz_02.c()) {
            return false;
        }
        return this.d() == ebz_02.d();
    }

    protected boolean a(Object object) {
        return object instanceof ebz_0;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.c();
        n2 = n2 * 59 + this.d();
        return n2;
    }

    public String toString() {
        return "CraftStepFees(m_equipmentFees=" + this.c() + ", m_componentFees=" + this.d() + ")";
    }

    public ebz_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }
}

