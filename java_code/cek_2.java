/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cek
 */
public class cek_2
implements ajh_1 {
    public static final String a = "nameWithPosition";
    private final no_0 b;

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "nameWithPosition": {
                return this.c();
            }
        }
        return null;
    }

    String c() {
        return this.b.h() + 1 + ". " + this.b.e();
    }

    public String a() {
        return this.b.e();
    }

    public int b() {
        return this.b.h();
    }

    @Override
    public String[] d() {
        return new String[]{a};
    }

    public cek_2(no_0 no_02) {
        this.b = no_02;
    }
}

