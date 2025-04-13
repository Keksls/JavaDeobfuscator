/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.log4j.Logger;

/*
 * Renamed from bPE
 */
public class bpe_0
extends fie_0
implements ajh_1,
bou_0 {
    private static final Logger W = Logger.getLogger(bpe_0.class);
    boolean a;
    boolean b;
    String d;
    private static final int X = 225;
    private static final int Y = 0;
    private static final int Z = 24;
    private static final int aa = 26;
    private static final int ab = 288;
    private static final int ac = 309;
    private static final String ad = "fontDefault14";
    public static final String e = "showInTimeline";
    public static final String f = "name";
    public static final String g = "nameAndLevel";
    public static final String h = "tableTurnDuration";
    public static final String i = "duration";
    public static final String j = "iconUrl";
    public static final String k = "description";
    public static final String l = "effectDescription";
    public static final String m = "nonCriticalEffectDescription";
    public static final String n = "criticalEffectDescription";
    public static final String o = "criticalEffectDescriptionSize";
    public static final String p = "isCumulable";
    public static final String q = "level";
    public static final String r = "levelValue";
    public static final String s = "maxLevelValue";
    public static final String t = "nameWithFormat";
    public static final String[] u = new String[]{"name", "nameAndLevel", "tableTurnDuration", "duration", "iconUrl", "showInTimeline", "description", "effectDescription", "nonCriticalEffectDescription", "criticalEffectDescription", "criticalEffectDescriptionSize", "isCumulable", "level", "nameWithFormat", "levelValue", "maxLevelValue"};

    public bpe_0 b(short s2) {
        bpe_0 bpe_02 = new bpe_0();
        this.a(s2, bpe_02);
        return bpe_02;
    }

    @Override
    public void a(short s2) {
        this.R = (short)Math.min(s2, this.a());
        fis_1.a().a((ajf_1)this, u);
    }

    protected void a(short s2, bpe_0 bpe_02) {
        super.a(s2, bpe_02);
        bpe_02.d = this.d;
        bpe_02.a = this.a;
        bpe_02.b = this.b;
        if (this.P != null && !this.P.isEmpty()) {
            bpe_02.P = new ArrayList(this.P);
        }
    }

    public String e() {
        elw_1 elw_12;
        switch (fii_0.a(this.N)) {
            case a: {
                elw_12 = elw_1.dG;
                break;
            }
            case c: {
                elw_12 = elw_1.dF;
                break;
            }
            default: {
                elw_12 = elw_1.aj;
            }
        }
        return new ani_2().i().a(new fyr_0(elw_12).w()).a((CharSequence)this.g()).j().r();
    }

    @Override
    public Object b(String string) {
        if (string.equalsIgnoreCase(f)) {
            return this.a(14);
        }
        if (string.equalsIgnoreCase(t)) {
            return this.e();
        }
        if (string.equalsIgnoreCase(g)) {
            return this.L();
        }
        if (string.equalsIgnoreCase(i)) {
            return this.m();
        }
        if (string.equalsIgnoreCase(h)) {
            return this.m();
        }
        if (string.equalsIgnoreCase(j)) {
            return this.i();
        }
        if (string.equalsIgnoreCase(e)) {
            return this.j();
        }
        if (string.equals(k)) {
            return this.f();
        }
        if (string.equals(l)) {
            return this.a(eDk.a);
        }
        if (string.equals(m)) {
            return this.a(eDk.b);
        }
        if (string.equals(n)) {
            return this.a(eDk.c);
        }
        if (string.equals(o)) {
            List<String> list = this.a(eDk.c);
            int n = 0;
            if (list != null) {
                ayf_2 ayf_22 = fpm_0.b().g().d(ad);
                for (String string2 : list) {
                    fxN fxN2 = new fxN();
                    fxN2.b(string2);
                    int n2 = 0;
                    for (fxQ fxQ2 : fxN2) {
                        switch (fxQ2.b()) {
                            case b: {
                                fxS fxS2 = (fxS)fxQ2;
                                n2 += ayf_22.a(fxS2.j());
                                break;
                            }
                            case c: {
                                fxR fxR2 = (fxR)fxQ2;
                                n2 += fxR2.k();
                            }
                        }
                    }
                    n += n2 / 288 + 1;
                }
            }
            int n3 = 26 + n * 24;
            n3 = Hw.a(n3, 0, 225);
            return new fjf_2(309, n3);
        }
        if (string.equals(p)) {
            return this.A();
        }
        if (string.equals(q)) {
            return bae.h().a("levelShort.custom", this.c());
        }
        if (string.equals(r)) {
            return this.R;
        }
        if (string.equals(s)) {
            return this.a();
        }
        return null;
    }

    @Override
    public short a() {
        if (this.x <= 0) {
            return 245;
        }
        return this.x;
    }

    public String f() {
        if (!bae.h().a(9, (long)this.p())) {
            return "";
        }
        return bae.h().a(9, (long)this.p(), new Object[0]);
    }

    private String L() {
        String string = this.a(14);
        short s2 = this.c();
        if (s2 == 1) {
            return string;
        }
        return string + " (" + bae.h().a("levelShort.custom", s2) + ")";
    }

    @Override
    public String[] d() {
        return u;
    }

    @Override
    public String g() {
        return this.a(-1);
    }

    public String a(int n) {
        String string = bae.h().a(8, (long)this.p(), new Object[0]);
        string = bae.a(string, n);
        return string;
    }

    public String h() {
        return bae.h().a(8, (long)this.p(), new Object[0]);
    }

    public String i() {
        try {
            return String.format(azs_0.a().a("statesIconsPath"), this.d);
        }
        catch (gm_0 gm_02) {
            W.error((Object)("PropertyException pendant l'acc\u00e8s \u00e0 l'url de l'icone de l'\u00e9tat " + this.p()));
            return null;
        }
    }

    @Nullable
    public List<String> a(eDk eDk2) {
        ArrayList<String> arrayList = eDi.a(new edh_0(this, eDk2));
        if (arrayList == null) {
            return null;
        }
        arrayList.removeIf(string -> string == null || string.isEmpty());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public boolean j() {
        return this.a;
    }

    public boolean k() {
        return this.b;
    }

    @Override
    public short b() {
        return this.p();
    }

    @Override
    public /* synthetic */ fie_0 c(short s2) {
        return this.b(s2);
    }
}

