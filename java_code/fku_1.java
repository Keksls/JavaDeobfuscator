/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

/*
 * Renamed from fKu
 */
public class fku_1
extends fkr_2 {
    private aqx_2 h;

    public fku_1(PrintWriter printWriter, String string, String string2, aqx_2 aqx_22) {
        super(printWriter, string, string2);
        this.a(aqx_22);
        this.a(fyo.class);
        this.a(fyb_0.class);
        this.a(fyq.class);
        this.a(aqx_2.class);
        this.a(Stack.class);
    }

    protected void a(aqx_2 aqx_22) {
        this.e = new fky_1<Object>(aqx_22, null, null, "getElement", null, true);
        this.d.add(this.e);
    }

    public String k() {
        return ((fky_1)this.d.get(0)).l();
    }

    public String l() {
        return ((fky_1)this.d.get(0)).m();
    }

    public void a(aqx_2 aqx_22, fyo fyo2, String string) {
        this.a(new fky_1<fky_1>(aqx_22, fyo2, string, "method" + this.g++, (fky_1)this.e, false));
    }

    @Override
    public void h() {
        this.a(true);
    }

    public void a(boolean bl) {
        if (bl) {
            fkv_1 fkv_12 = new fkv_1(null, this.e.g(), null, this.e.a());
            super.h();
            this.e.a(fkv_12);
        } else {
            super.h();
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
        this.f.println("public class " + this.a + " implements BasicElementFactory {");
        this.f.println();
        this.f.println("\tprivate Stack<ElementMap> elementMaps = new Stack<ElementMap>();");
        this.f.println("\tprivate Environment env;");
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

