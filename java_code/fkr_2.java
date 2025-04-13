/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from fKr
 */
public abstract class fkr_2<T extends fks_1<T>> {
    protected final String a;
    protected final String b;
    protected final HashSet<Class<?>> c = new HashSet();
    protected final ArrayList<T> d = new ArrayList();
    protected T e = null;
    protected PrintWriter f;
    protected int g = 0;

    public fkr_2(PrintWriter printWriter, String string, String string2) {
        this.a = string == null || string.length() == 0 ? "Class0" : string;
        this.b = string2;
        this.f = printWriter;
    }

    protected void a() {
    }

    public void a(Class<?> clazz) {
        if (!clazz.isPrimitive()) {
            this.c.add(clazz);
        }
    }

    public void a(fkt_1 fkt_12) {
        ((fks_1)this.e).a(fkt_12);
    }

    public String a(Object object) {
        return ((fks_1)this.e).a(object);
    }

    public Object a(String string) {
        return ((fks_1)this.e).a(string);
    }

    public String b() {
        return ((fks_1)this.e).c();
    }

    public void a(String string, Object object) {
        ((fks_1)this.e).a(string, object);
    }

    public boolean b(String string) {
        return ((fks_1)this.e).b(string);
    }

    public void c(String string) {
        ((fks_1)this.e).c(string);
    }

    public String c() {
        return Cz.n(this.a);
    }

    public boolean d() {
        return ((fks_1)this.e).d();
    }

    public void e() {
        ((fks_1)this.e).h();
    }

    public void f() {
        ((fks_1)this.e).i();
    }

    public void g() {
        ((fks_1)this.e).j();
    }

    protected void a(T t) {
        if (this.e != null) {
            ((fks_1)this.e).a(t);
        }
        this.e = t;
        this.d.add(this.e);
    }

    public void h() {
        this.e = ((fks_1)this.e).b();
    }

    @Nullable
    public String i() {
        if (this.e == null) {
            return null;
        }
        return ((fks_1)this.e).g();
    }

    public void j() {
        for (fks_1 object : this.d) {
            for (fkt_1 fkt_12 : object.e()) {
                Class<?> clazz = fkt_12.a();
                if (clazz == null) continue;
                this.a((T)clazz);
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
        for (fks_1 fks_12 : this.d) {
            fks_12.a(this.f);
            this.f.println();
        }
        this.f.println("}");
        this.f.flush();
    }
}

