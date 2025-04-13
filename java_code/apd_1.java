/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apD
 */
public class apd_1
extends apn_2 {
    private Boolean d;

    public apd_1(String string) {
        super(string);
    }

    public Boolean c(Object object) {
        if (!(object instanceof Boolean)) {
            throw new aoh_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        this.d = (Boolean)object == false;
        return this.d;
    }

    @Override
    public apy_1 b(Object object) {
        boolean bl = this.c(object);
        if (bl) {
            return new api_1("<automatically built after simplification>");
        }
        return new apu_1("<automatically built after simplification>");
    }

    public Boolean f() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.c(object);
    }

    @Override
    public /* synthetic */ Object u_() {
        return this.f();
    }
}

