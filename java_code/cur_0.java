/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUR
 */
public abstract class cur_0
implements ahr_1,
afb_0 {
    protected esl_1 a;

    public void a(esl_1 esl_12) {
        this.a = esl_12;
        bua_2.a.a(esl_12);
    }

    public esl_1 a() {
        return this.a;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().e("wakfu.havenWorld");
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a("wakfu.havenWorld", cHn.class);
        }
    }

    public abstract ese_1 c();
}

