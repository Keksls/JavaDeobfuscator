/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzw
 */
public abstract class bzw_2
implements ajh_1 {
    public static final String m = "tabIconStyle";
    public static final String n = "tabIconModulationColor";
    public static final String o = "tabIconPopupText";
    public static final String p = "shortcutText";
    public static final String[] q = new String[]{"tabIconStyle", "tabIconModulationColor", "tabIconPopupText", "shortcutText"};
    private boolean a;
    private boolean b;

    protected abstract int a();

    protected abstract String b();

    private boolean c() {
        return cZI.a().f(this.a());
    }

    private boolean e() {
        return cZI.a().e(this.a());
    }

    public void g() {
        this.a = this.c();
        this.b = this.e();
        fis_1.a().a((ajf_1)this, q);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "tabIconStyle": {
                if (!this.a) {
                    return "warningIcon";
                }
                if (this.b) {
                    return "editIcon";
                }
                return null;
            }
            case "tabIconModulationColor": {
                if (!this.a) {
                    return elw_1.dI.a();
                }
                return azf_2.e;
            }
            case "tabIconPopupText": {
                if (!this.a) {
                    return bae.h().a("build.invalid.sheet.popup", new Object[0]);
                }
                if (this.b) {
                    return bae.h().a("build.unsaved.changes.popup", new Object[0]);
                }
                return null;
            }
            case "shortcutText": {
                String string2 = aZF.a(aZG.e().a(this.b()));
                return bae.h().a("shortcuts", new Object[0]) + " " + aZF.a(string2);
            }
        }
        return null;
    }
}

