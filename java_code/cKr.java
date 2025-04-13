/*
 * Decompiled with CFR 0.152.
 */
class cKr
implements Runnable {
    private final cks_2 a;
    private final aej_2 b;
    private final int c;

    private cKr(cks_2 cks_22, aej_2 aej_22, int n) {
        this.a = cks_22;
        this.b = aej_22;
        this.c = n;
    }

    @Override
    public void run() {
        switch (this.b) {
            case g: {
                this.a.a(0.0f, -30.0f);
                break;
            }
            case c: {
                this.a.a(0.0f, 30.0f);
                break;
            }
            case e: {
                this.a.a(30.0f, 0.0f);
                break;
            }
            case a: {
                this.a.a(-30.0f, 0.0f);
            }
        }
    }

    public boolean a(fck_2 fck_22) {
        switch (this.b) {
            case g: {
                return fck_22.w() > this.c;
            }
            case c: {
                return fck_22.w() < this.c;
            }
            case e: {
                return fck_22.v() < this.c;
            }
            case a: {
                return fck_22.v() > this.c;
            }
        }
        return false;
    }
}

