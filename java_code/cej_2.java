/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cej
 */
public class cej_2
implements ajh_1 {
    public static final String a = "nameWithIdAndConnectionStatus";
    public static final String b = "accountId";
    public static final String d = "rank";
    private final nk_0 e;
    private final cek_2 f;

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "accountId": {
                return "Account: " + this.e.e();
            }
            case "nameWithIdAndConnectionStatus": {
                return this.e.g() + " (" + this.e.c() + ") " + daX.b(this.e.l());
            }
            case "rank": {
                return "Rank: " + this.f.a();
            }
        }
        return null;
    }

    public String a() {
        return this.e.g();
    }

    public cek_2 b() {
        return this.f;
    }

    public long c() {
        return this.e.c();
    }

    public long e() {
        return this.e.e();
    }

    @Override
    public String[] d() {
        return new String[]{b, a, d};
    }

    public cej_2(nk_0 nk_02, cek_2 cek_22) {
        this.e = nk_02;
        this.f = cek_22;
    }
}

