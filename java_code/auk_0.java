/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUk
 */
final class auk_0 {
    private final int a;
    private final String b;
    private final String c;

    auk_0(int n, String string, String string2) {
        this.a = n;
        this.b = string;
        this.c = string2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String toString() {
        return String.format("InsertedObject(index=%s, identifier=%s, name=%s)", this.a, this.b, this.c);
    }
}

