/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLh
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "icon";
    public static final String d = "shardStyle";
    @NotNull
    private final faL e;
    private final String f;
    private final String g;

    public bLh(@NotNull faL faL2) {
        this.e = faL2;
        this.f = bib_0.a(faL2, false);
        this.g = bLh.a(faL2);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.g;
            }
            case "icon": 
            case "shardStyle": {
                return this.f;
            }
        }
        return null;
    }

    public static String a(faL faL2) {
        return bae.h().a("market.slot.color." + faL2.a(), new Object[0]);
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d};
    }

    @NotNull
    public faL a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public bLh(@NotNull faL faL2, String string, String string2) {
        if (faL2 == null) {
            throw new NullPointerException("slotColor is marked non-null but is null");
        }
        this.e = faL2;
        this.f = string;
        this.g = string2;
    }
}

