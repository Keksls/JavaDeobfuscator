/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * Renamed from fKD
 */
public class fkd_2
extends fku_1 {
    private static final String h = "doc";
    private fyo i;

    public fkd_2(PrintWriter printWriter, String string, String string2, aqx_2 aqx_22, fyo fyo2, fyw_0 fyw_02) {
        super(printWriter, string, string2, aqx_22);
        this.a(fyn_0.class);
        ((fkf_2)this.e).a(fyo2, "element", true);
    }

    @Override
    protected void a(aqx_2 aqx_22) {
        this.e = new fkf_2(aqx_22, null, null, "applyStyle", null, true);
        this.d.add(this.e);
    }

    @Override
    public void a(aqx_2 aqx_22, fyo fyo2, String string) {
        this.a(new fkf_2(aqx_22, fyo2, string, "method" + this.g++, (fkf_2)this.e, false));
    }

    @Override
    public void a(boolean bl) {
        if (bl) {
            fkv_1 fkv_12 = new fkv_1(null, this.e.g(), null, this.e.a());
            this.e = this.e.b();
            this.e.a(fkv_12);
        } else {
            this.e = this.e.b();
        }
    }

    @Override
    public void j() {
        fky_1 fky_12;
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            fky_12 = (fky_1)this.d.get(k);
            ArrayList<fkt_1> arrayList = fky_12.e();
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                Class<?> clazz = arrayList.get(i2).a();
                if (clazz == null) continue;
                this.a(clazz);
            }
        }
        if (this.b != null) {
            this.f.println("package " + this.b + ";");
        }
        this.f.println();
        for (Class clazz : this.c) {
            this.f.println("import " + clazz.getCanonicalName() + ";");
        }
        this.f.println();
        this.f.println("public class " + this.a + " implements StyleSetter {");
        this.f.println();
        this.f.println("\tprivate DocumentParser doc;");
        this.f.println("\tprivate Stack<ElementMap> elementMaps = new Stack<ElementMap>();");
        this.f.println();
        n = this.d.size();
        for (int k = 0; k < n; ++k) {
            fky_12 = (fky_1)this.d.get(k);
            fky_12.a(this.f);
            this.f.println();
        }
        this.f.println("}");
        this.f.flush();
    }
}

