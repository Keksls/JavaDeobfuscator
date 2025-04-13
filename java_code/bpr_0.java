/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPr
 */
public class bpr_0
implements ajh_1 {
    public static final String a = "spell";
    public static final String b = "isLocked";
    public static final String d = "isSelected";
    public static final String e = "lockText";
    public static final String[] f = new String[]{"spell", "isLocked", "isSelected", "lockText"};
    private final byte g;
    private final int h;
    private final boolean i;
    private boolean j;
    private bpl_0 k;

    public bpr_0(byte by, int n, boolean bl) {
        this.g = by;
        this.h = n;
        this.i = bl;
    }

    public bpr_0(byte by, bpl_0 bpl_02, int n, boolean bl) {
        this.g = by;
        this.k = bpl_02;
        this.h = n;
        this.i = bl;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.k;
        }
        if (string.equals(b)) {
            return this.a();
        }
        if (string.equals(e)) {
            return bae.h().a("levelShort.custom", this.h);
        }
        if (string.equals(d)) {
            return this.j;
        }
        return null;
    }

    public boolean a() {
        if (cZI.E() != null) {
            return false;
        }
        bmr_1 bmr_12 = cZI.D();
        if (bmr_12 == null) {
            bmr_12 = azu_0.j().k();
        }
        if (bmr_12 != null) {
            fiO fiO2 = bmr_12.dz();
            if (fiO2 == null || fiO2.b() < 0) {
                return this.h > bmr_12.dt();
            }
            return this.h > fiO2.b();
        }
        return true;
    }

    public void a(bpl_0 bpl_02) {
        this.k = bpl_02;
        fis_1.a().a((ajf_1)this, a);
    }

    public bpl_0 b() {
        return this.k;
    }

    public byte c() {
        return this.g;
    }

    public boolean e() {
        return this.i;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public boolean b(@NotNull bpl_0 bpl_02) {
        if (this.k == null) {
            return false;
        }
        return this.k.w() == bpl_02.w();
    }

    public String toString() {
        return "SpellSlotView{m_slotIndex=" + this.g + ", m_isPassive=" + this.i + ", m_spell=" + (Serializable)(this.k == null ? "null" : Integer.valueOf(this.k.w())) + "}";
    }
}

