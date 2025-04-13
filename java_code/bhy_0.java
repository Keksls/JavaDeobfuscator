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
 * Renamed from bHY
 */
public class bhy_0
implements ajh_1 {
    public static final String a = "referenceItem";
    public static final String b = "quantity";
    public static final String[] d = new String[]{"referenceItem", "quantity"};
    @NotNull
    public bjw_1 e;
    public long f;

    public bhy_0(@NotNull bjw_1 bjw_12, long l) {
        this.e = bjw_12;
        this.f = l;
    }

    @NotNull
    public bjw_1 a() {
        return this.e;
    }

    public long b() {
        return this.f;
    }

    @Override
    public String[] d() {
        String[] stringArray = new String[d.length + bht_1.az.length];
        System.arraycopy(d, 0, stringArray, 0, d.length);
        System.arraycopy(bht_1.az, 0, stringArray, d.length, bht_1.az.length);
        return stringArray;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "referenceItem": {
                return this.e;
            }
            case "quantity": {
                return this.f;
            }
            case "name": {
                Object object = this.e.b().b(string);
                if (this.f > 1L && object != null) {
                    return String.format("%s x %d", object, this.b());
                }
                return object;
            }
        }
        return this.e.b().b(string);
    }
}

