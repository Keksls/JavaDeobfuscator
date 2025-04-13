/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class eZi {
    private eZi() {
    }

    public static Optional<exk_2> a(epq_2 epq_22, exh_2 exh_22) {
        return eZi.a(epq_22, epq_22.cG(), exh_22);
    }

    public static Optional<exk_2> a(epq_2 epq_22, eyz_0 eyz_02, exh_2 exh_22) {
        eyt_0 eyt_02 = epq_22.dC();
        return eZi.a(eyz_02, exh_22, eyt_02);
    }

    public static Optional<exk_2> a(eyz_0 eyz_02, exh_2 exh_22, eyt_0 eyt_02) {
        Long l = eyz_02.a(exh_22);
        if (eyt_02 == null) {
            return Optional.empty();
        }
        return eyt_02.b(l);
    }
}

