/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cca
 */
final class cca_2 {
    final int a;
    final int b;
    final int c;
    final int d;
    final int e;

    cca_2(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = this.a + this.b + this.c + this.d;
    }

    @NotNull
    adN a() {
        return new adP(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "Duration{m_waitDuration=" + this.a + ", m_startDuration=" + this.b + ", m_middleDuration=" + this.c + ", m_endDuration=" + this.d + ", m_totalDuration=" + this.e + "}";
    }
}

