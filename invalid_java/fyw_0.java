/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.ImmutableSet
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fyw
 */
public class fyw_0 {
    private static final Logger c = LoggerFactory.getLogger(fyw_0.class);
    public static final Logger a = LoggerFactory.getLogger((String)"theme");
    private static final boolean d = false;
    private boolean e = false;
    private HashMap<String, Integer> f = null;
    private PrintWriter g;
    private fku_1 h = null;
    private fkg_2 i = null;
    private fyo_0 j = null;
    private boolean k = false;
    private HashMap<String, ArrayList<Rectangle>> l;
    private final HashMap<String, azj_2> m = new HashMap();
    private fym_0 n = null;
    private static final boolean o = false;
    private String p;
    private String q;
    private String r;
    private final ArrayList<aqx_2> s = new ArrayList();
    private final HashMap<String, aqx_2> t = new HashMap();
    private final HashMap<String, aqx_2> u = new HashMap();
    private final HashMap<String, ayf_2> v = new HashMap();
    private final HashMap<String, ayp_1> w = new HashMap();
    private HashMap<String, List<String>> x = new HashMap();
    private final HashMap<String, String> y = new HashMap();
    private boolean z = false;
    private final List<fyh_0> A = new ArrayList<fyh_0>();
    private final fvE B = null;

    public fym_0 a() {
        return this.n;
    }

    public void a(fym_0 fym_02) {
        this.n = fym_02;
    }

    public fyo_0 b() {
        return this.j;
    }

    public void a(fyo_0 fyo_02) {
        this.j = fyo_02;
    }

    public void a(boolean bl) {
        this.e = bl;
        this.f = this.e ? new HashMap() : null;
    }

