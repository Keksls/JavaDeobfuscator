/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

class eDw
implements Sm<efh_0> {
    private final ezr_0<?> a;

    eDw(ezr_0<?> ezr_02) {
        this.a = ezr_02;
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
        return this.a.u();
    }
}

