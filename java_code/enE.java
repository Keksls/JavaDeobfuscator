/*
 * Decompiled with CFR 0.152.
 */
public class enE {
    public final int a;
    public final int b;
    public final short c;
    public final aej_2 d;

    public enE(int n, int n2, short s2, aej_2 aej_22) {
        this.a = n;
        this.b = n2;
        this.c = s2;
        this.d = aej_22;
    }

    enE(arf_1 arf_12) {
        this.a = arf_12.c();
        this.b = arf_12.c();
        this.c = arf_12.b();
        this.d = aej_2.a(arf_12.a());
    }

    void a(gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a(this.b);
        gk_02.a(this.c);
        gk_02.a((byte)this.d.l);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof enE)) {
            return false;
        }
        enE enE2 = (enE)object;
        if (this.a != enE2.a) {
            return false;
        }
        if (this.b != enE2.b) {
            return false;
        }
        if (this.c != enE2.c) {
            return false;
        }
        return this.d == enE2.d;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        n = 31 * n + this.c;
        n = 31 * n + (this.d != null ? this.d.hashCode() : 0);
        return n;
    }
}

