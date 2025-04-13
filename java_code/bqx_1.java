/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Optional;

/*
 * Renamed from bQx
 */
public class bqx_1
extends bqv_1 {
    private int a = 0;

    public void a(int n) {
        this.a = n;
    }

    public int f() {
        return this.a;
    }

    @Override
    protected void b() {
        if (this.a != 0) {
            this.a((ezr_0)eyo_1.g().d(this.a), true);
        }
        super.b();
    }

    @Override
    public void a(bmr_1 bmr_12, eyz_0 eyz_02, exh_2 ... exh_2Array) {
        this.E = Arrays.asList(exh_2Array);
        this.B.clear();
        this.D = bmr_12;
        bnh_1 bnh_12 = new bnh_1();
        bnh_12.g(false);
        this.C = new biI(bnh_12);
        this.C.a((abu)this.D.bv());
        for (exh_2 exh_22 : exh_2.values()) {
            if (this.E.contains(exh_22)) continue;
            Optional<exk_2> optional = eZi.a(bmr_12, eyz_02, exh_22);
            optional.ifPresentOrElse(exk_22 -> this.c((exk_2)exk_22, exh_22.a()), () -> this.a(exh_22.a()));
        }
        this.b();
        fis_1.a().a((ajf_1)this, F);
    }

    @Override
    protected void a(exk_2 exk_22, byte by, exh_2 exh_22) {
        if (this.b(exh_22)) {
            return;
        }
        super.a(exk_22, by, exh_22);
    }

    private boolean b(exh_2 exh_22) {
        Optional<ft_1> optional = bol_1.a(exh_22);
        if (optional.isEmpty()) {
            return true;
        }
        fk_2 fk_22 = bol_1.a(this.D.R(), this.D.a_(), optional.get());
        return fk_22 != ebm_0.b;
    }

    @Override
    protected void a(byte by, exh_2 exh_22, exk_2 exk_22) {
        if (this.b(exh_22)) {
            return;
        }
        super.a(by, exh_22, exk_22);
    }
}

