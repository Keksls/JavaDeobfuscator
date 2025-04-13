/*
 * Decompiled with CFR 0.152.
 */
public final class FR {
    public final String a;
    public final int b;

    public FR(String string, int n) {
        this.a = string;
        this.b = n;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof FR)) {
            return false;
        }
        FR fR = (FR)object;
        return this.b == fR.b && this.a.equals(fR.a);
    }
}

