/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from asR
 */
public class asr_1 {
    private final int b;
    private final int c;
    public static final asr_1 a = new asr_1(-1, -1);

    @NotNull
    static asr_1 a(int n, int n2) {
        if (n == -1 && n2 == -1) {
            return a;
        }
        return new asr_1(n, n2);
    }

    private asr_1(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        asr_1 asr_12 = (asr_1)object;
        if (this.c != asr_12.c) {
            return false;
        }
        return this.b == asr_12.b;
    }

    public int hashCode() {
        int n = this.b;
        n = 31 * n + this.c;
        return n;
    }
}

