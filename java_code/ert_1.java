/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eRT
 */
public class ert_1
implements tv_0<exk_2, vf_2> {
    public static final ert_1 a = new ert_1();
    private final exu_1 b;
    private final eyn_1 c;

    private ert_1() {
        this.b = eyo_1.g();
        this.c = eyo_1.g();
    }

    ert_1(exu_1 exu_12, eyn_1 eyn_12) {
        this.b = exu_12;
        this.c = eyn_12;
    }

    @Override
    @Nullable
    public vf_2 a(gq_1<vf_2> gq_12) {
        vf_2 vf_22 = this.b();
        return gq_12.a(vf_22) ? vf_22 : null;
    }

    @Override
    @Nullable
    public exk_2 a(vf_2 vf_22) {
        exk_2 exk_22 = this.a();
        return exk_22.b(vf_22) ? exk_22 : null;
    }

    public exk_2 a() {
        return this.b.e();
    }

    public vf_2 b() {
        return this.c.f();
    }

    public String toString() {
        return "GuildStorageBoxContentProvider{m_itemProvider=" + this.b.getClass().getName() + ", m_rawItemProvider=" + this.c.getClass().getName() + "}";
    }
}

