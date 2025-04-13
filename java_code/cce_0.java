/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCe
 */
public final class cce_0
implements adx_1<crc_0> {
    @Override
    public boolean a(crc_0 crc_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        eQb eQb2 = bmr_12.dE().a();
        epl_0 epl_02 = eQb2.e(crc_02.c());
        if (epl_02 == null) {
            return false;
        }
        String string = bae.h().a(62, (long)crc_02.b(), new Object[0]);
        String string2 = crc_02.d() ? bae.h().a("chat.notify.questShareAccepted", epl_02.a(), string) : bae.h().a("chat.notify.questShareRefused", epl_02.a(), string);
        aul_0.a().c(string2);
        return false;
    }

    @Override
    public int a() {
        return 12699;
    }
}

