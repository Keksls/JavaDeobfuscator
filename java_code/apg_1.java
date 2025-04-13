/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apG
 */
public class apg_1
extends apo_2 {
    private Object d;

    public apg_1(String string) {
        super(string);
    }

    @Override
    public Object a(Object object, Object object2) {
        if (object instanceof Long && object2 instanceof Long) {
            long l = (Long)object + (Long)object2;
            this.d = l;
            return l;
        }
        if (object instanceof String && object2 instanceof String) {
            this.d = String.valueOf(object) + object2;
            return this.d;
        }
        throw new aoh_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
    }

    @Override
    public apy_1 b(Object object, Object object2) {
        Object object3 = this.a(object, object2);
        if (object3 instanceof Long) {
            return new ape_1("<automatically built after simplification>", (Long)object3);
        }
        return new aph_1((String)object3, false);
    }

    @Override
    public Object u_() {
        return this.d;
    }
}

