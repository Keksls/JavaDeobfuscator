/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLk
implements ajh_1 {
    public static final String a = "name";
    @NotNull
    private final faP b;

    public bLk(@NotNull faP faP2) {
        this.b = faP2;
    }

    @Override
    public String[] d() {
        return new String[]{a};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("market.history.timespan." + this.b.a(), new Object[0]);
        }
        return null;
    }

    public faP a() {
        return this.b;
    }
}

