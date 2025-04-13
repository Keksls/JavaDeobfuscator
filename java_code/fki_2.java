/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fKI
 */
public class fki_2
implements fko_2 {
    private static final Logger a = Logger.getLogger(fki_2.class);
    private int b;
    private int c;
    private frb_0 d;
    private int e;
    private ArrayList<String> f;
    private boolean g = false;

    public fki_2(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("animatedCursor")) {
            return;
        }
        try {
            aqx_2 aqx_23 = aqx_22.f("x");
            aqx_2 aqx_24 = aqx_22.f("y");
            aqx_2 aqx_25 = aqx_22.f("delay");
            aqx_2 aqx_26 = aqx_22.f("type");
            this.b = aqx_23 == null ? 0 : aqx_23.g();
            this.c = aqx_24 == null ? 0 : aqx_24.g();
            this.e = aqx_25 == null ? 500 : aqx_25.g();
            this.d = aqx_26 == null ? frb_0.a : frb_0.valueOf(aqx_26.c().toUpperCase());
            ArrayList<aqx_2> arrayList = aqx_22.d("cursorFrame");
            this.f = new ArrayList(arrayList.size());
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                aqx_2 aqx_27 = arrayList.get(k);
                aqx_2 aqx_28 = aqx_27.f("path");
                this.f.add(aqx_28.c());
            }
            this.g = true;
        }
        catch (Exception exception) {
            a.warn((Object)"Probl\u00e8me \u00e0 la lecture d'un AnimatedCursor");
        }
    }

    public fki_2(int n, int n2, frb_0 frb_02, int n3, int n4, ArrayList<String> arrayList) {
        this.b = n;
        this.c = n2;
        this.d = frb_02;
        this.e = n3;
        this.f = arrayList;
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.g) {
            fyw_02.a(this.d, this.b, this.c, this.e, this.f);
        }
    }

    public String a(fkx_1 fkx_12) {
        if (!this.g) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string = fkx_12.c();
        stringBuilder.append(new fkw_1(ArrayList.class, string, "new ArrayList<String>()").a(fkx_12));
        stringBuilder.append("\n");
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            stringBuilder.append(new fkv_1(null, "add", string, "\"" + this.f.get(k) + "\"").a(fkx_12)).append("\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append("InitLoaderManager.getInstance().addLoader(new AnimatedCursorInitLoader(").append(this.b).append(", ").append(this.c).append(", ").append("CursorFactory.CursorType.").append(this.d.name()).append(", ").append(this.e).append(", ").append(string).append("));");
        return stringBuilder.toString();
    }

    @Override
    public void a(fkb_2 fkb_22) {
        if (!this.g) {
            return;
        }
        fkb_22.a(ArrayList.class);
        fkb_22.a(frb_0.class);
        String string = fkb_22.k();
        String string2 = fkb_22.b();
        fkb_22.a(new fkw_1(ArrayList.class, string2, "new ArrayList<String>()"));
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            fkb_22.a(new fkv_1(null, "add", string2, "\"" + this.f.get(k) + "\""));
        }
        fkb_22.a(new fkv_1(null, "loadAnimatedCursor", string, frb_0.class.getSimpleName() + "." + this.d.name(), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.e), string2));
    }

    @Override
    public boolean a() {
        return this.g;
    }
}

