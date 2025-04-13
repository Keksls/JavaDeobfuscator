/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apA
 */
public class apa_1
extends apo_2 {
    private Long d;

    public apa_1(String string) {
        super(string);
    }

    public Long c(Object object, Object object2) {
        if (!(object instanceof Long) || !(object2 instanceof Long)) {
            throw new aoh_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        long l = (Long)object - (Long)object2;
        this.d = l;
        return l;
    }

    @Override
    public apy_1 b(Object object, Object object2) {
        return new ape_1("<automatically built after simplification>", this.c(object, object2));
    }

    public Long f() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object a(Object object, Object object2) {
        return this.c(object, object2);
    }

    @Override
    public /* synthetic */ Object u_() {
        return this.f();
    }
}

