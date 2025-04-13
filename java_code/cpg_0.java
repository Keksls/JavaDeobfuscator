/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cpg
 */
public class cpg_0
extends Pw {
    private final boolean a;
    @Nullable
    private final mm_0 b;

    public cpg_0() {
        this.a = true;
        this.b = null;
    }

    public cpg_0(@NotNull mm_0 mm_02) {
        this.a = false;
        this.b = mm_02;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(1 + (this.a ? 0 : 4 + this.b.getSerializedSize()));
        abx_22.a(this.a);
        if (!this.a) {
            abx_22.a(this.b.getSerializedSize());
            abx_22.b(this.b.toByteArray());
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13951;
    }
}

