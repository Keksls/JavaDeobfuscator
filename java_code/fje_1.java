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
 * Renamed from fJe
 */
public class fje_1
implements ajh_1,
Comparable {
    private static final String a = "displayName";
    private static final String b = "hasDescription";
    private static final String d = "themeDescription";
    private static final String[] e = new String[]{"displayName", "hasDescription", "themeDescription"};
    private final String f;
    private final String g;
    private final String h;

    public fje_1(String string, String string2) {
        this(string, string2, null);
    }

    public fje_1(String string, String string2, String string3) {
        this.f = string;
        this.g = string2;
        this.h = string3 == null ? null : string3.trim();
    }

    public String a() {
        return this.f;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "displayName": {
                return this.g;
            }
            case "hasDescription": {
                return this.h != null && !this.h.isEmpty();
            }
            case "themeDescription": {
                return this.h;
            }
        }
        return null;
    }

    public boolean equals(Object object) {
        if (!(object instanceof fje_1)) {
            return false;
        }
        if (this.f == null) {
            return ((fje_1)object).f == null;
        }
        return this.f.equals(((fje_1)object).f);
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    public int compareTo(@NotNull Object object) {
        if (!(object instanceof fje_1)) {
            return 0;
        }
        fje_1 fje_12 = (fje_1)object;
        if (this.f == null) {
            return -1;
        }
        if (fje_12.f == null) {
            return 1;
        }
        if (this.g == null || fje_12.g == null) {
            return 0;
        }
        return this.g.compareTo(fje_12.g);
    }
}

