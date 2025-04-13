/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bON
 */
class bon_0
implements ero_2 {
    private final long a;

    public bon_0(long l) {
        this.a = l;
    }

    @Override
    @Nullable
    public eqy_1 a(short s2) {
        bpb_1 bpb_12 = bpc_1.a().a(s2);
        if (bpb_12 == null) {
            return null;
        }
        short s3 = bpb_12.v();
        bop_0 bop_02 = new bop_0(s2, bpb_12.f(), bpb_12.A().a(eps_0.b, (int)s3), s3, this.a);
        bop_02.a(bpb_12);
        return bop_02;
    }
}

