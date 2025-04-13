/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

class eDv
implements Sm<efh_0> {
    private final exk_2 a;

    eDv(exk_2 exk_22) {
        this.a = exk_22;
    }

    @Override
    public int G_() {
        return 0;
    }

    @Override
    public long aS_() {
        return 0L;
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return new edd_0(this.a.H());
    }

    public String toString() {
        return "ItemAllEffectsIterator{m_item=" + this.a + "}";
    }
}

