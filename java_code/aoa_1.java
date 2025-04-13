/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoa
 */
public class aoa_1 {
    private int a;
    private int b;
    private int c;
    private final String d;

    public aoa_1(int n, int n2, int n3, String string) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = string;
    }

    public final int a() {
        return this.a;
    }

    public final void a(int n) {
        this.a = n;
    }

    public final int b() {
        return this.b;
    }

    public final void b(int n) {
        this.b = n;
    }

    public final int c() {
        return this.c;
    }

    public final void c(int n) {
        this.c = n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a).append("x").append(this.b);
        if (this.c > 0) {
            stringBuilder.append(" (").append(this.c).append(")");
        }
        if (this.d != null && !this.d.isEmpty()) {
            stringBuilder.append(" (").append(this.d).append(")");
        }
        return stringBuilder.toString();
    }
}

