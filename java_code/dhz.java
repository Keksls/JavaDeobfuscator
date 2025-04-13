/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dhz
extends dfc {
    @NotNull
    private final bpl_0 a;
    @Nullable
    private final bpr_0 b;

    public dhz(@NotNull bpl_0 bpl_02, @Nullable bpr_0 bpr_02) {
        this.a = bpl_02;
        this.b = bpr_02;
    }

    @NotNull
    public bpl_0 k() {
        return this.a;
    }

    @Nullable
    public bpr_0 o() {
        return this.b;
    }

    @Override
    public int a() {
        return 16922;
    }
}

