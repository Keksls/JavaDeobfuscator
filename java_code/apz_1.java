/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apz
 */
public class apz_1
extends apn_2 {
    private Long d;

    public apz_1(String string) {
        super(string);
    }

    public Long c(Object object) {
        if (!(object instanceof Long)) {
            throw new aoh_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        this.d = -((Long)object).longValue();
        return this.d;
    }

    @Override
    public apy_1 b(Object object) {
        return new ape_1("<automatically built after simplification>", this.c(object));
    }

    @Override
    public Object u_() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.c(object);
    }
}

