/*
 * Decompiled with CFR 0.152.
 */
public class ffm {
    private long a;
    private String b;
    private byte c;

    ffm() {
    }

    public ffm(long l, String string) {
        this.a = l;
        this.b = string;
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean a(ffk ffk2) {
        return (this.c & ffk2.j) == ffk2.j;
    }

    public void b(ffk ffk2) {
        this.c = (byte)(this.c | ffk2.j);
    }

    public void c(ffk ffk2) {
        this.c = (byte)(this.c & ~ffk2.j);
    }

    public void a(uc_1 uc_12) {
        uc_12.a = this.a;
        uc_12.b = this.b;
        uc_12.c = this.c;
    }

    public void b(uc_1 uc_12) {
        this.a = uc_12.a;
        this.b = uc_12.b;
        this.c = uc_12.c;
    }
}

