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
 * Renamed from bKz
 */
public class bkz_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "iconStyle";
    public static final String d = "minValue";
    @NotNull
    private final faI e;
    private int f = -1;

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.a();
            }
            case "iconStyle": {
                return this.b();
            }
            case "minValue": {
                if (this.f == -1) {
                    return null;
                }
                return this.f;
            }
        }
        return null;
    }

    public String a() {
        return bKA.a(this.e);
    }

    public String b() {
        return bKA.b(this.e);
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d};
    }

    @NotNull
    public faI c() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public void a(int n) {
        this.f = n;
    }

    public bkz_0(@NotNull faI faI2) {
        if (faI2 == null) {
            throw new NullPointerException("characteristic is marked non-null but is null");
        }
        this.e = faI2;
    }
}

