/*
 * Decompiled with CFR 0.152.
 */
final class eAS {
    private final String a;
    private final long b;

    eAS(String string, long l) {
        this.a = string;
        this.b = l;
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String toString() {
        return String.format("Entry{text=%s,time=%s}", this.a, this.b);
    }
}

