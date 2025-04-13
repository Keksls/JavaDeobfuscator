/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzX
 */
final class bzx_2 {
    final bzy_1 a;
    final bpl_0 b;
    final bpr_0 c;
    @Nullable
    fiO d;

    public bzx_2(bzy_1 bzy_12, bpl_0 bpl_02, bpr_0 bpr_02) {
        this.a = bzy_12;
        this.b = bpl_02;
        this.c = bpr_02;
    }

    public String toString() {
        return "SpellDeckModifications.Modification(m_type=" + this.a + ", m_spell=" + this.b + ", m_slot=" + this.c + ", m_fullDeck=" + this.d + ")";
    }
}

