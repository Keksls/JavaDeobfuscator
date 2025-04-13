/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apt
 */
public class apt_1
extends apo_2 {
    private Boolean d;

    public apt_1(String string) {
        super(string);
    }

    public Boolean c(Object object, Object object2) {
        if (object.getClass() != object2.getClass()) {
            throw new aoh_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        this.d = object.equals(object2);
        return this.d;
    }

    @Override
    public apy_1 b(Object object, Object object2) {
        if (this.c(object, object2).booleanValue()) {
            return new api_1("<automatically built after simplification>");
        }
        return new apu_1("<automatically built after simplification>");
    }

    public Boolean f() {
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

