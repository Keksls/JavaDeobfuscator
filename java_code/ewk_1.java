/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

/*
 * Renamed from eWk
 */
public class ewk_1 {
    private final EnumMap<ewl_1, ewr_2> a = new EnumMap(ewl_1.class);

    public void a(ewl_1 ewl_12) {
        if (this.a.containsKey((Object)ewl_12)) {
            throw new exd_2("Un inventaire de type " + ewl_12 + " est d\u00e9j\u00e0 pr\u00e9sent");
        }
        this.a.put(ewl_12, ewl_12.a());
    }

    public ewr_2 b(ewl_1 ewl_12) {
        ewr_2 ewr_22 = this.a.get((Object)ewl_12);
        if (ewr_22 == null) {
            throw new exd_2("inventaire de type " + ewl_12 + "inconnu");
        }
        return ewr_22;
    }

    public void a(vd_1 vd_12) {
        ewp_1 ewp_12 = (ewp_1)this.a.get((Object)ewl_1.a);
        ewq_2 ewq_22 = new ewq_2(ewp_12, vd_12.a, eyo_1.g());
        ewq_22.a();
    }

    public void b(vd_1 vd_12) {
        ewp_1 ewp_12 = (ewp_1)this.a.get((Object)ewl_1.a);
        ewq_2 ewq_22 = new ewq_2(ewp_12, vd_12.a, eyo_1.g());
        ewp_12.a(true);
        ewq_22.b();
        ewp_12.a(false);
    }

    public void a() {
        ewp_1 ewp_12 = (ewp_1)this.a.get((Object)ewl_1.a);
        ewp_12.a();
        ewu_1 ewu_12 = (ewu_1)this.a.get((Object)ewl_1.b);
        ewu_12.f();
    }

    public String toString() {
        return "InventoryHandler{m_inventories=" + this.a.size() + "}";
    }
}

