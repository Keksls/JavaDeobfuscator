/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXy
 */
public final class axy_0
extends aXj {
    private final long a;
    private final String b;

    public axy_0(long l, String string) {
        this.a = l;
        this.b = string;
    }

    @Override
    public boolean a() {
        return this.b != null && this.a != 0L;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)298);
            pt.a(this.a);
            pt.a(this.b);
            aaw_22.c(pt);
        }
        catch (Exception exception) {
            aVo.a().d("Error trying to play animation : " + exception);
        }
    }
}

