/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bOX
 */
public class box_0
implements ajh_1 {
    private static final Logger m = Logger.getLogger(box_0.class);
    private static final EnumMap<efa_0, box_0> n = new EnumMap(efa_0.class);
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "elementIconUrl";
    public static final String e = "decoratorStyle";
    public static final String f = "buttonStyle";
    public static final String g = "spellDescription";
    public static final String h = "stringMaster";
    public static final String i = "iconStyleMaster";
    public static final String j = "color";
    private final byte o;
    protected final efa_0 k;
    public static final String[] l;
    private static final String p = "IconFireElement";
    private static final String q = "IconEarthElement";
    private static final String r = "IconAirElement";
    private static final String s = "IconStasisElement";
    private static final String t = "IconWaterElement";
    private static final String u = "IconSupportElement";
    private static final azf_2 v;
    private static final azf_2 w;
    private static final azf_2 x;
    private static final azf_2 y;
    private static final azf_2 z;
    private static final azf_2 A;

    box_0(efa_0 efa_02) {
        this.k = efa_02;
        this.o = efa_02.a();
    }

    public byte a() {
        return this.o;
    }

    public static box_0[] a(epn_2 epn_22) {
        ArrayList arrayList = new ArrayList();
        epn_22.a(new boy_0(arrayList));
        return arrayList.toArray(new box_0[arrayList.size()]);
    }

    public static box_0 a(efa_0 efa_02) {
        return n.get(efa_02);
    }

    public static box_0 a(byte by) {
        return n.get(efa_0.a(by));
    }

    public efa_0 b() {
        return this.k;
    }

    public String c() {
        return bae.h().a(this.k.name(), new Object[0]);
    }

    public String e() {
        return bae.h().a(String.format("%s%s", "characterCreation.elementDescription.", this.k.name()), new Object[0]);
    }

    public String f() {
        return bae.h().a(String.format("%s%s", "desc.showSpells.", this.k.name()), new Object[0]);
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.c();
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(d)) {
            String string2 = null;
            try {
                string2 = String.format(azs_0.a().a("elementsIconsPath"), this.k.name());
            }
            catch (gm_0 gm_02) {
                // empty catch block
            }
            return string2;
        }
        if (string.equals(e)) {
            return "elementDecorator" + this.a();
        }
        if (string.equals(f)) {
            return this.k.name();
        }
        if (string.equals(g)) {
            return this.f();
        }
        if (string.equalsIgnoreCase(h)) {
            return this.g();
        }
        if (string.equalsIgnoreCase(i)) {
            return this.h();
        }
        if (string.equalsIgnoreCase(j)) {
            return this.i();
        }
        return null;
    }

    private String g() {
        switch (this.k.a()) {
            case 3: {
                return bae.h().a("desc.earthMaster", new Object[0]);
            }
            case 2: {
                return bae.h().a("desc.waterMaster", new Object[0]);
            }
            case 4: {
                return bae.h().a("desc.airMaster", new Object[0]);
            }
            case 1: {
                return bae.h().a("desc.fireMaster", new Object[0]);
            }
            case 0: {
                return bae.h().a("desc.physicalMaster", new Object[0]);
            }
            case 5: {
                return bae.h().a("desc.stasisMaster", new Object[0]);
            }
            case 9: {
                return bae.h().a("desc.supportMaster", new Object[0]);
            }
        }
        return null;
    }

    private String h() {
        try {
            switch (this.k.a()) {
                case 3: {
                    return q;
                }
                case 2: {
                    return t;
                }
                case 4: {
                    return r;
                }
                case 1: {
                    return p;
                }
                case 5: {
                    return s;
                }
                case 0: {
                    return null;
                }
                case 9: {
                    return u;
                }
            }
            return null;
        }
        catch (Exception exception) {
            m.error((Object)"Unknow Element");
            return null;
        }
    }

    private azj_2 i() {
        try {
            switch (this.k.a()) {
                case 3: {
                    return v;
                }
                case 2: {
                    return w;
                }
                case 4: {
                    return x;
                }
                case 1: {
                    return y;
                }
                case 5: {
                    return z;
                }
                case 0: {
                    return null;
                }
                case 9: {
                    return A;
                }
            }
            return null;
        }
        catch (Exception exception) {
            m.error((Object)"Unknow Element");
            return null;
        }
    }

    @Override
    public String[] d() {
        return l;
    }

    static {
        for (efa_0 efa_02 : efa_0.values()) {
            n.put(efa_02, new box_0(efa_02));
        }
        l = new String[]{a, b, d, e, g, f, h, i, j};
        v = new azf_2(0.75f, 1.0f, 0.19f, 1.0f);
        w = new azf_2(0.19f, 0.69f, 1.0f, 1.0f);
        x = new azf_2(0.57f, 0.29f, 1.0f, 1.0f);
        y = new azf_2(1.0f, 0.67f, 0.19f, 1.0f);
        z = new azf_2(1.0f, 0.35f, 1.0f, 1.0f);
        A = new azf_2(0.76f, 0.62f, 0.0f, 1.0f);
    }
}

