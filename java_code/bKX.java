/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public abstract class bKX
implements ajh_1,
exs_1 {
    public static final String f = "item";
    public static final String g = "price";
    public static final String h = "formattedPrice";
    public static final String i = "formattedTotalPrice";
    public static final String j = "totalQuantity";

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "item": {
                return this.h();
            }
            case "price": {
                return this.b();
            }
            case "formattedPrice": {
                return bae.h().a(this.b()) + " $";
            }
            case "formattedTotalPrice": {
                return bae.h().a(this.b() * (long)this.c()) + " $";
            }
            case "totalQuantity": {
                return this.c();
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return new String[]{f, h, i, g, j};
    }

    public abstract long a();

    public abstract long b();

    public abstract int c();
}

