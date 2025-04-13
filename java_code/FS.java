/*
 * Decompiled with CFR 0.152.
 */
public final class FS {
    public final int a;
    public final int b;

    public FS(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int hashCode() {
        return 31 * this.a + this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof FS)) {
            return false;
        }
        FS fS = (FS)object;
        return this.a == fS.a && this.b == fS.b;
    }
}

