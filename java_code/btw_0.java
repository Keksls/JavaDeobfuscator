/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTw
 */
public class btw_0
implements ajh_1 {
    private static final String b = "kamasPrice";
    private static final String d = "ogrinesQuantity";
    static final btw_0 a = new btw_0();

    @Override
    public String[] d() {
        return new String[]{b, d};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return "-";
        }
        if (string.equals(d)) {
            return "-";
        }
        return null;
    }
}

