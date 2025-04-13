/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bKU
implements ajh_1 {
    private static final int b = 1;
    public static final String a = "name";
    @Nullable
    private final faJ d;

    public bKU(@Nullable faJ faJ2) {
        this.d = faJ2;
    }

    @Override
    public String[] d() {
        return new String[]{a};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.d == null) {
                return bae.h().a("market.history.element.type.all", new Object[0]);
            }
            return bae.h().a("market.history.element.type." + this.d.a(), 1);
        }
        return null;
    }

    @Nullable
    public faJ a() {
        return this.d;
    }
}

