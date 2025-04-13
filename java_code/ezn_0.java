/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eZN
 */
public class ezn_0
extends ug_0<exk_2> {
    private final ezp_0 b = new ezp_0();
    private final epq_2 c;

    public ezn_0(epq_2 epq_22) {
        this.c = epq_22;
    }

    @Override
    protected void a(exk_2 exk_22) {
        super.a(exk_22);
        exg_2 exg_22 = euu_2.m(this.c.U_(), exk_22.a());
        try {
            this.b.a(exk_22, exg_22.f(), exg_22.a(exk_22.a()));
        }
        catch (ezo_0 ezo_02) {
            a.error((Object)("Probl\u00e8me d'inventaire \u00e0 l'ajout de l'item " + exk_22), (Throwable)ezo_02);
        }
    }

    @Override
    protected void b(exk_2 exk_22) {
        super.b(exk_22);
        this.b.a(exk_22.a());
    }

    @Override
    protected void a(exk_2 exk_22, short s2) {
        super.a(exk_22, s2);
        try {
            this.b.a(exk_22.a(), exk_22.e());
        }
        catch (ezo_0 ezo_02) {
            a.error((Object)("Probl\u00e8me d'inventaire \u00e0 la mise a jour de l'item " + exk_22), (Throwable)ezo_02);
        }
    }

    public ezp_0 a() {
        return this.b;
    }

    public void b() {
        this.b.b();
    }

    public String toString() {
        return "BagOperationVisitor{calculator=" + this.b + ", m_owner=" + this.c + "}";
    }
}

