/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkw
 */
public class bkw_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "remainingPoints";
    public static final String d = "nextLevelGain";
    public static final String e = "aptitudesList";
    public static final String f = "icon";
    public static final String g = "tagRoundStyle";
    public static final String h = "categoryIconStyle";
    private static final String[] j = new String[]{"name", "remainingPoints", "nextLevelGain", "aptitudesList", "icon"};
    public static final Comparator<bkw_2> i = Comparator.comparingInt(bkw_2::f);
    private final ezw_2 k;
    private final ezx_2 l;
    private final ArrayList<bkx_2> m = new ArrayList();

    public bkw_2(ezw_2 ezw_22, ezx_2 ezx_22) {
        this.k = ezw_22;
        this.l = ezx_22;
        for (bkt_2 bkt_22 : this.k.b()) {
            this.m.add(new bkx_2(ezx_22, this, bkt_22));
        }
        this.m.sort(bkx_2.j);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return bae.h().a(147, (long)this.k.a(), new Object[0]);
            }
            case "remainingPoints": {
                return this.a();
            }
            case "aptitudesList": {
                return this.m;
            }
            case "nextLevelGain": {
                short s2 = azu_0.j().k().dr();
                int n = this.k.c(s2);
                if (n == -1) {
                    return null;
                }
                return bae.h().a("aptitude.nextLevelActivation", n);
            }
            case "icon": {
                return null;
            }
            case "tagRoundStyle": {
                int n = this.a();
                if (n > 0) {
                    return "tagRoundEnabled";
                }
                if (n == 0) {
                    return "tagRoundDisabled";
                }
                return "tagRoundNegative";
            }
            case "categoryIconStyle": {
                return "Aptitude" + this.k.a();
            }
        }
        return null;
    }

    public int a() {
        return this.l.c(this.k.a(), cZI.H());
    }

    public boolean b() {
        for (bkx_2 bkx_22 : this.m) {
            if (bkx_22.b() <= 0) continue;
            return true;
        }
        return false;
    }

    public int c() {
        return this.k.a();
    }

    private int f() {
        return this.k.c();
    }

    public void e() {
        for (bkx_2 bkx_22 : this.m) {
            bkx_22.c();
        }
        fis_1.a().a((ajf_1)this, b, g);
    }

    @Override
    public String[] d() {
        return j;
    }
}

