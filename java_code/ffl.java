/*
 * Decompiled with CFR 0.152.
 */
public class ffl {
    private ffp a;
    private byte b;

    ffl() {
    }

    public ffl(ffp ffp2) {
        this.a = ffp2;
    }

    public ffp a() {
        return this.a;
    }

    public boolean a(ffk ffk2) {
        return (this.b & ffk2.j) == ffk2.j;
    }

    public void b(ffk ffk2) {
        this.b = (byte)(this.b | ffk2.j);
    }

    public void c(ffk ffk2) {
        this.b = (byte)(this.b & ~ffk2.j);
    }

    public void a(ub_1 ub_12) {
        ub_12.a = this.a.c;
        ub_12.b = this.b;
    }

    public void b(ub_1 ub_12) {
        this.a = ffp.a(ub_12.a);
        this.b = ub_12.b;
    }
}

