/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bJK
 */
final class bjk_1
implements eZa {
    private final bqv_1 a;

    bjk_1(bqv_1 bqv_12) {
        this.a = bqv_12;
    }

    @Override
    public void a(exh_2 exh_22, Long l) {
        Optional<exk_2> optional = this.a.c().dC().b(l);
        optional.ifPresent(exk_22 -> this.a.a((exk_2)exk_22, exh_22.a()));
    }

    @Override
    public void b(exh_2 exh_22, Long l) {
        this.a.b(exh_22.a());
    }

    @Override
    public void a(eyz_0 eyz_02) {
    }
}

