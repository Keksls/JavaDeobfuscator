/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCF
 */
public class acf_2
extends aca_2 {
    public acf_2(int n) {
        super(n);
    }

    public acf_2() {
        super(10);
    }

    public void d(long l) {
        this.a();
        int n = this.b(l);
        if (n >= 0) {
            this.a[n] = l;
            ++this.b;
        }
    }

    public boolean e(long l) {
        if (this.b == 0) {
            return false;
        }
        int n = this.a(l);
        if (n < 0) {
            return false;
        }
        return this.c(n);
    }

    public boolean c(int n) {
        this.a[n] = this.a[this.b - 1];
        --this.b;
        return true;
    }
}

