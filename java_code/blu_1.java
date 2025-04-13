/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blU
 */
public enum blu_1 implements ajh_1
{
    a(0),
    b(1),
    d(2);

    private static final String e = "name";
    private static final String f = "description";
    private final int g;

    private blu_1(int n2) {
        this.g = n2;
    }

    public static blu_1 a(int n) {
        for (blu_1 blu_12 : blu_1.values()) {
            if (blu_12.g != n) continue;
            return blu_12;
        }
        return a;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string == null) {
            return null;
        }
        switch (string) {
            case "name": {
                return bae.h().a("autorun.mode." + this.g, new Object[0]);
            }
            case "description": {
                return bae.h().a("autorun.mode.desc." + this.g, new Object[0]);
            }
        }
        return null;
    }

    public int a() {
        return this.g;
    }
}

