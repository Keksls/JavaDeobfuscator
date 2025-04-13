/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXN
 */
public final class axn_0
extends aXj {
    private final int a;

    public axn_0(int n) {
        this.a = n;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        cnV cnV2 = new cnV(this.a, azu_0.j().k().a_());
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(cnV2);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

