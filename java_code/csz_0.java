/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cSz
 */
public class csz_0
implements ajh_1 {
    private String b;
    public static final String a = "text";

    public csz_0(@NotNull String string) {
        this.b = string;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return bae.h().a(this.b, new Object[0]);
        }
        return null;
    }

    public String toString() {
        return "DisplayButtonView{m_tradKey='" + this.b + "'}";
    }

    public void a(String string) {
        this.b = string;
    }
}

