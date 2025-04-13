/*
 * Decompiled with CFR 0.152.
 */
final class eAR {
    private final String a;
    private final eAO b;
    private final long c;

    eAR(String string, eAO eAO2, long l) {
        this.a = string == null ? "" : string;
        this.b = eAO2;
        this.c = l;
    }

    public boolean a(eAR eAR2) {
        return this.a.equals(eAR2.a) && this.b == eAR2.b;
    }

    public long a() {
        return this.c;
    }

    public String toString() {
        return String.format("Action{recipientName=%s,actionType=%s,time=%s", this.a, this.b.name(), this.c);
    }
}

