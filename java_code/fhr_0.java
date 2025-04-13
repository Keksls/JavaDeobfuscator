/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fhR
 */
public enum fhr_0 implements aqk_2
{
    a(0, "Ressource Auto-respawn"),
    b(1, "Ressource r\u00e9serv\u00e9e aux Challenges"),
    c(2, "Ressource qu'il ne faut pas sauvegarder"),
    d(3, "Ressource non prisent en compte par les lois"),
    e(4, "Ressource r\u00e9serv\u00e9e aux Chaos");

    private final int f;
    private final String g;

    private fhr_0(int n2, String string2) {
        this.f = n2;
        this.g = string2;
    }

    @Nullable
    public static fhr_0 a(int n) {
        fhr_0[] fhr_0Array = fhr_0.values();
        for (int k = 0; k < fhr_0Array.length; ++k) {
            fhr_0 fhr_02 = fhr_0Array[k];
            if (fhr_02.f != n) continue;
            return fhr_02;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.f);
    }

    @Override
    public String e() {
        return this.g;
    }

    @Override
    public String f() {
        return null;
    }
}

