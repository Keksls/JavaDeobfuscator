/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from fll
 */
public final class fll_0
implements efi_0 {
    protected static final Logger a = Logger.getLogger(fll_0.class);
    private final int b;
    private final long c;
    private final apc_2 d;
    private final ArrayList<efh_0> e = new ArrayList();

    public fll_0(int n, long l, apc_2 apc_22) {
        this.b = n;
        this.c = l;
        this.d = apc_22;
    }

    @Override
    public final int G_() {
        return 18;
    }

    @Override
    public final long aS_() {
        return this.b;
    }

    public final int a() {
        return this.b;
    }

    public final long g() {
        return this.c;
    }

    public final boolean h() {
        return this.c <= 0L;
    }

    public final apc_2 i() {
        return this.d;
    }

    public final void a(efh_0 efh_02) {
        this.e.add(efh_02);
    }

    @Override
    public final Iterator<efh_0> iterator() {
        return this.e.iterator();
    }

    @Override
    public final short c() {
        return 0;
    }

    @Override
    public final short be_() {
        return 0;
    }

    @Override
    public final short z_() {
        return 0;
    }

    @Override
    public final short A_() {
        return 0;
    }
}

