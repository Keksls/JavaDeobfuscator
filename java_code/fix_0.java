/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fiX
 */
public class fix_0
implements tv_0<exk_2, vf_2> {
    public static final fix_0 a = new fix_0();
    private final exu_1 b = eyo_1.g();
    private final eyn_1 c = eyo_1.g();

    private fix_0() {
    }

    @Override
    @Nullable
    public exk_2 a(vf_2 vf_22) {
        exk_2 exk_22 = this.b.e();
        return exk_22.b(vf_22) ? exk_22 : null;
    }

    public String toString() {
        return "StorageBoxContentProvider{m_itemProvider=" + this.b.getClass().getName() + ", m_rawItemProvider=" + this.c.getClass().getName() + "}";
    }
}

