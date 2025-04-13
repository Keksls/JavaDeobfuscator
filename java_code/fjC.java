/*
 * Decompiled with CFR 0.152.
 */
public class fjC {
    private final String a;
    private final int b;
    private final int c;
    private final int d;

    public fjC(String string, int n, int n2, int n3) {
        this.a = string;
        this.b = n;
        this.c = n2;
        this.d = n3;
    }

    public String a() {
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

    public String toString() {
        return "TravelLoadingInfo{m_animationName='" + this.a + "', m_minDuration=" + this.b + ", m_fadeInDuration=" + this.c + ", m_fadeOutDuration=" + this.d + "}";
    }
}

