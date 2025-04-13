/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bag
 */
public class bag_2
implements ajh_1 {
    public static final String a = "text";
    public static final String b = "iconUrl";
    final Ow d;

    bag_2(Ow ow) {
        this.d = ow;
    }

    @Override
    @Nullable
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return bae.c(this.d);
        }
        if (string.equals(a)) {
            return this.d.b().getLanguage().toUpperCase();
        }
        return null;
    }

    public Ow a() {
        return this.d;
    }

    public String toString() {
        return "LanguageView{m_language=" + this.d + "}";
    }
}

