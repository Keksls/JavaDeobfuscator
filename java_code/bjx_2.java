/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJx
 */
public class bjx_2
implements ajh_1,
bhx_1,
eAM,
Comparable<bjx_2> {
    private static final Logger e = Logger.getLogger(bjx_2.class);
    public static final String a = "noCostumes";
    public static final String b = "cosmeticItem";
    public static final String d = "isActive";
    @Nullable
    private final bjw_1 f;
    private final int g;
    private final ft_1 h;
    private boolean i = false;

    public bjx_2(ft_1 ft_12, int n) {
        this.h = ft_12;
        this.g = n;
        this.f = (bjw_1)eyo_1.g().d(n);
    }

    @Override
    @Nullable
    public bjw_1 a() {
        return this.f;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "noCostumes": {
                return this.f == null;
            }
            case "cosmeticItem": {
                return this.f;
            }
            case "isActive": {
                return this.i;
            }
            case "isQuestItem": {
                return false;
            }
            case "isRefItem": {
                return true;
            }
            case "backgroundStyle": {
                return this.i ? bhx_0.b.a() : bhx_0.d.a();
            }
            case "themeItemBorderUrl": {
                return this.i ? exw_1.g.h() : exw_1.a.h();
            }
            case "clickDescription": {
                return null;
            }
        }
        if (this.f == null) {
            return null;
        }
        return this.f.b(string);
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public boolean b() {
        return this.i;
    }

    public int a(@NotNull bjx_2 bjx_22) {
        if (bjx_22 == this || this.f == bjx_22.a()) {
            return 0;
        }
        if (this.f == null) {
            return -1;
        }
        if (bjx_22.a() == null) {
            return 1;
        }
        return this.f.e().compareTo(bjx_22.a().e());
    }

    public int c() {
        return this.g;
    }

    public ft_1 e() {
        return this.h;
    }

    @Override
    public eAN p() {
        return eAN.d;
    }

    @Override
    public Object q() {
        return this.g;
    }

    @Override
    public String r() {
        return this.f.e();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bjx_2)object);
    }
}

