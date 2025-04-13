/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccy
 */
public class ccy_1
extends ccx_1 {
    @Override
    protected long a() {
        esm_2 esm_22 = this.b();
        if (esm_22 == null) {
            return 0L;
        }
        return esm_22.c();
    }

    protected esm_2 b() {
        if (!cci_2.a.g()) {
            a.error((Object)"Doit \u00eatre plac\u00e9 dans un havre monde!!!");
            return null;
        }
        return cci_2.a.d();
    }
}

