/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bzM
 */
final class bzm_1 {
    @NotNull
    final String a;
    final short b;
    final int c;

    public String toString() {
        return "BuildSheetModifications.Modification(m_buildName=" + this.a + ", m_buildLevel=" + this.b + ", m_buildIconIndex=" + this.c + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bzm_1)) {
            return false;
        }
        bzm_1 bzm_12 = (bzm_1)object;
        if (this.b != bzm_12.b) {
            return false;
        }
        if (this.c != bzm_12.c) {
            return false;
        }
        String string = this.a;
        String string2 = bzm_12.a;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.b;
        n2 = n2 * 59 + this.c;
        String string = this.a;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public bzm_1(@NotNull String string, short s2, int n) {
        if (string == null) {
            throw new NullPointerException("buildName is marked non-null but is null");
        }
        this.a = string;
        this.b = s2;
        this.c = n;
    }
}

