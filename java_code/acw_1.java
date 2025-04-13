/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCw
 */
public class acw_1
extends acq_2 {
    public acw_1(int n) {
        super(n);
    }

    public acw_1() {
        super(10);
    }

    public void f(int n) {
        this.a();
        int n2 = this.c(n);
        if (n2 >= 0) {
            ++this.b;
            this.a[n2] = n;
        }
    }

    public boolean g(int n) {
        if (this.b == 0) {
            return false;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return false;
        }
        this.a[n2] = this.a[this.b - 1];
        --this.b;
        return true;
    }
}

