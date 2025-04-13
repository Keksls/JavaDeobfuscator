/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public enum eCP implements aqk_2
{
    a(0, "Recette secr\u00e8te"),
    b(1, "Execute les actions sur l'item produit");

    private final int c;
    private final String d;

    private eCP(int n2, String string2) {
        this.c = n2;
        this.d = string2;
    }

    @Nullable
    public static eCP a(int n) {
        eCP[] eCPArray = eCP.values();
        for (int k = 0; k < eCPArray.length; ++k) {
            eCP eCP2 = eCPArray[k];
            if (eCP2.c != n) continue;
            return eCP2;
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

