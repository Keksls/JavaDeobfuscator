/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ceb
 */
class ceb_2
implements ajh_1 {
    private final String e;
    private final List<String> f;
    public static final String a = "fontDefinitionName";
    public static final String b = "fonts";
    private final String[] g = new String[]{"fonts", "fontDefinitionName"};
    final /* synthetic */ cdz_1 d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public ceb_2(cdz_1 cdz_12, String string, List list) {
        this.d = cdz_12;
        this.e = string;
        this.f = list;
    }

    @Override
    public String[] d() {
        return this.g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e;
        }
        if (b.equals(string)) {
            return this.f;
        }
        return null;
    }

    public String a() {
        return this.e;
    }
}

