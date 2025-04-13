/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aru
 */
public class aru_2
implements arc_1 {
    private String a;
    private int b = -1;

    public String toString() {
        return "[Comment] " + this.a;
    }

    @Override
    public String f() {
        return this.a;
    }

    void a(String string) {
        this.a = string;
    }

    @Override
    public int d() {
        return 0;
    }

    void a(int n) {
        this.b = n;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public arh_2 e() {
        return null;
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public String a() {
        return null;
    }
}

