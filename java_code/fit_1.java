/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fIT
 */
public final class fit_1
implements fal_1 {
    private static final Logger d = Logger.getLogger(fit_1.class);
    public static final String a = "/";
    private final String e;
    private Object f;
    private boolean g;
    private final List<fix_1<fyo>> h = Collections.synchronizedList(new ArrayList());
    private final ConcurrentLinkedQueue<fiv_1> i = new ConcurrentLinkedQueue();
    private final List<fit_1> j = new ArrayList<fit_1>();
    private fit_1 k;
    private final boolean l;
    private boolean m;
    private int n;
    private String o;
    private fyy_0 p;
    private final Collection<fiq_1> q = new ArrayList<fiq_1>();
    private boolean r;
    public static final String b = "#";

    public fit_1(String string, fyy_0 fyy_02) {
        this(string, fyy_02, false);
    }

    public fit_1(String string, fyy_0 fyy_02, boolean bl) {
        this.e = string;
        this.l = bl;
        this.p = fyy_02;
        if (this.p != null) {
            this.p.a(this);
        }
    }

    public fit_1(String string, fit_1 fit_12, String string2, fyy_0 fyy_02) {
        this(string, fyy_02, true);
        this.o = string2;
        if (fit_12 != null) {
            fit_12.a(this);
        }
    }

    public fit_1(String string, fit_1 fit_12, int n, fyy_0 fyy_02) {
        this(string, fyy_02, true);
        this.k = fit_12;
        this.m = true;
        this.n = n;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.o;
    }

    public void a(fiq_1 fiq_12) {
        this.q.add(fiq_12);
    }

    public void b(fiq_1 fiq_12) {
        this.q.remove(fiq_12);
        if (this.q.isEmpty() && this.h.isEmpty() && this.j.isEmpty()) {
            fis_1.a().c(this);
        }
    }

    public void a(boolean bl) {
        this.r = bl;
    }

    public void a(fyy_0 fyy_02) {
        this.p = fyy_02;
    }

    public boolean c() {
        return this.p != null;
    }

    public boolean d() {
        return this.g;
    }

    public fyy_0 e() {
        return this.p;
    }

    public Object f() {
        return this.f;
    }

    public String g() {
        return Co.a(this.f);
    }

    public boolean h() {
        return Co.b(this.f);
    }

    public int i() {
        return Co.c(this.f);
    }

    public short j() {
        return Co.h(this.f);
    }

    public double k() {
        return Co.d(this.f);
    }

    public float l() {
        return Co.e(this.f);
    }

    public long m() {
        return Co.f(this.f);
    }

    public boolean n() {
        if (this.f instanceof String) {
            return "".equals(this.f);
        }
        return this.f == null;
    }

    @Nullable
    public static Object a(Object object, String string) {
        if (object instanceof ajf_1 && string != null) {
            abo_2<Object, String> abo_22 = fit_1.b(object, string);
            if (abo_22.a() instanceof ajf_1 && abo_22.b() != null) {
                ajf_1 ajf_12 = (ajf_1)abo_22.a();
                return ajf_12.b(abo_22.b());
            }
            return null;
        }
        return object;
    }

    public static abo_2<Object, String> b(Object object, String string) {
        abo_2<Object, Object> abo_22 = new abo_2<Object, Object>(object, null);
        String[] stringArray = string.split(a);
        for (int k = 0; k < stringArray.length - 1; ++k) {
            if (!(object instanceof ajf_1) || stringArray[k] == null) {
                abo_22.b(null);
                return abo_22;
            }
            object = ((ajf_1)object).b(stringArray[k]);
            abo_22.a(object);
        }
        abo_22.b(stringArray[stringArray.length - 1]);
        return abo_22;
    }

    private Object g(String string) {
        if (this.f instanceof ajf_1 && string != null) {
            ajf_1 ajf_12 = (ajf_1)this.f;
            return ajf_12.b(string);
        }
        return this.f;
    }

    private Object h(String string) {
        String[] stringArray = string.split(a);
        Object object = this.f;
        for (int k = 0; k < stringArray.length; ++k) {
            if (!(object instanceof ajf_1) || stringArray[k] == null) {
                return object;
            }
            object = ((ajf_1)object).b(stringArray[k]);
        }
        return object;
    }

    public Object a(String string) {
        return this.g(string);
    }

    public String b(String string) {
        return Co.a(this.g(string));
    }

    public int c(String string) {
        return Co.c(this.g(string));
    }

    public void o() {
        ajf_1[] ajf_1Array = null;
        if (this.f instanceof ajf_1[]) {
            ajf_1Array = (ajf_1[])this.f;
        }
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            fit_1 fit_12 = this.j.get(k);
            if (fit_12.m && ajf_1Array != null && ajf_1Array.length > fit_12.n) {
                fit_12.a(ajf_1Array[fit_12.n], false);
                continue;
            }
            fit_12.a(this.h(fit_12.b()), false);
        }
    }

    public void d(String string) {
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            fit_1 fit_12 = this.j.get(k);
            if (!string.equals(fit_12.o)) continue;
            fit_12.a(this.h(fit_12.o), false);
        }
    }

    public void p() {
        fiv_1 fiv_12 = this.i.poll();
        while (fiv_12 != null) {
            fiv_12.a.a((fiv_1)null);
            switch (fiv_12.c) {
                case a: {
                    this.d(fiv_12.a, fiv_12.b);
                    break;
                }
                case c: {
                    this.e(fiv_12.a, fiv_12.b);
                    break;
                }
                case b: {
                    this.f(fiv_12.a, fiv_12.b);
                }
            }
            fiv_12 = this.i.poll();
        }
    }

    public void a(fix_1<fyo> fix_12, boolean bl) {
        String string = fix_12.e().substring(0, fix_12.e().indexOf(a));
        fit_1 fit_12 = null;
        for (fit_1 fit_13 : this.j) {
            if (!fit_13.b().equalsIgnoreCase(string)) continue;
            fit_12 = fit_13;
            break;
        }
        if (fit_12 == null) {
            fit_12 = new fit_1(fit_1.a(this, string), this, string, this.p);
            fit_12.a(this.a(string), false);
            fis_1.a().a(fit_12);
        }
        fix_12.b(fix_12.e().substring(fix_12.e().indexOf(a) + 1));
        fit_12.b(fix_12, bl);
    }

    public void a(fix_1<fyo> fix_12) {
        this.b(fix_12, true);
    }

    public void b(fix_1<fyo> fix_12, boolean bl) {
        Object object;
        if (fix_12.e() != null && fix_12.e().contains(a)) {
            this.a(fix_12, bl);
            return;
        }
        if (this.h.contains(fix_12)) {
            d.error((Object)("Ajout d'un client \u00e0 une propri\u00e9t\u00e9 qui le contient d\u00e9j\u00e0 : " + fix_12));
        } else {
            this.h.add(fix_12);
            fix_12.c().addProperty(this);
        }
        if (fix_12.f() != null) {
            fix_12.f().setResultProviderParent(this);
        }
        if (fix_12.g()) {
            object = new StringBuilder();
            ((StringBuilder)object).append(this.e);
            if (fix_12.e() != null) {
                ((StringBuilder)object).append(a).append(fix_12.e());
            }
            ((faa_1)((Object)fix_12.c())).setContentProperty(((StringBuilder)object).toString(), this.p);
        }
        if (this.g) {
            object = null;
            object = this.f instanceof ajf_1 && fix_12.e() != null ? ((ajf_1)this.f).b(fix_12.e()) : this.f;
            if (bl) {
                if (fix_12.f() != null) {
                    object = fix_12.f().getResult(object);
                }
                this.d(fix_12, object);
            } else {
                this.a(fix_12, object);
            }
        }
    }

    public void a(fyo fyo2) {
        if (fyo2 == null) {
            return;
        }
        Iterator<fiv_1> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a.c() != fyo2) continue;
            iterator.remove();
        }
        ArrayList<fix_1<fyo>> arrayList = new ArrayList<fix_1<fyo>>();
        for (fix_1<fyo> fix_12 : this.h) {
            if (!fix_12.c().equals(fyo2)) continue;
            arrayList.add(fix_12);
            if (!fix_12.g()) continue;
            ((faa_1)((Object)fix_12.c())).setContentProperty(null, null);
        }
        this.h.removeAll(arrayList);
        fyo2.removeProperty(this);
        if (this.l && this.q.isEmpty() && this.h.isEmpty() && this.j.isEmpty()) {
            if (this.k != null) {
                this.k.b(this);
            }
            fis_1.a().c(this);
        }
    }

    public void a(fit_1 fit_12) {
        fit_12.k = this;
        this.j.add(fit_12);
    }

    public void b(fit_1 fit_12) {
        this.j.remove(fit_12);
        if (this.l && this.h.isEmpty() && this.j.isEmpty() && this.k != null) {
            this.k.b(this);
        }
    }

    public fit_1 e(String string) {
        assert (string != null) : "On essaye de r\u00e9cup\u00e9rer une propri\u00e9t\u00e9 enfant avec un nom null !";
        for (int k = this.j.size() - 1; k >= 0; --k) {
            fit_1 fit_12 = this.j.get(k);
            if (!string.equals(fit_12.b())) continue;
            return fit_12;
        }
        return null;
    }

    private void a(fix_1<fyo> fix_12, Object object) {
        fiv_1 fiv_12 = fix_12.l();
        if (fiv_12 != null) {
            if (fiv_12.a == fix_12 && fiv_12.c.equals((Object)fiw_1.a)) {
                fiv_12.b = fiv_12.a.f() != null ? fiv_12.a.f().getResult(object) : object;
            }
        } else {
            this.i.offer(new fiv_1(fix_12, object, fiw_1.a));
        }
        fis_1.a().b(this);
    }

    private void b(fix_1<fyo> fix_12, Object object) {
        this.i.offer(new fiv_1(fix_12, object, fiw_1.b));
        fis_1.a().b(this);
    }

    private void c(fix_1<fyo> fix_12, Object object) {
        this.i.offer(new fiv_1(fix_12, object, fiw_1.c));
        fis_1.a().b(this);
    }

    private void d(fix_1<fyo> fix_12, Object object) {
        try {
            int n = fix_12.a();
            if (object instanceof String && 3355 != n && 3556653 != n && 111972721 != n && -691307374 != n ? fix_12.c().setXMLAttribute(fix_12.b(), (String)object) : fix_12.c().setPropertyAttribute(fix_12.b(), object)) {
                return;
            }
            Method method = fix_12.h();
            if (method == null || !fju_1.a(method, object)) {
                method = fix_12.d().a(fix_12.b(), object == null ? null : object.getClass());
            }
            if (method != null) {
                this.a(method, fix_12, object);
            } else {
                d.error((Object)("[" + this.e + "]Impossible de trouver la m\u00e9thode set" + fix_12.b() + " dans " + fix_12.c() + " avec la classe " + (object == null ? null : object.getClass())));
            }
        }
        catch (Throwable throwable) {
            d.error((Object)"Exception dans Property : ", throwable);
        }
    }

    private void e(fix_1<fyo> fix_12, Object object) {
        try {
            int n = fix_12.a();
            if (object instanceof String && 3355 != n && 3556653 != n && 111972721 != n && -691307374 != n ? fix_12.c().prependXMLAttribute(fix_12.b(), (String)object) : fix_12.c().prependPropertyAttribute(fix_12.b(), object)) {
                return;
            }
            Method method = fix_12.j();
            if (!fju_1.a(method, object)) {
                method = fix_12.d().d(fix_12.b(), object == null ? null : object.getClass());
            }
            if (method != null) {
                this.a(method, fix_12, object);
            } else {
                d.error((Object)("Impossible de trouver la m\u00e9thode prepend" + fix_12.b() + " avec la classe " + (object == null ? null : object.getClass())));
            }
        }
        catch (Throwable throwable) {
            d.error((Object)"Exception dans Property : ", throwable);
        }
    }

    private void f(fix_1<fyo> fix_12, Object object) {
        try {
            int n = fix_12.a();
            if (object instanceof String && 3355 != n && 3556653 != n && 111972721 != n && -691307374 != n ? fix_12.c().appendXMLAttribute(fix_12.b(), (String)object) : fix_12.c().appendPropertyAttribute(fix_12.b(), object)) {
                return;
            }
            Method method = fix_12.i();
            if (!fju_1.a(method, object)) {
                method = fix_12.d().c(fix_12.b(), object == null ? null : object.getClass());
            }
            if (method != null) {
                this.a(method, fix_12, object);
            } else {
                d.error((Object)("Impossible de trouver la m\u00e9thode append" + fix_12.b() + " dans " + fix_12.c() + " avec la classe " + (object == null ? null : object.getClass())));
            }
        }
        catch (Throwable throwable) {
            d.error((Object)"Exception dans Property : ", throwable);
        }
    }

    private void a(Method method, fix_1<fyo> fix_12, Object object) {
        try {
            if (method.getParameterTypes().length == 0) {
                return;
            }
            fju_1.a(method, (Object)fix_12.c(), new Object[]{object});
        }
        catch (IllegalArgumentException illegalArgumentException) {
            d.error((Object)("Exception illegalArgument : " + illegalArgumentException));
        }
        catch (Exception exception) {
            d.error((Object)("[" + exception.getClass().getSimpleName() + "] Erreur lors du InvokeMethodAccessor - Method=" + (method == null ? "null" : method.getName()) + " - PropertyClientData = " + fix_12 + " - Value = " + object));
        }
    }

    public void a(Object object, boolean bl) {
        if (!this.g) {
            this.g = true;
            fis_1.a().a(fjb_1.c, this);
        }
        if (!bl && object == this.f) {
            return;
        }
        this.f = object;
        if (this.r) {
            fis_1.a().a(fjb_1.d, this);
        }
        this.o();
        for (fix_1<fyo> fix_12 : this.h) {
            String string = fix_12.e();
            if (object instanceof ajf_1 && string != null) {
                ajf_1 ajf_12 = (ajf_1)object;
                Object object2 = ajf_12.b(string);
                this.a(fix_12, object2);
                continue;
            }
            this.a(fix_12, object);
        }
    }

    public void a(String string, Object object) {
        if (this.f instanceof ajf_1 && string != null) {
            ajf_1 ajf_12 = (ajf_1)this.f;
            ajf_12.a(string, object);
            for (fix_1<fyo> fix_12 : this.h) {
                String string2 = fix_12.e();
                if (string2 == null || !string2.equals(string)) continue;
                this.a(fix_12, object);
            }
        }
    }

    public void f(String string) {
        this.a(string, null);
    }

    public void a(String string, acy_2<Object> acy_22) {
        this.a(new String[]{string}, acy_22);
    }

    public void a(String[] stringArray, acy_2<Object> acy_22) {
        if (!(this.f instanceof ajf_1)) {
            return;
        }
        fix_1[] fix_1Array = new fix_1[this.h.size()];
        this.h.toArray(fix_1Array);
        int n = stringArray.length;
        for (int k = 0; k < n; ++k) {
            this.a(acy_22, fix_1Array, stringArray[k]);
            this.d(stringArray[k]);
        }
    }

    private void a(acy_2<Object> acy_22, fix_1<fyo>[] fix_1Array, String string) {
        ajf_1 ajf_12 = (ajf_1)this.f;
        int n = string != null ? string.hashCode() : 0;
        Object object = acy_22 != null ? acy_22.g(n) : null;
        boolean bl = object != null;
        for (fix_1<fyo> fix_12 : fix_1Array) {
            if (string == null || !string.equals(fix_12.e())) continue;
            if (!bl) {
                object = ajf_12.b(string);
                if (acy_22 != null) {
                    acy_22.a(n, object);
                }
                bl = true;
            }
            this.a(fix_12, object);
        }
    }

    @Override
    public void a(fak_2 fak_22) {
        if (this.f instanceof ajf_1) {
            ajf_1 ajf_12 = (ajf_1)this.f;
            for (fix_1<fyo> fix_12 : this.h) {
                if (fix_12.f() != fak_22) continue;
                String string = fix_12.e();
                if (string != null) {
                    this.a(fix_12, ajf_12.b(string));
                    continue;
                }
                this.a(fix_12, this.f);
            }
            this.o();
        } else if (this.g) {
            for (fix_1<fyo> fix_13 : this.h) {
                if (fix_13.f() != fak_22) continue;
                this.a(fix_13, this.f);
            }
        }
    }

    public void b(String string, Object object) {
        if (!(this.f instanceof ajf_1)) {
            return;
        }
        ajf_1 ajf_12 = (ajf_1)this.f;
        ajf_12.b(string, object);
        for (fix_1<fyo> fix_12 : this.h) {
            if (!fix_12.e().equals(string)) continue;
            this.c(fix_12, object);
        }
    }

    public void c(String string, Object object) {
        if (!(this.f instanceof ajf_1)) {
            return;
        }
        ajf_1 ajf_12 = (ajf_1)this.f;
        ajf_12.c(string, object);
        for (fix_1<fyo> fix_12 : this.h) {
            if (!fix_12.e().equals(string)) continue;
            this.b(fix_12, object);
        }
    }

    public void q() {
        if (this.f instanceof ajf_1) {
            this.s();
        } else {
            this.t();
        }
    }

    private void s() {
        if (this.f == null) {
            return;
        }
        ajf_1 ajf_12 = (ajf_1)this.f;
        String[] stringArray = ajf_12.d();
        if (stringArray == null) {
            return;
        }
        for (String string : stringArray) {
            if (string == null) continue;
            Object object = null;
            if (!ajf_12.a_(string)) {
                object = ajf_12.b(string);
            }
            for (int k = this.h.size() - 1; k >= 0; --k) {
                fix_1<fyo> fix_12 = this.h.get(k);
                String string2 = fix_12.e();
                if (string2 == null || !string2.equals(string)) continue;
                if (object == null) {
                    Method method = fix_12.d().b(fix_12.b(), null);
                    try {
                        object = method.invoke((Object)fix_12.c(), new Object[0]);
                        ajf_12.a(string, object);
                    }
                    catch (Exception exception) {
                        if (fix_12.c() == null) {
                            d.error((Object)("[fieldProviderSynchronize] PropertyClientData avec un element null : field = " + fix_12.e()));
                            continue;
                        }
                        if (method == null) {
                            d.error((Object)("[fieldProviderSynchronize] La m\u00e9thode " + fix_12.c().getClass().getName() + ".get" + fix_12.b() + "() n'existe pas, impossible de la charger"));
                            continue;
                        }
                        d.error((Object)"Exception during fieldProviderSynchronize", (Throwable)exception);
                    }
                    continue;
                }
                this.a(fix_12, object);
            }
        }
    }

    private void t() {
        if (this.h.isEmpty()) {
            return;
        }
        fix_1<fyo> fix_12 = this.h.get(this.h.size() - 1);
        Class<?> clazz = this.f == null ? null : this.f.getClass();
        Method method = fix_12.d().b(fix_12.b(), clazz);
        if (method == null) {
            return;
        }
        try {
            this.f = method.invoke((Object)fix_12.c(), new Object[0]);
            if (!this.g) {
                this.g = true;
                fis_1.a().a(fjb_1.c, this);
            }
            if (this.r) {
                fis_1.a().a(fjb_1.d, this);
            }
            this.o();
            for (int k = 0; k < this.h.size() - 1; ++k) {
                fix_1<fyo> fix_13 = this.h.get(k);
                this.a(fix_13, this.f);
            }
        }
        catch (Exception exception) {
            d.error((Object)("Impossible de synchroniser la propri\u00e9t\u00e9 " + this.e + " avec " + fix_12.c().getClass().getName() + ", l'attribut " + fix_12.b() + " est incompatible !"));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Property name=").append(this.e);
        if (this.p != null) {
            stringBuilder.append(" elementMap=").append(this.p.c());
        }
        stringBuilder.append(" value=").append(this.f);
        return stringBuilder.toString();
    }

    private static String a(fit_1 fit_12, String string) {
        return fit_12.e + b + string;
    }

    public boolean r() {
        return this.k != null;
    }
}

