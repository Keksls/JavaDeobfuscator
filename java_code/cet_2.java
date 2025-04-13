/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cet
 */
public class cet_2
implements ajh_1 {
    public static final String a = "type";
    public static final String b = "id";
    public static final String d = "sanctionText";
    private final eol_0 e;

    public cet_2(eol_0 eol_02) {
        this.e = eol_02;
    }

    @Override
    public String[] d() {
        return ArrayUtils.EMPTY_STRING_ARRAY;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e.d();
        }
        if (d.equals(string)) {
            return bae.h().a(String.format("moderationPanel.sanction%d", this.e.c()), new Object[0]);
        }
        if (b.equals(string)) {
            return this.e.a();
        }
        return null;
    }
}

