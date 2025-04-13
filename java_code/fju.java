/*
 * Decompiled with CFR 0.152.
 */
public abstract class fju {
    protected long a;

    public void c(epq_2 epq_22, TG tG, long l) {
        fjp_0 fjp_02 = this.a(epq_22, tG, l);
        if (fjp_02 != fjp_0.a) {
            this.a(fjp_02);
            return;
        }
        this.a = tG.a_();
        this.b(epq_22, tG, l);
    }

    public abstract void a(TG var1, epq_2 var2);

    public abstract void b(TG var1, epq_2 var2);

    public abstract fjp_0 a(epq_2 var1, TG var2, long var3);

    protected abstract void b(epq_2 var1, TG var2, long var3);

    protected abstract void a(fjp_0 var1);

    public abstract fjv a();

    public String toString() {
        return "TravelProvider{" + this.getClass().getSimpleName() + ", TravelType:" + this.a() + "}";
    }
}