    public fyb_0 a(ath_2 ath_22, URL uRL, fya_0 fya_02, fyy_0 fyy_02, boolean bl, URL uRL2, String string, String string2) {
        Object object;
        fyw_0.a(ath_22, uRL);
        if (bl) {
            object = null;
            try {
                object = cd_0.a(uRL2, string + ".java");
            }
            catch (MalformedURLException malformedURLException) {
                c.error("MalformedURLException during parse", (Throwable)malformedURLException);
            }
            if (object != null) {
                try {
                    this.g = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(new File(((URL)object).getFile())), Charsets.UTF_8));
                }
                catch (FileNotFoundException fileNotFoundException) {
                    c.error("FileNotFoundException during parse", (Throwable)fileNotFoundException);
                }
                this.h = new fku_1(this.g, string, string2, ath_22.a());
            }
        }
        Stack<fyy_0> stack = new Stack<fyy_0>();
        stack.push(fyy_02);
        if (bl) {
            object = (fyb_0)this.a(this.h.l(), this.h.k(), fya_02, stack);
            this.h.j();
            this.h = null;
        } else {
            object = (fyb_0)fyw_0.a(ath_22.a(), null, fya_02, stack);
        }
        return object;
    }

    private static fyo a(aqx_2 aqx_22, fyb_0 fyb_02, fya_0 fya_02, Stack<fyy_0> stack) {
        fyb_0 fyb_03;
        fzy<?> fzy2 = fay_2.c().b(aqx_22.b());
        if (fzy2 == null) {
            c.error("Tag Inconnu : " + aqx_22.b());
            return null;
        }
        try {
            fyb_03 = (fyb_0)fzy2.h();
        }
        catch (Exception exception) {
            c.error("Erreur lors de l'instanciation du tag " + aqx_22.b() + ".", (Throwable)exception);
            return null;
        }
        fyb_03.preApplyAttributes(aqx_22, fyb_02, stack, fya_02);
        fyb_03.applyAttributes(aqx_22);
        fyb_03.postApplyAttributes(aqx_22, fyb_02, stack, fya_02);
        fyb_03.computeDocumentEntry(aqx_22, fyb_02, stack, fya_02);
        return fyb_03;
    }

    private fyb_0 b(aqx_2 aqx_22, fyb_0 object, fya_0 fya_02, Stack<fyy_0> stack) {
        Object object2;
        fyb_0 fyb_02;
        fyy_0 fyy_02;
        Object object3;
        boolean bl = false;
        aqx_2 aqx_23 = aqx_22;
        if ((aqx_22 = this.a(aqx_22)) == aqx_23) {
            aqx_23 = null;
        }
        String string = null;
        if (aqx_22.b().equalsIgnoreCase("themeElement")) {
            object3 = aqx_22.f("name");
            if (object3 != null) {
                string = object3.c();
            }
            bl = true;
        }
        if (string != null && object != null && (object3 = object instanceof fvE ? (fvE)object : ((fyo)object).getParentOfType(fvE.class)) != null) {
            if ((object3 = ((fvE)object3).getWidgetByThemeElementName(string, false)) != null) {
                object = object3;
            } else if (!(object instanceof fvE)) {
                return null;
            }
        }
        object3 = aqx_22.k();
        if (bl) {
            Object object4 = object3;
            for (int k = 0; k < ((ArrayList)object4).size(); ++k) {
                aqx_2 aqx_24 = (aqx_2)((ArrayList)object4).get(k);
                if (aqx_24.b().equals("#text") || aqx_24.b().equals("#comment")) continue;
                this.b(aqx_24, (fyb_0)object, fya_02, stack);
            }
            if (aqx_23 != null) {
                ArrayList<? extends aqx_2> arrayList = aqx_23.k();
                for (int k = 0; k < arrayList.size(); ++k) {
                    aqx_2 aqx_25 = arrayList.get(k);
                    if (aqx_25.b().equals("#text") || aqx_25.b().equals("#comment")) continue;
                    this.b(aqx_25, (fyb_0)object, fya_02, stack);
                }
            }
            return null;
        }
        String string2 = aqx_22.f("id") != null && !this.k ? aqx_22.f("id").c().trim() : null;
        fyy_0 fyy_03 = fyy_02 = stack != null ? stack.peek() : null;
        if (fyy_02 == null && object != null) {
            fyy_02 = ((fyb_0)object).getElementMap();
        }
        String string3 = fyy_02 == null ? "" : fyy_02.c();
        fzy<?> fzy2 = fay_2.c().b(aqx_22.b());
        if (fzy2 == null) {
            c.error("Tag Inconnu : " + aqx_22.b());
            return null;
        }
        try {
            fyb_02 = (fyb_0)fzy2.h();
        }
        catch (Exception exception) {
            c.error("Erreur lors de l'instanciation du tag " + aqx_22.b() + ".", (Throwable)exception);
            return null;
        }
        if (fyb_02 instanceof fqn && (object2 = aqx_22.f("ref")) != null) {
            ((fqn)fyb_02).setRenderer(this.v.get(object2.c()));
        }
        if (fyb_02 instanceof fqj && object != null && (object2 = object instanceof fvE ? (fvE)object : ((fyo)object).getParentOfType(fvE.class)) != null && ((fvE)object2).mustReuseCurrentAppearanceDuringParsing() && ((fvE)object2).getAppearance() != null) {
            fyb_02.destroySelfFromParent();
            fyb_02 = ((fvE)object2).getAppearance();
        }
        fyb_02.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fyb_02);
        }
        if (aqx_22.b().equalsIgnoreCase("form")) {
            object2 = null;
            aqx_2 aqx_26 = aqx_22.f("id");
            if (aqx_26 != null) {
                object2 = aqx_26.c();
            } else {
                c.warn("Attention : l'id du formulaire est nulle.");
            }
            fya_02.a(string3 + "." + (String)object2, (fzz)fyb_02);
        }
        object2 = null;
        this.a(fyb_02, null, null, fzy2, aqx_22.l(), false, fya_02, fyy_02);
        if (object != null) {
            if (((fyb_0)object).isValidAdd(fyb_02)) {
                ((fyo)object).addFromXML(fyb_02);
            } else if (fyb_02.getParent() == null) {
                fyb_02.destroySelfFromParent();
                return null;
            }
        }
        fyb_02.onAttributesInitialized();
        int n = ((ArrayList)object3).size();
        for (int k = 0; k < n; ++k) {
            aqx_2 aqx_27 = (aqx_2)((ArrayList)object3).get(k);
            if (aqx_27.b().equals("#text") || aqx_27.b().equals("#comment")) continue;
            if (aqx_27.f("include") != null) {
                String string4 = aqx_27.f("includeId").c();
                if (string4 == null) {
                    c.error("Pas d'id pour le tag Include, impossible de l'ajouter");
                    continue;
                }
                fyy_0 fyy_04 = fya_02.a(string3 + "." + string4);
                fyy_04.a(fyy_02);
                stack.push(fyy_04);
                this.b(aqx_27, fyb_02, fya_02, stack);
                stack.pop();
                continue;
            }
            this.b(aqx_27, fyb_02, fya_02, stack);
        }
        fyb_02.onChildrenAdded();
        if (aqx_22.b().equals("form")) {
            fya_02.f(string3 + "." + aqx_22.f("id").c());
        }
        return fyb_02;
    }

    /*
     * WARNING - void declaration
     */
    private fyo a(String string, String string2, fya_0 fya_02, Stack<fyy_0> stack) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        fyo fyo2;
        fzy<?> fzy2;
        fyy_0 fyy_02;
        Object object5;
        aqx_2 aqx_22 = (aqx_2)this.h.a(string);
        Object object7 = (fyo)this.h.a(string2);
        String string3 = string2;
        boolean bl = this.h.d();
        if (bl) {
            this.h.a(aqx_22, (fyo)object7, string2);
        }
        this.h.a(String.class);
        this.h.a(fya_0.class);
        this.h.a(fyy_0.class);
        this.h.a(fay_2.class);
        this.h.a(fvE.class);
        this.h.a(fzy.class);
        this.h.a(fpm_0.class);
        this.h.a(fqn.class);
        boolean bl2 = false;
        aqx_2 aqx_23 = aqx_22;
        aqx_22 = this.a(aqx_22);
        if (aqx_22 == aqx_23) {
            aqx_23 = null;
        }
        String string4 = null;
        if (aqx_22.b().equalsIgnoreCase("themeElement")) {
            aqx_2 aqx_24 = aqx_22.f("name");
            if (aqx_24 != null) {
                string4 = aqx_24.c();
            }
            bl2 = true;
        }
        boolean bl3 = false;
        if (string4 != null && object7 != null) {
            this.h.e();
            String object62 = this.h.b();
            if (object7 instanceof fvE) {
                object5 = (fvE)object7;
                this.h.a(new fkw_1(fvE.class, object62, string2));
            } else {
                object5 = ((fyo)object7).getParentOfType(fvE.class);
                this.h.a(new fkw_1(fvE.class, object62, string2 + ".getParentOfType(Widget.class)"));
            }
            if (object5 != null) {
                if ((object5 = ((fvE)object5).getWidgetByThemeElementName(string4, true)) != null) {
                    bl3 = true;
                    object7 = object5;
                    string2 = this.h.b();
                    this.h.a(string2, object5);
                    this.h.a(new fkw_1(fyb_0.class, string2, object62 + ".getWidgetByThemeElementName(\"" + string4 + "\", false)"));
                    this.h.a(new fkz_1("if (" + string2 + " != null) {"));
                } else if (!(object7 instanceof fvE)) {
                    this.h.g();
                    this.h.f();
                    if (bl) {
                        this.h.h();
                    }
                    return null;
                }
            }
            this.h.f();
        }
        if (bl2) {
            String string5;
            for (aqx_2 aqx_24 : aqx_22.k()) {
                if (aqx_24.b().equals("#text") || aqx_24.b().equals("#comment")) continue;
                string5 = this.h.b();
                this.h.a(string5, aqx_24);
                this.a(string5, string2, fya_02, stack);
            }
            if (aqx_23 != null) {
                for (aqx_2 aqx_25 : aqx_23.k()) {
                    if (aqx_25.b().equals("#text") || aqx_25.b().equals("#comment")) continue;
                    string5 = this.h.b();
                    this.h.a(string5, aqx_25);
                    this.a(string5, string2, fya_02, stack);
                }
            }
            if (bl3) {
                this.h.a(new fkz_1("}"));
            }
            if (bl) {
                this.h.h();
            }
            return null;
        }
        object5 = aqx_22.f("id") != null ? aqx_22.f("id").c().trim() : null;
        Object var14_19 = null;
        fyy_0 fyy_03 = fyy_02 = stack != null ? stack.peek() : null;
        if (fyy_02 == null && object7 != null) {
            fyy_02 = ((fyo)object7).getParentOfType(fyb_0.class).getElementMap();
        }
        String string6 = fyy_02 == null ? "" : fyy_02.c();
        if (object5 != null) {
            String string7 = this.h.b();
            this.h.a(new fkw_1(String.class, string7, "\"" + (String)object5 + "\""));
        }
        if ((fzy2 = fay_2.c().b(aqx_22.b())) == null) {
            c.error("Unknown Tag : \"" + aqx_22.b() + "\" ( with parameters :" + aqx_22.l() + " ) for following class " + this.h.c());
            if (bl) {
                this.h.h();
            }
            return null;
        }
        String string8 = this.h.b();
        try {
            this.h.e();
            fyo2 = (fyo)fzy2.b(this.h, string8);
        }
        catch (Exception exception) {
            c.error("Erreur lors de l'instanciation du tag " + aqx_22.b() + ".", (Throwable)exception);
            this.h.f();
            if (bl) {
                this.h.h();
            }
            return null;
        }
        if (fyo2 instanceof fqj && object7 != null) {
            object4 = (fqj)fyo2;
            object3 = this.h.b();
            object2 = null;
            if (object7 instanceof fvE) {
                object = (fvE)object7;
                object2 = new fkw_1(fvE.class, (String)object3, string2);
            } else {
                object = ((fyo)object7).getParentOfType(fvE.class);
                object2 = new fkw_1(fvE.class, (String)object3, string2 + ".getParentOfType(Widget.class)");
            }
            if (object != null && ((fvE)object).getAppearance() != null) {
                ((fyb_0)object4).destroySelfFromParent();
                fyo2 = ((fvE)object).getAppearance();
                this.h.g();
                this.h.f();
                this.h.a((fkt_1)object2);
                this.h.a(new fkw_1(fyo2.getClass(), string8, (String)object3 + ".getAppearance()"));
            }
        }
        this.h.f();
        if (fyo2 instanceof fqn && (object4 = aqx_22.f("ref")) != null) {
            this.h.a(new fkz_1("((FontElement)" + string8 + ").setRenderer(Xulor.getInstance().getDocumentParser().getFont(\"" + object4.c() + "\"));"));
            ((fqn)fyo2).setRenderer(fpm_0.b().g().d(object4.c()));
        }
        if (fyo2.getElementType() == fyz.a) {
            object4 = (fyb_0)fyo2;
            this.h.a(new fkv_1(null, "setElementMap", string8, "elementMap"));
            ((fyb_0)object4).setElementMap(fyy_02);
            if (fyy_02 != null && object5 != null) {
                fyy_02.a((String)object5, (fyb_0)object4);
            }
            if (object5 != null) {
                void var14_21;
                this.h.a(new fkz_1("if (elementMap != null && " + (String)var14_21 + " != null)"));
                this.h.a(new fkv_1(null, "add", "elementMap", new String[]{var14_21, string8}));
            }
        }
        if (aqx_22.b().equalsIgnoreCase("form")) {
            object4 = null;
            object = aqx_22.f("id");
            if (object != null) {
                object4 = object.c();
            } else {
                c.warn("Attention : l'id du formulaire est nulle.");
            }
            object3 = string6 + "." + (String)object4;
            this.h.a(new fkz_1("env.openForm((elementMap != null ? elementMap.getId() : \"\") + \"." + (String)object4 + "\", (Form) " + string8 + ");"));
            fya_02.a((String)object3, (fzz)fyo2);
        }
        this.a(fyo2, string8, aqx_22.b(), fzy2, aqx_22.l(), true, fya_02, fyy_02);
        if (object7 != null) {
            if (!(object7 instanceof fyb_0) || ((fyb_0)object7).isValidAdd(fyo2)) {
                this.h.a(new fkv_1(null, "addBasicElement", string2, string8));
                ((fyo)object7).addBasicElement(fyo2);
            } else if (fyo2.getBasicParent() == null) {
                this.h.a(new fkv_1(null, "release", string8, new String[0]));
                fyo2.release();
                if (bl) {
                    this.h.h();
                }
                return null;
            }
        }
        fyo2.onAttributesInitialized();
        this.h.a(new fkv_1(null, "onAttributesInitialized", string8, new String[0]));
        this.h.a(string8, fyo2);
        if (fyo2 instanceof fvE && ((fvE)fyo2).getLazyLoadingMode().e && !((fvE)fyo2).isVisible()) {
            this.h.a(aqx_22, fyo2, string8);
            object4 = this.h.i();
            object = (fvE)fyo2;
            object3 = ((fvE)object).getLazyLoadingMode();
            ((fvE)object).setLazyLoadingMode(fqt_0.a);
            this.a(aqx_22, string6, fyy_02, string8, fya_02, stack);
            fyo2.onChildrenAdded();
            this.h.a(new fkv_1(null, "onChildrenAdded", string8, new String[0]));
            ((fvE)object).setLazyLoadingMode((fqt_0)((Object)object3));
            this.h.a(false);
            object2 = this.h.b();
            this.h.a(new fkw_1(fxr_0.class, (String)object2, "new " + fxr_0.class.getSimpleName() + "() { @" + Override.class.getName() + " public void visibilityIsAboutToChanged(final boolean currentVisible, final boolean futureVisible, final @" + NotNull.class.getName() + " " + Runnable.class.getName() + " visibilityApplier) { if (!futureVisible) return; " + string8 + ".removeVisibilityChangePreExecutor(); " + (((fqt_0)((Object)object3)).f ? string8 + ".addChildrenAddedListener(new " + fwp_0.class.getName() + "() { @" + Override.class.getName() + " public void onChildrenAdded() { " + string8 + ".removeChildrenAddedListener(this); " + (String)(((fqt_0)((Object)object3)).g ? string8 + ".setNeedsToPostProcess(); " + string8 + ".addPostProcessCallback(new " + fzc.class.getName() + "() { @" + Override.class.getName() + " public boolean onProcess(final int deltaTime) { if (!" + fyP.class.getName() + ".getInstance().containsProcessOfChildrenOf(" + string8 + ")) { " + string8 + ".removePostProcessCallback(this); visibilityApplier.run(); } return true; }} ); " : "visibilityApplier.run(); ") + "}} ); " + (String)object4 + "(" + string8 + "); " : (String)object4 + "(" + string8 + "); visibilityApplier.run(); ") + "} }"));
            this.h.a(new fkv_1(null, "setVisibilityChangePreExecutor", string8, new String[]{object2}));
        } else {
            this.a(aqx_22, string6, fyy_02, string8, fya_02, stack);
            fyo2.onChildrenAdded();
            this.h.a(new fkv_1(null, "onChildrenAdded", string8, new String[0]));
        }
        if (aqx_22.b().equals("form")) {
            object4 = string6 + "." + aqx_22.f("id").c();
            this.h.a(new fkz_1("env.closeForm((elementMap != null ? elementMap.getId() : \"\") + \"." + aqx_22.f("id").c() + "\");"));
            fya_02.f((String)object4);
        }
        if (bl) {
            this.h.h();
        }
        return fyo2;
    }

    private void a(aqx_2 aqx_22, String string, fyy_0 fyy_02, String string2, fya_0 fya_02, Stack<fyy_0> stack) {
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (aqx_23.b().equals("#text") || aqx_23.b().equals("#comment")) continue;
            String string3 = this.h.a((Object)aqx_23);
            if (aqx_23.f("include") != null) {
                String string4 = aqx_23.f("includeId").c();
                if (string4 == null) {
                    c.error("Pas d'id pour le tag Include, impossible de l'ajouter");
                    continue;
                }
                String string5 = this.h.b();
                this.h.a(new fkw_1(fyy_0.class, string5, "elementMap"));
                fyy_0 fyy_03 = fya_02.a(string + "." + string4);
                this.h.a(new fkw_1(fyy_0.class, "elementMap", "env.createElementMap((elementMap != null ? elementMap.getId() : \"\") + \"." + string4 + "\")"));
                fyy_03.a(fyy_02);
                this.h.a(new fkv_1(null, "setParentElementMap", "elementMap", string5));
                stack.push(fyy_03);
                this.h.a(new fkv_1(null, "push", "elementMaps", "elementMap"));
                this.a(string3, string2, fya_02, stack);
                stack.pop();
                this.h.a(new fkv_1(null, "pop", "elementMaps", new String[0]));
                this.h.a(new fkw_1(fyy_0.class, "elementMap", "elementMaps.peek()"));
                continue;
            }
            this.a(string3, string2, fya_02, stack);
        }
    }

    public static void a(fyo fyo2, fzy<?> fzy2, String string, String string2) {
        Method method = fzy2.b(string);
        if (method != null) {
            Class<?> clazz = method.getParameterTypes()[0];
            Object var6_6 = null;
            try {
                var6_6 = fze.a().a(clazz, string2);
                method.invoke((Object)fyo2, var6_6);
            }
            catch (Exception exception) {
                c.error("Probl\u00e8me \u00e0 l'invoke :" + method.getName() + ":" + var6_6, (Throwable)exception);
            }
        }
    }

    private void a(fyo fyo2, String string, String string2, fzy<?> fzy2, List<? extends aqx_2> list, boolean bl, fya_0 fya_02, fyy_0 fyy_02) {
        if (bl) {
            this.h.a(Class.class);
            this.h.a(Method.class);
            this.h.a(fzd.class);
            this.h.a(fze.class);
        }
        boolean bl2 = fyo2 instanceof fqv;
        String string3 = null;
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            boolean bl3;
            aqx_2 aqx_22 = list.get(k);
            String string4 = aqx_22.b();
            if ("id".equals(string4) || "ref".equals(string4) || "templateId".equals(string4) || "templateRef".equals(string4) || "since".equals(string4)) continue;
            if (bl2 && "texture".equalsIgnoreCase(string4)) {
                string3 = aqx_22.c();
            }
            if ((bl3 = fyo2.setXMLAttribute(string4, aqx_22.c())) && !bl) continue;
            Method method = fzy2.a(string4, null, fyo.class);
            String string5 = null;
            if (method != null) {
                Class<?> clazz = method.getParameterTypes()[0];
                String string6 = null;
                fzd<?> fzd2 = fze.a().b(clazz);
                String string7 = null;
                if (fzd2 == null) continue;
                if (bl && !fzd2.b()) {
                    String string8 = this.h.b();
                    this.h.a(new fkw_1(fzy.class, string8, "XulorTagLibrary.getInstance().getFactory(\"" + string2 + "\")"));
                    string5 = this.h.b();
                    this.h.a(new fkw_1(Method.class, string5, string8 + ".guessSetter(\"" + string4 + "\")"));
                    string7 = this.h.b();
                    string6 = this.h.b();
                    this.h.a(new fkw_1(Class.class, string6, string5 + ".getParameterTypes()[0]"));
                    this.h.a(new fkw_1(fzd.class, string7, "ConverterLibrary.getInstance().getConverter(" + string6 + ")"));
                }
                Object var23_23 = null;
                try {
                    if (bl) {
                        String string9 = null;
                        if (fzd2.b()) {
                            string9 = fzd2.a(this.h, this, clazz, aqx_22.c(), fya_02);
                        } else {
                            var23_23 = fzd2.b(clazz, aqx_22.c());
                            string9 = this.h.b();
                            this.h.a(new fkw_1(clazz, string9, string7 + ".convert(" + string6 + ", \"" + aqx_22.c() + "\")"));
                        }
                        this.h.a(new fkv_1(method.getDeclaringClass(), method.getName(), string, string9));
                    }
                    var23_23 = fzd2.b(clazz, aqx_22.c());
                    method.invoke((Object)fyo2, var23_23);
                }
                catch (Exception exception) {
                    c.error("Probl\u00e8me \u00e0 l'invoke :" + method.getName() + ":" + var23_23, (Throwable)exception);
                }
                continue;
            }
            if (!bl || string4.equals("atlas") || string4.equals("includeId") || string4.equals("include") || string4.equals("xmlns:xsi") || string4.equals("xsi:noNamespaceSchemaLocation")) continue;
            throw new IllegalArgumentException("Can't find the attribute " + string4 + " (or its setter) for class " + fyo2.getClass().getSimpleName() + " tagElement=" + string2);
        }
    }

    public static void a(ath_2 ath_22, URL uRL) {
        ati_2 ati_22 = ath_22.a();
        Stack<URL> stack = new Stack<URL>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        stack.push(uRL);
        aqx_2 aqx_22 = fyw_0.a(ati_22, stack, hashMap);
        if (aqx_22 != null) {
            ath_22.a((ati_2)aqx_22);
        }
    }

    public static aqx_2 a(aqx_2 aqx_22, Stack<URL> stack, HashMap<String, String> hashMap) {
        int n;
        Object object;
        aqx_2 aqx_232;
        Object object2;
        if (aqx_22 == null) {
            return null;
        }
        Object object3 = aqx_22;
        int n2 = stack.size();
        if ("template".equalsIgnoreCase(aqx_22.b())) {
            object2 = aqx_22.f("path");
            if (object2 != null) {
                for (aqx_2 aqx_232 : aqx_22.l()) {
                    if (((atj_2)aqx_232).b().equals("path")) continue;
                    hashMap.put(((atj_2)aqx_232).b(), ((atj_2)aqx_232).c());
                }
                object = aqx_22.d("templateElement");
                aqx_232 = fyw_0.a(object2.c(), stack, false);
                fyw_0.a(aqx_232, aqx_22, (ArrayList<aqx_2>)object, false, hashMap);
                object3 = aqx_232;
            }
        } else if ("include".equalsIgnoreCase(aqx_22.b()) && (object2 = aqx_22.f("path")) != null) {
            object = fyw_0.a(object2.c(), stack, true);
            aqx_232 = aqx_22.f("id");
            object3 = object;
            object3.c(new atj_2("include", ""));
            if (aqx_232 != null) {
                object3.c(new atj_2("includeId", aqx_232.c()));
            }
        }
        object2 = new ArrayList();
        for (n = object3.k().size() - 1; n >= 0; --n) {
            aqx_232 = object3.k().get(n);
            ((ArrayList)object2).add(aqx_232);
        }
        for (n = ((ArrayList)object2).size() - 1; n >= 0; --n) {
            object3.b((aqx_2)((ArrayList)object2).get(n));
        }
        for (n = ((ArrayList)object2).size() - 1; n >= 0; --n) {
            aqx_232 = (aqx_2)((ArrayList)object2).get(n);
            if (aqx_232.b().equals("#text") || aqx_232.b().equals("#comment")) continue;
            aqx_2 aqx_24 = fyw_0.a(aqx_232, stack, hashMap);
            if (aqx_24 != null) {
                object3.a(aqx_24);
                continue;
            }
            object3.a(aqx_232);
        }
        while (stack.size() > n2) {
            stack.pop();
        }
        if (object3 == aqx_22) {
            return null;
        }
        return object3;
    }

    public static void a(aqx_2 aqx_22, aqx_2 aqx_23, ArrayList<aqx_2> arrayList, boolean bl, HashMap<String, String> hashMap) {
        Object object;
        if (aqx_22 == null || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (aqx_2 aqx_24 : aqx_22.l()) {
            Matcher matcher = frc_0.a.matcher(((atj_2)aqx_24).c());
            while (matcher.find()) {
                String string = hashMap.get(matcher.group(2));
                if (string == null) continue;
                ((atj_2)aqx_24).b(Cz.a(((atj_2)aqx_24).c(), matcher.group(1), string));
            }
        }
        aqx_2 aqx_25 = aqx_22.f("templateId");
        if (aqx_25 != null) {
            aqx_2 aqx_24;
            aqx_24 = null;
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                object = arrayList.get(k);
                aqx_2 aqx_26 = object.f("templateRef");
                if (!aqx_25.c().equalsIgnoreCase(aqx_26.c())) continue;
                aqx_24 = object;
                break;
            }
            if (aqx_24 != null) {
                aqx_2 aqx_27 = aqx_24.f("templateElementIgnore");
                if (aqx_27 != null && aqx_27.d()) {
                    aqx_23.b(aqx_22);
                    return;
                }
                ArrayList<? extends aqx_2> arrayList2 = aqx_24.k();
                int n2 = arrayList2.size();
                for (int k = 0; k < n2; ++k) {
                    aqx_22.a(arrayList2.get(k));
                }
                object = aqx_24.l();
                int n3 = ((ArrayList)object).size();
                for (n2 = 0; n2 < n3; ++n2) {
                    aqx_2 aqx_28 = (aqx_2)((ArrayList)object).get(n2);
                    String string = aqx_28.b();
                    if (string.equals("#text") || string.equals("#comment") || "templateRef".equalsIgnoreCase(string)) continue;
                    aqx_2 aqx_29 = aqx_22.f(string);
                    if (aqx_29 != null) {
                        aqx_22.d(aqx_29);
                    }
                    aqx_22.c(aqx_28);
                }
            }
            aqx_22.d(aqx_25);
        }
        boolean bl2 = aqx_22.b().equalsIgnoreCase("templateElement");
        if (bl && bl2) {
            return;
        }
        ArrayList<? extends aqx_2> arrayList3 = aqx_22.k();
        for (int k = arrayList3.size() - 1; k >= 0; --k) {
            object = arrayList3.get(k);
            if (object.b().equals("#text") || object.b().equals("#comment")) continue;
            boolean bl3 = object.b().equalsIgnoreCase("template");
            fyw_0.a((aqx_2)object, aqx_22, arrayList, bl3, hashMap);
        }
    }

    public static aqx_2 a(String string, Stack<URL> stack, boolean bl) {
        URL uRL = null;
        ath_2 ath_22 = null;
        try {
            uRL = cd_0.a(stack.peek(), string);
            if (bl) {
                stack.push(uRL);
            }
            ath_22 = fpm_0.b(uRL);
        }
        catch (Exception exception) {
            c.error("Impossible de charger le template d'url : " + stack.peek() + string, (Throwable)exception);
        }
        if (ath_22 != null) {
            return ath_22.a();
        }
        return null;
    }

    public aqx_2 a(aqx_2 aqx_22) {
        if (aqx_22 == null) {
            return null;
        }
        aqx_2 aqx_23 = aqx_22.f("ref");
        aqx_2 aqx_24 = null;
        if (aqx_23 != null) {
            aqx_24 = this.t.get(aqx_23.c().toUpperCase());
        }
        if (aqx_24 == null) {
            return aqx_22;
        }
        return aqx_24;
    }

    public aqx_2 a(aqx_2 aqx_22, String string) {
        if (aqx_22 == null) {
            c.error("Probl\u00e8me lors de la recherche de ThemeElement : entry est null");
            return null;
        }
        if (string == null) {
            c.error("Probl\u00e8me lors de la recherche de ThemeElement : name est null");
            return null;
        }
        ArrayList<aqx_2> arrayList = fyw_0.b(aqx_22 = this.a(aqx_22), "themeElement");
        if (arrayList != null) {
            for (aqx_2 aqx_23 : arrayList) {
                aqx_2 aqx_24 = (aqx_23 = this.a(aqx_23)).f("name");
                if (aqx_24 == null || !string.equalsIgnoreCase(aqx_24.c())) continue;
                return aqx_23;
            }
        }
        return null;
    }

    private static boolean b(String string, String string2) {
        afe_1 afe_12 = azk_2.d(string);
        afe_1 afe_13 = azk_2.d(string2);
        if (afe_12 == null || afe_13 == null) {
            return false;
        }
        return afe_13.a() >= afe_12.a() && afe_13.b() >= afe_12.b();
    }

    private ArrayList<fyx_0> c(aqx_2 aqx_22, String string) {
        ArrayList<fyx_0> arrayList = new ArrayList<fyx_0>();
        this.a(aqx_22, arrayList, string);
        return arrayList;
    }

    private void a(aqx_2 aqx_22, ArrayList<fyx_0> arrayList, String string) {
        if (aqx_22 == null) {
            c.error("Probl\u00e8me lors de la recherche de ThemeElement : entry est null");
            return;
        }
        aqx_2 aqx_23 = (aqx_22 = this.a(aqx_22)).f("type");
        if (aqx_23 == null) {
            c.warn("type inconnu pour " + string);
            return;
        }
        fzy<?> fzy2 = fay_2.c().b(aqx_23.c());
        fyo fyo2 = null;
        try {
            fyo2 = (fyo)fzy2.h();
        }
        catch (Exception exception) {
            c.warn("Probl\u00e8me \u00e0 la g\u00e9n\u00e9ration de " + aqx_23.c(), (Throwable)exception);
            return;
        }
        arrayList.add(new fyx_0(fyo2, string, aqx_22));
        ArrayList<aqx_2> arrayList2 = fyw_0.b(aqx_22, "themeElement");
        if (arrayList2 != null) {
            for (aqx_2 aqx_24 : arrayList2) {
                aqx_2 aqx_25;
                aqx_2 aqx_26 = this.a(aqx_24);
                if (aqx_26 == aqx_22 || (aqx_25 = aqx_26.f("name")) == null) continue;
                String string2 = aqx_25.c();
                this.a(aqx_26, arrayList, string + "$" + Cz.b(string2));
            }
        }
    }

    public static ArrayList<aqx_2> b(aqx_2 aqx_22, String string) {
        ArrayList<aqx_2> arrayList = new ArrayList<aqx_2>();
        if (aqx_22.b().equalsIgnoreCase(string)) {
            arrayList.add(aqx_22);
        }
        for (aqx_2 aqx_23 : aqx_22.k()) {
            ArrayList<aqx_2> arrayList2 = aqx_23.d(string);
            if (arrayList2 == null) continue;
            arrayList.addAll(arrayList2);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList;
    }

    public void a(fyh_0 fyh_02) {
        this.A.add(fyh_02);
    }

    public void b(fyh_0 fyh_02) {
        this.A.remove(fyh_02);
    }

    public void c() {
        this.d();
        this.m();
        for (fyh_0 fyh_02 : this.A) {
            fyh_02.e();
        }
    }

    public void d() {
        this.s.clear();
        this.t.clear();
        this.u.clear();
        this.v.clear();
        this.x.clear();
        this.y.clear();
    }

    private void m() {
        this.r = fyu.a().b();
        if (this.j != null && this.n != null) {
            fys_0.a.b();
            this.o();
            fys_0.a.c();
            this.n();
            return;
        }
        fys_0.a.b();
        this.p();
        this.n();
    }

    private void n() {
        ath_2 ath_22;
        if (this.r == null) {
            return;
        }
        URL uRL = null;
        try {
            uRL = new URL(this.r + "theme/colors/colors.xml");
        }
        catch (MalformedURLException malformedURLException) {
            a.error("[THEME] Error when opening custom color file '" + this.r + "theme/colors/colors.xml'", (Throwable)malformedURLException);
        }
        if (uRL == null) {
            return;
        }
        if (!cd_0.a(uRL)) {
            a.error("[THEME] Error when opening custom color file: file '" + uRL.getPath() + "' does not exist");
            return;
        }
        try {
            ath_22 = fpm_0.b(uRL);
        }
        catch (Exception exception) {
            c.error("[THEME] Error when loading colors of file '" + uRL.getPath() + "'", (Throwable)exception);
            return;
        }
        this.l(ath_22.a());
    }

    public void a(String string) {
        new fyW(this, string).b();
    }

    public void a(fym_0 fym_02, fyo_0 fyo_02, String string) {
        this.n = fym_02;
        this.j = fyo_02;
        this.q = string;
        this.s.clear();
        this.m();
    }

    public void a(String string, String string2, fka_2 fka_22) {
        this.p = string;
        this.q = string2;
        this.r = null;
        this.s.clear();
        this.p();
        this.a(fka_22);
    }

    public void a(String string, String string2) {
        this.p = string;
        this.q = string2;
        this.s.clear();
        this.m();
    }

    public fvE e() {
        return this.B;
    }

    public String f() {
        if (this.e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Styles non utilis\u00e9s : \n");
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
                if (entry.getValue() != 0) continue;
                arrayList.add(entry.getKey());
            }
            Collections.sort(arrayList);
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                stringBuilder.append((String)arrayList.get(k)).append("\n");
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public void a(fvE fvE2, String string) {
        if (this.n != null) {
            this.c(fvE2, string);
        } else {
            this.b(fvE2, string);
        }
    }

    private void b(fvE fvE2, String string) {
        aqx_2 aqx_22;
        String[] stringArray = Cz.e(string, "$");
        if (stringArray.length == 1) {
            stringArray[0] = fvE2.getStyleTag() + stringArray[0];
        }
        if ((aqx_22 = this.u.get(stringArray[0].toUpperCase())) == null) {
            aqx_22 = this.u.get(fvE2.getStyleTag().toUpperCase());
        } else if (this.e) {
            String string2 = stringArray[0].toUpperCase();
            Integer n = this.f.get(string2);
            this.f.put(string2, n + 1);
        }
        if (this.h != null || aqx_22 == null) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.c("themeElement");
        for (int k = 1; k < stringArray.length; ++k) {
            aqx_23 = this.a(aqx_23, stringArray[k]);
        }
        if (aqx_23 != null) {
            Stack<fyy_0> stack = new Stack<fyy_0>();
            stack.push(fvE2.getElementMap());
            this.k = true;
            this.b(aqx_23, fvE2, fvE2.getElementMap().a(), stack);
            this.k = false;
        }
    }

    private void c(fvE fvE2, String string) {
        assert (this.n != null) : "m_styleProvider est null !";
        string = string.contains("$") ? string.toUpperCase() : fvE2.getStyleTag().toUpperCase() + string.toUpperCase();
        fyn_0 fyn_02 = this.n.a(string);
        if (fyn_02 == null && (fyn_02 = this.n.a(string = fvE2.getStyleTag().toUpperCase())) == null) {
            return;
        }
        fyn_02.a(fvE2.getElementMap(), this, fvE2);
    }

    public Stream<String> b(@NotNull String string) {
        String string2 = string.toUpperCase();
        return this.u.entrySet().stream().filter(entry -> ((String)entry.getKey()).startsWith(string2)).map(entry -> ((aqx_2)entry.getValue()).g("style") ? ((aqx_2)entry.getValue()).f("style").c() : "");
    }

    private void o() {
        assert (this.j != null && this.n != null) : "loadInitDirect : variable mal initialis\u00e9e !";
        this.j.g(this);
    }

    private void p() {
        new fyW(this, this.p).a();
    }

    void b(aqx_2 aqx_22) {
        if (aqx_22.b().equals("#text") || aqx_22.b().equals("#comment")) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.f("id");
        if (aqx_23 == null) {
            return;
        }
        this.t.put(aqx_23.c().toUpperCase(), aqx_22);
    }

    @NotNull
    private static String k(aqx_2 aqx_22) {
        String string;
        aqx_2 aqx_23 = aqx_22.f("type");
        if (aqx_23 == null || aqx_23.c() == null || aqx_23.c().isBlank()) {
            throw new IllegalArgumentException("Theme component " + aqx_22 + " does not have \"type\" attribute");
        }
        aqx_2 aqx_24 = aqx_22.f("style");
        if (aqx_24 == null || aqx_24.c() == null || aqx_24.c().isBlank()) {
            string = "";
        } else {
            String string2 = aqx_24.c();
            string = Cz.b(string2);
        }
        return aqx_23.c() + string;
    }

    void c(aqx_2 aqx_22) {
        String string = fyw_0.k(aqx_22).toUpperCase();
        this.u.put(string, aqx_22);
        if (this.e) {
            this.f.put(string, 0);
        }
    }

    private void l(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("colors")) {
            a.error("[THEME] Invalid color file, main node should be named 'colors'");
            return;
        }
        for (aqx_2 aqx_23 : aqx_22.k()) {
            aqx_2 aqx_24;
            String string = aqx_23.b();
            if (!string.equalsIgnoreCase("color") || (aqx_24 = aqx_23.f("id")) == null) continue;
            this.g(aqx_23);
        }
        fys_0.a.c();
    }

    private void a(fka_2 fka_22) {
        new fyV(this, this.p, fka_22).a();
    }

    void a(fkg_2 fkg_22) {
        this.i = fkg_22;
    }

    void a(aqx_2 aqx_22, fka_2 fka_22) {
        URL uRL = null;
        try {
            uRL = gg_0.d("file:" + fka_22.e());
        }
        catch (MalformedURLException malformedURLException) {
            // empty catch block
        }
        fyn fyn2 = (fyn)fze.a().b(ays_2.class);
        fyn2.a(true);
        aqx_2 aqx_23 = aqx_22.c("themeElement");
        String string = fyw_0.k(aqx_22);
        String string2 = Cz.b(string);
        ArrayList<fyx_0> arrayList = this.c(aqx_23, string2);
        URL uRL2 = null;
        for (fyx_0 fyx_02 : arrayList) {
            string2 = fyx_02.b();
            try {
                uRL2 = cd_0.a(uRL, string2 + ".java");
            }
            catch (MalformedURLException malformedURLException) {
                c.error("MalformedURLException during createPrecompiledStyle", (Throwable)malformedURLException);
            }
            if (uRL2 == null) continue;
            try {
                this.g = new PrintWriter(new FileOutputStream(new File(uRL2.getFile())));
            }
            catch (FileNotFoundException fileNotFoundException) {
                c.error("FileNotFoundException during createPrecompiledStyle", (Throwable)fileNotFoundException);
            }
            this.h = new fkd_2(this.g, string2, fka_22.a(), fyx_02.c(), fyx_02.a(), this);
            Stack<fyy_0> stack = new Stack<fyy_0>();
            fyy_0 fyy_02 = new fyy_0("", new fya_0());
            stack.push(fyy_02);
            this.a(this.h.l(), this.h.k(), fyy_02.a(), stack);
            this.h.j();
            this.i.a(new fkz_1("m_setters.put(\"" + string2.toUpperCase() + "\", new " + string2 + "());"));
        }
        fyn2.a(false);
    }

    private static fyo f(String string) {
        int n = string.length();
        for (int k = 0; k < n; ++k) {
            fzy<?> fzy2 = fay_2.c().b(string.substring(0, k + 1));
            if (fzy2 == null) continue;
            try {
                return (fyo)fzy2.h();
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public void a(float f2, azj_2 azj_22, azj_2 azj_23, azj_2 azj_24, String string) {
        fip_1.e = f2;
        fip_1.b = azj_22;
        fip_1.a = azj_23;
        fip_1.c = azj_24;
        ayf_2 ayf_22 = this.v.get(string);
        if (ayf_22 != null) {
            fip_1.d = ayf_22.c();
        }
        if (fip_1.d == null) {
            fip_1.d = ayq_1.b(string);
        }
    }

    void d(aqx_2 aqx_22) {
        Object object;
        Object object2;
        azj_2 azj_22;
        if (!aqx_22.b().equalsIgnoreCase("tooltip")) {
            return;
        }
        float f2 = fip_1.e;
        aqx_2 aqx_23 = aqx_22.f("borderWidth");
        if (aqx_23 != null) {
            f2 = aqx_23.i();
        }
        azj_2 azj_23 = fip_1.b;
        fyg fyg2 = (fyg)fze.a().b(azj_2.class);
        aqx_23 = aqx_22.f("backgroundColor");
        if (aqx_23 != null) {
            azj_22 = azj_23;
            azj_23 = this.e(aqx_23.c());
            if (azj_23 == null) {
                azj_23 = fyg2.a(azj_2.class, aqx_23.c());
            }
            if (azj_23 == null) {
                azj_23 = azj_22;
            }
        }
        azj_22 = fip_1.a;
        aqx_23 = aqx_22.f("textColor");
        if (aqx_23 != null) {
            object2 = azj_22;
            azj_22 = this.e(aqx_23.c());
            if (azj_22 == null) {
                azj_22 = fyg2.a(azj_2.class, aqx_23.c());
            }
            if (azj_22 == null) {
                azj_22 = object2;
            }
        }
        object2 = fip_1.c;
        aqx_23 = aqx_22.f("borderColor");
        if (aqx_23 != null) {
            object = object2;
            object2 = this.e(aqx_23.c());
            if (object2 == null) {
                object2 = fyg2.a(azj_2.class, aqx_23.c());
            }
            if (object2 == null) {
                object2 = object;
            }
        }
        object = null;
        aqx_23 = aqx_22.f("font");
        if (aqx_23 != null) {
            object = aqx_23.c();
        }
        this.a(f2, azj_23, azj_22, (azj_2)object2, (String)object);
    }

    public void a(String string, String string3, String string4, String string5) {
        ayp_1 ayp_12 = this.w.get(string3);
        String string6 = ayp_12.a();
        Object object = "default";
        int n = (string6 = string6.toLowerCase()).lastIndexOf(47);
        if (n >= 0) {
            ++n;
        }
        object = gi_0.k(string6) + string4;
        ayq_1.a(this.q + string6.substring(0, n));
        String string7 = ayq_1.e((String)object);
        int n2 = ayq_1.a((String)object, string5);
        int n3 = ayq_1.d((String)object);
        ayn_2 ayn_22 = ayq_1.a(string7, n2, n3 += ayp_12.b(), ayp_12.c(), ayp_12.d(), false);
        this.v.put(string, ayi_2.a(ayn_22));
        this.x.compute(string3, (string2, list) -> {
            List list2 = list == null ? new ArrayList() : list;
            list2.add(string);
            return list2;
        });
    }

    void e(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("fontDefinition") || aqx_22.f("name") == null) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.f("name");
        String string = aqx_23.c();
        ArrayList<aqx_2> arrayList = aqx_22.d("desc");
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            aqx_2 aqx_24 = arrayList.get(k);
            aqx_2 aqx_25 = aqx_24.f("path");
            aqx_2 aqx_26 = aqx_24.f("lang");
            aqx_2 aqx_27 = aqx_24.f("size");
            aqx_2 aqx_28 = aqx_24.f("deltaX");
            aqx_2 aqx_29 = aqx_24.f("deltaY");
            if (aqx_25 == null || aqx_26 == null) continue;
            String string2 = aqx_25.c();
            String string3 = aqx_26.c();
            int n2 = aqx_27 != null ? Co.a((Object)aqx_27.c(), 0) : 0;
            int n3 = aqx_28 != null ? Co.a((Object)aqx_28.c(), 0) : 0;
            int n4 = aqx_29 != null ? Co.a((Object)aqx_29.c(), 0) : 0;
            this.a(string, string2, string3, n2, n3, n4);
        }
    }

    public void a(String string, String string2, String string3, int n, int n2, int n3) {
        ayp_1 ayp_12 = this.w.get(string);
        if (ayp_12 == null) {
            ayp_12 = new ayp_1(string);
            this.w.put(string, ayp_12);
        }
        ayp_12.a(string3, string2, n, n2, n3);
        if (!ayp_12.f()) {
            this.w.put(string, ayp_12);
        }
    }

    void f(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("font") || aqx_22.f("font") == null || aqx_22.f("id") == null) {
            return;
        }
        String string = null;
        if (aqx_22.f("modifier") != null) {
            string = aqx_22.f("modifier").c();
        }
        aqx_2 aqx_23 = aqx_22.f("definition");
        String string2 = aqx_22.f("font").c();
        String string3 = aqx_22.f("id").c();
        this.a(string3, aqx_23 != null ? aqx_23.c() : null, string2, string);
    }

    public void a(String string, azj_2 azj_22) {
        fys_0.a.a(string, azj_22);
    }

    public void a(fzb fzb2, azj_2 azj_22) {
        fys_0.a.a(fzb2, azj_22);
    }

    void g(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("color") || aqx_22.f("color") == null || aqx_22.f("id") == null) {
            return;
        }
        String string = aqx_22.f("id").c();
        aqx_2 aqx_23 = aqx_22.f("color");
        azj_2 azj_22 = fyg.d.a(aqx_23.c());
        if (azj_22 == null) {
            a.error("[THEME] Invalid color " + string + " - This value does not match color format : " + aqx_23.c());
            return;
        }
        this.a(string, azj_22);
        ati_2 ati_22 = new ati_2("color", null);
        ati_22.c(new atj_2("color", string));
        this.t.put(string.toUpperCase(), ati_22);
    }

    public void a(String string, frb_0 frb_02, int n, int n2) {
        try {
            BufferedImage bufferedImage = ImageIO.read(gg_0.d(this.q + string));
            fyt_0.a().a(frb_02, n, n2, bufferedImage);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Impossible de cr\u00e9er le curseur");
            if (string != null) {
                stringBuilder.append(" : ").append(string);
            }
            c.error(stringBuilder.toString(), (Throwable)exception);
        }
    }

    void h(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("cursor") || aqx_22.f("path") == null || aqx_22.f("id") == null) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.f("path");
        if (aqx_23 != null) {
            aqx_2 aqx_24 = aqx_22.f("x");
            aqx_2 aqx_25 = aqx_22.f("y");
            aqx_2 aqx_26 = aqx_22.f("type");
            int n = aqx_24 == null ? 0 : aqx_24.g();
            int n2 = aqx_25 == null ? 0 : aqx_25.g();
            frb_0 frb_02 = aqx_26 == null ? frb_0.a : frb_0.valueOf(aqx_26.c().toUpperCase());
            this.a(aqx_23.c(), frb_02, n, n2);
        }
    }

    public void a(frb_0 frb_02, int n, int n2, int n3, ArrayList<String> arrayList) {
        try {
            ArrayList<BufferedImage> arrayList2 = new ArrayList<BufferedImage>(arrayList.size());
            int n4 = arrayList.size();
            for (int k = 0; k < n4; ++k) {
                String string = arrayList.get(k);
                arrayList2.add(ImageIO.read(gg_0.d(this.q + string)));
            }
            fyt_0.a().a(frb_02, n, n2, n3, arrayList2);
        }
        catch (Exception exception) {
            c.error("Impossible de cr\u00e9er le curseur", (Throwable)exception);
        }
    }

    void i(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("animatedCursor") || aqx_22.f("id") == null) {
            return;
        }
        try {
            aqx_2 aqx_23 = aqx_22.f("x");
            aqx_2 aqx_24 = aqx_22.f("y");
            aqx_2 aqx_25 = aqx_22.f("delay");
            aqx_2 aqx_26 = aqx_22.f("type");
            int n = aqx_23 == null ? 0 : aqx_23.g();
            int n2 = aqx_24 == null ? 0 : aqx_24.g();
            int n3 = aqx_25 == null ? 500 : aqx_25.g();
            frb_0 frb_02 = aqx_26 == null ? frb_0.a : frb_0.valueOf(aqx_26.c().toUpperCase());
            ArrayList<aqx_2> arrayList = aqx_22.d("cursorFrame");
            ArrayList<String> arrayList2 = new ArrayList<String>(arrayList.size());
            int n4 = arrayList.size();
            for (int k = 0; k < n4; ++k) {
                aqx_2 aqx_27 = arrayList.get(k);
                aqx_2 aqx_28 = aqx_27.f("path");
                arrayList2.add(aqx_28.c());
            }
            this.a(frb_02, n, n2, n3, arrayList2);
        }
        catch (Exception exception) {
            c.error("Impossible de cr\u00e9er le curseur", (Throwable)exception);
        }
    }

    public void a(@NotNull String string, @NotNull String string2, boolean bl) {
        fyn fyn2 = (fyn)fze.a().b(ays_2.class);
        try {
            if (bl) {
                ays_2 ays_22 = fyn2.a(ays_2.class, string2);
                ays_22.k_();
            }
            this.y.put(string, string2);
        }
        catch (Exception exception) {
            c.error("Impossible de cr\u00e9er l'instance de texture", (Throwable)exception);
        }
    }

    public void a(@NotNull String string, @NotNull String string2, boolean bl, boolean bl2) {
        if (bl2 && this.b(string, string2, bl)) {
            return;
        }
        this.a(string, this.q + string2, bl);
    }

    private boolean b(@NotNull String string, @NotNull String string2, boolean bl) {
        if (this.r == null) {
            return false;
        }
        String string3 = gi_0.l(this.r + string2);
        for (String string4 : frc_0.b) {
            String string5 = string3 + string4;
            if (!this.a(string, string2, bl, string5)) continue;
            return true;
        }
        return false;
    }

    private boolean a(@NotNull String string, @NotNull String string2, boolean bl, String string3) {
        if (!cd_0.b(string3)) {
            c.debug("File " + string3 + " does not exist");
            return false;
        }
        if (!fyw_0.b(this.q + string2, string3)) {
            c.error("Invalid texture size : " + string3);
            return false;
        }
        ayu_2.a().b(auc_1.d(string3));
        c.info("Custom texture loaded : " + string3);
        this.a(string, string3, bl);
        return true;
    }

    void j(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("texture") || aqx_22.f("path") == null || aqx_22.f("id") == null) {
            return;
        }
        try {
            String string = aqx_22.f("id").c();
            String string2 = aqx_22.f("path").c();
            aqx_2 aqx_23 = aqx_22.f("permanent");
            boolean bl = aqx_23 != null && aqx_23.d();
            aqx_2 aqx_24 = aqx_22.f("overridable");
            boolean bl2 = aqx_24 != null && aqx_24.d();
            this.a(string, string2, bl, bl2);
        }
        catch (Exception exception) {
            c.error("Impossible de cr\u00e9er l'instance de texture", (Throwable)exception);
        }
    }

    public void g() {
        for (aqx_2 aqx_22 : this.s) {
            this.j(aqx_22);
        }
        this.z = false;
    }

    public boolean h() {
        return this.z;
    }

    public void b(boolean bl) {
        this.g();
    }

    public ays_2 c(String string) {
        String string2 = this.y.get(string);
        if (string2 == null) {
            return null;
        }
        ays_2 ays_22 = ayu_2.a().a(auc_1.d(string2));
        if (ays_22 == null) {
            fyn fyn2 = (fyn)fze.a().b(ays_2.class);
            ays_22 = fyn2.a(ays_2.class, string2);
        }
        return ays_22;
    }

    public Set<String> i() {
        return ImmutableSet.copyOf(this.y.keySet());
    }

    public ayf_2 d(String string) {
        return this.v.get(string);
    }

    public HashMap<String, List<String>> j() {
        return this.x;
    }

    public azj_2 e(String string) {
        aqx_2 aqx_22 = this.t.get(string.toUpperCase());
        if (aqx_22 == null || !aqx_22.b().equalsIgnoreCase("color")) {
            return null;
        }
        if ((aqx_22 = aqx_22.f("color")) == null) {
            return null;
        }
        fzd<azj_2> fzd2 = fze.a().b(azj_2.class);
        return fzd2.b(azj_2.class, aqx_22.c());
    }

    public void k() {
    }

    public void l() {
    }
}

