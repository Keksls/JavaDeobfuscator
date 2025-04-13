/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class fhp {
    private int a;
    private int b;
    private int c;
    private int d;
    private fgY e;
    private fgY f;
    private int g;

    public void a(int n) {
        this.a = n;
    }

    public void b(int n) {
        this.b = n;
    }

    public void c(int n) {
        this.d = n;
    }

    public void a(fgY fgY2) {
        this.f = fgY2;
    }

    public void d(int n) {
        this.c = n;
    }

    public void b(fgY fgY2) {
        this.e = fgY2;
    }

    public void e(int n) {
        this.g = n;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public fgY e() {
        return this.e;
    }

    @Nullable
    public fgY f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public String toString() {
        return "PlayerReportInfo{m_previousStrength=" + this.a + ", m_currentStrength=" + this.b + ", m_previousRanking=" + this.c + ", m_currentRanking=" + this.d + ", m_previousRank=" + this.e + ", m_currentRank=" + this.f + "}";
    }
}

