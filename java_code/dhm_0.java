/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from dhM
 */
public class dhm_0
implements ajh_1 {
    public static final String a = "availableResolutions";
    public static final String b = "availableModes";
    public static final String d = "availableFrequencies";
    public static final String e = "selectedResolution";
    public static final String f = "selectedMode";
    public static final String g = "selectedFrequency";
    public static final String h = "isFullScreenModeSelected";
    public static final String[] i;
    private final ajh_0 j;
    private dho_0 k;
    private dhq_0 l;
    private dhp_0 m;
    private static final dho_0 n;
    private static final DisplayMode[] o;
    private final TIntObjectHashMap<dhp_0> p = new TIntObjectHashMap();

    public dhm_0(ajh_0 ajh_02) {
        this.j = ajh_02;
        aiy_0 aiy_02 = this.j.q();
        this.l = this.f();
        this.k = new dho_0(aiy_02.d());
        for (aiz_0 aiz_02 : aiz_0.values()) {
            this.p.put(aiz_02.ordinal(), (Object)new dhp_0(aiz_02));
        }
        this.m = (dhp_0)this.p.get(aiy_02.e().ordinal());
        aiy_02.e();
    }

    @Override
    public String[] d() {
        return i;
    }

    public void a(Object object, Object object2, Object object3) {
        aiy_0 aiy_02;
        GraphicsDevice graphicsDevice = ajh_0.e.getDefaultScreenDevice();
        DisplayMode displayMode = graphicsDevice.getDisplayMode();
        aiz_0 aiz_02 = (aiz_0)((Object)object);
        switch (aiz_02) {
            case c: {
                dhq_0 dhq_02 = (dhq_0)object2;
                dho_0 dho_02 = (dho_0)object3;
                aiy_02 = new aiy_0(dhq_02.a(), dhq_02.b(), displayMode.getBitDepth(), dho_02.a, aiz_02, graphicsDevice.getIDstring(), this.j.k(), this.j.l());
                break;
            }
            case a: {
                aiy_0 aiy_03 = this.j.s();
                aiy_02 = new aiy_0(aiy_03.a(), aiy_03.b(), -1, 0, aiz_02, graphicsDevice.getIDstring(), this.j.k(), this.j.l());
                break;
            }
            case b: {
                aiy_02 = new aiy_0(0, 0, -1, 0, aiz_02, graphicsDevice.getIDstring(), this.j.k(), this.j.l());
                break;
            }
            default: {
                aiy_02 = this.j.a(graphicsDevice.getIDstring(), this.j.k(), this.j.l());
            }
        }
        this.j.a(aiy_02);
    }

    public void a(dhp_0 dhp_02) {
        this.m = dhp_02;
        fis_1.a().a((ajf_1)this, h, d);
    }

    public void a(Object object) {
        this.l = (dhq_0)object;
        fis_1.a().a((ajf_1)this, d);
    }

    public aiz_0 a() {
        return this.m.a;
    }

    public dhq_0 b() {
        return this.l;
    }

    public dho_0 c() {
        return this.k;
    }

    private dhq_0 f() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        float f2 = (float)dimension.width / (float)dimension.height;
        aiy_0 aiy_02 = this.j.q();
        Dimension dimension2 = this.j.t();
        int n = aiy_02.a() * aiy_02.b();
        dhq_0 dhq_02 = new dhq_0(dimension.width, dimension.height);
        float f3 = f2;
        float f4 = Math.abs((float)(n - dimension.width * dimension.height) / (float)n);
        for (DisplayMode displayMode : o) {
            float f5;
            float f6;
            int n2;
            if (displayMode.getHeight() > 1080 || displayMode.getWidth() > 1920 || (n2 = displayMode.getBitDepth()) != -1 && n2 < this.j.u() || displayMode.getWidth() < dimension2.width || displayMode.getHeight() < dimension2.height || Math.abs((f6 = (float)displayMode.getWidth() / (float)displayMode.getHeight()) - f2) > Math.abs(f3 - f2) || (f5 = Math.abs((float)(n - displayMode.getWidth() * displayMode.getHeight()) / (float)n)) >= f4) continue;
            dhq_02 = new dhq_0(displayMode.getWidth(), displayMode.getHeight());
            f3 = f6;
            f4 = f5;
        }
        return dhq_02;
    }

    private ArrayList<dho_0> g() {
        ArrayList<dho_0> arrayList = new ArrayList<dho_0>();
        for (DisplayMode displayMode : o) {
            dho_0 dho_02;
            int n = displayMode.getBitDepth();
            if (n != -1 && n < this.j.u() || displayMode.getWidth() != this.l.a() || displayMode.getHeight() != this.l.b() || arrayList.contains(dho_02 = new dho_0(displayMode.getRefreshRate()))) continue;
            arrayList.add(dho_02);
        }
        if (!arrayList.contains(n)) {
            arrayList.add(n);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public ArrayList<dhq_0> e() {
        ArrayList<dhq_0> arrayList = new ArrayList<dhq_0>();
        Dimension dimension = this.j.t();
        for (DisplayMode displayMode : o) {
            dhq_0 dhq_02;
            int n = displayMode.getBitDepth();
            if (n != -1 && n < this.j.u() || displayMode.getWidth() < dimension.width || displayMode.getHeight() < dimension.height || arrayList.contains(dhq_02 = new dhq_0(displayMode.getWidth(), displayMode.getHeight()))) continue;
            arrayList.add(dhq_02);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private Object[] h() {
        return this.p.values();
    }

    @Override
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e();
        }
        if (b.equals(string)) {
            return this.h();
        }
        if (d.equals(string)) {
            return this.g();
        }
        if (e.equals(string)) {
            return this.l;
        }
        if (f.equals(string)) {
            return this.m;
        }
        if (g.equals(string)) {
            return this.k;
        }
        if (h.equals(string)) {
            return this.m.a == aiz_0.c;
        }
        System.err.println("Not found : " + string);
        return null;
    }

    static {
        DisplayMode[] displayModeArray;
        i = new String[]{a, b, d, e, f, g, h};
        n = new dho_0(0);
        ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
        for (DisplayMode displayMode : displayModeArray = ajh_0.e.getDefaultScreenDevice().getDisplayModes()) {
            if (displayMode.getWidth() < 1024 || displayMode.getHeight() < 768) continue;
            arrayList.add(displayMode);
        }
        o = arrayList.toArray(new DisplayMode[arrayList.size()]);
    }
}

