/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from XE
 */
public enum xe_0 {
    a(0, "low"),
    b(1, "low"),
    c(2, "medium"),
    d(3, "high");

    private final int e;
    private final String f;

    private xe_0(int n2, String string2) {
        this.e = n2;
        this.f = string2;
    }

    public static xe_0 a(int n) {
        for (xe_0 xe_02 : xe_0.values()) {
            if (xe_02.e != n) continue;
            return xe_02;
        }
        return a;
    }

    public int a() {
        return this.e;
    }

    @NotNull
    public String b() {
        return this.f;
    }
}

