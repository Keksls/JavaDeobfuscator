/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eCp
 */
public enum ecp_0 implements aqk_2
{
    a(0, "Recette secr\u00e8te"),
    b(1, "Execute les actions sur l'item produit");

    private final int c;
    private final String d;

    private ecp_0(int n2, String string2) {
        this.c = n2;
        this.d = string2;
    }

    @Nullable
    public static ecp_0 a(int n) {
        ecp_0[] ecp_0Array = ecp_0.values();
        for (int k = 0; k < ecp_0Array.length; ++k) {
            ecp_0 ecp_02 = ecp_0Array[k];
            if (ecp_02.c != n) continue;
            return ecp_02;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.c);
    }

    @Override
    public String e() {
        return this.d;
    }

    @Override
    public String f() {
        return null;
    }
}

