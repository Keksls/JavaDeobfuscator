/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Iterator;

/*
 * Renamed from eOv
 */
final class eov_2
implements efi_0 {
    final efh_0 a;
    final long b;

    eov_2(long l, efh_0 efh_02) {
        this.a = efh_02;
        this.b = l;
    }

    @Override
    public short c() {
        return 0;
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

    @Override
    public int G_() {
        return 21;
    }

    @Override
    public long aS_() {
        return this.b;
    }

    @Override
    public Iterator<efh_0> iterator() {
        return Collections.singleton(this.a).iterator();
    }

    public efh_0 a() {
        return this.a;
    }
}

