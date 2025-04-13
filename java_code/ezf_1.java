/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ezf
 */
public final class ezf_1
implements efi_0 {
    private final ezv_2 a;
    private final short b;

    public ezf_1(@NotNull ezv_2 ezv_22, short s2) {
        this.a = ezv_22;
        this.b = s2;
    }

    public ezv_2 a() {
        return this.a;
    }

    @Override
    public long aS_() {
        return eFm.a(this.a.c(), this.b);
    }

    @Override
    public short c() {
        return this.b;
    }

    @Override
    public int G_() {
        return 36;
    }

    @Override
    public Iterator<efh_0> iterator() {
        efh_0 efh_02 = (efh_0)ezg_2.a.a(this.a.c());
        if (efh_02 == null) {
            return Collections.emptyList().iterator();
        }
        return Collections.singleton(efh_02).iterator();
    }

    @Override
    public short be_() {
        return 0;
    }

    @Override
    public short z_() {
        return 0;
    }

    @Override
    public short A_() {
        return 0;
    }

    public String toString() {
        return "AptitudeBonusEffectContainer{m_bonusModel=" + this.a + ", m_level=" + this.b + "}";
    }
}

