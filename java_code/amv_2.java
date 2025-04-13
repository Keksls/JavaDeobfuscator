/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * Renamed from aMV
 */
public final class amv_2
extends amq_2 {
    private boolean d;
    private boolean e;
    private final ArrayList<amw_2> f = new ArrayList();

    @Override
    public void d() {
        this.d = false;
        boolean bl = true;
        for (amw_2 amw_22 : this.f) {
            if (amw_22.b().a(amw_22.a())) continue;
            bl = false;
        }
        this.d = bl;
    }

    @Override
    public void f() {
        for (amw_2 amw_22 : this.f) {
            amw_22.b().a();
        }
        this.e = true;
    }

    @Override
    public void g() {
    }

    @Override
    public void h() {
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j() {
        return this.d;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m() {
        return this.e;
    }

    @Override
    public void a(aqv_2 aqv_22) {
        ArrayList<aqx_2> arrayList = aqv_22.d("definition");
        if (arrayList != null) {
            for (aqx_2 aqx_22 : arrayList) {
                aqx_2 aqx_23 = aqx_22.f("file");
                aqx_2 aqx_24 = aqx_22.f("manager");
                if (aqx_23 == null || aqx_24 == null) {
                    c.error((Object)"Un ou plusieurs param\u00e8tres manquants");
                    return;
                }
                try {
                    Class<?> clazz = Class.forName(aqx_24.c(), true, ClassLoader.getSystemClassLoader());
                    Method method = clazz.getMethod("getInstance", null);
                    amx_2 amx_22 = (amx_2)method.invoke(null, new Object[0]);
                    this.f.add(new amw_2(aqx_23.c(), amx_22));
                }
                catch (Exception exception) {
                    c.error((Object)("Impossible de r\u00e9cup\u00e9rer le DefintionsManager sp\u00e9cifi\u00e9 : " + exception.toString()));
                    break;
                }
            }
        }
    }
}

