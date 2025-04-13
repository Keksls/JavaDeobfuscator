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
 * Renamed from eFk
 */
class efk_0
implements efi_0 {
    private final long a;
    private final efh_0 b;
    private final int c;
    short d = 0;
    short e = 0;
    short f = 0;
    short g = 0;

    efk_0(long l, int n, efh_0 efh_02) {
        this.a = l;
        this.c = n;
        this.b = efh_02;
    }

    @Override
    public short c() {
        return this.d;
    }

    @Override
    public short be_() {
        return this.e;
    }

    @Override
    public short z_() {
        return this.f;
    }

    @Override
    public short A_() {
        return this.g;
    }

    @Override
    public int G_() {
        return this.c;
    }

    @Override
    public long aS_() {
        return this.a;
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return Collections.singleton(this.b).iterator();
    }
}

