/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJZ
 */
public class bjz_2
extends ezx_0 {
    private final long a;

    public bjz_2(fac_0 fac_02) {
        super(fac_02);
        this.a = fac_02.x().b();
    }

    public void a() {
        this.a(this.a);
    }

    public void a(short s2) {
        if (!this.b().w()) {
            return;
        }
        ezv_0 ezv_02 = this.b().x();
        this.a(ezv_02.f().a((int)s2));
    }

    @Override
    public void a(long l) {
        super.a(l);
        exk_2 exk_22 = (exk_2)this.b();
        exk_22.P();
        fis_1.a().a((ajf_1)((Object)this.b()), "ap", "level", "effect", "effectAndCaracteristic", "caracteristic", "criticalEffectDetails");
    }
}

