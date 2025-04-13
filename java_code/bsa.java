/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class bsa {
    @NotNull
    private final String a;
    @NotNull
    private final xz_0 b;
    @NotNull
    private final List<Ow> c;
    private final short d;
    @NotNull
    private final dw_1 e;
    private final boolean f;
    private final boolean g;

    public final String a(bvs_0 bvs_02) {
        return bvs_0.a(bvs_02, this.a(), this.b(), this.c());
    }

    @NotNull
    public String a() {
        return this.a;
    }

    @NotNull
    public xz_0 b() {
        return this.b;
    }

    @NotNull
    public List<Ow> c() {
        return this.c;
    }

    public short d() {
        return this.d;
    }

    @NotNull
    public dw_1 e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public bsa(@NotNull String string, @NotNull xz_0 xz_02, @NotNull List<Ow> list, short s2, @NotNull dw_1 dw_12, boolean bl, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (xz_02 == null) {
            throw new NullPointerException("accountCommunity is marked non-null but is null");
        }
        if (list == null) {
            throw new NullPointerException("languages is marked non-null but is null");
        }
        if (dw_12 == null) {
            throw new NullPointerException("fees is marked non-null but is null");
        }
        this.a = string;
        this.b = xz_02;
        this.c = list;
        this.d = s2;
        this.e = dw_12;
        this.f = bl;
        this.g = bl2;
    }
}

