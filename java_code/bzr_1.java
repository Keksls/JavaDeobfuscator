/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzR
 */
public final class bzr_1 {
    final bzs_2 a;
    final exk_2 b;
    final exk_2 c;
    final exh_2 d;

    public bzs_2 a() {
        return this.a;
    }

    public exk_2 b() {
        return this.b;
    }

    public exk_2 c() {
        return this.c;
    }

    public exh_2 d() {
        return this.d;
    }

    public bzr_1(bzs_2 bzs_22, exk_2 exk_22, exk_2 exk_23, exh_2 exh_22) {
        this.a = bzs_22;
        this.b = exk_22;
        this.c = exk_23;
        this.d = exh_22;
    }

    public String toString() {
        return "EquipmentModifications.Modification(m_type=" + this.a() + ", m_removedItem=" + this.b() + ", m_addedItem=" + this.c() + ", m_position=" + this.d() + ")";
    }
}

