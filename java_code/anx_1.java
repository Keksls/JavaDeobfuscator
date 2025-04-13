/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from anX
 */
public abstract class anx_1
implements aei_1 {
    protected final String a = "name";
    protected final String b = "id";
    protected final String c = "category";
    protected final String d = "group";
    protected final String e = "shortcut";
    protected final String f = "consoleCommand";
    protected final String g = "rebindAllowed";
    protected final String h = "alwaysValid";
    protected final String i = "altKey";
    protected final String j = "ctrlKey";
    protected final String k = "shiftKey";
    protected final String l = "keyCode";
    protected final String m = "keyRegExp";
    protected final String n = "params";
    protected final String o = "onKeyReleased";
    protected static final String p = "shortcuts";
    private static final Logger w = Logger.getLogger(anx_1.class);
    protected final HashMap<String, Boolean> q = new HashMap();
    protected final ArrayList<any_1> r = new ArrayList();
    protected final HashMap<String, any_1> s = new HashMap();
    protected final TLongObjectHashMap<any_1> t = new TLongObjectHashMap();
    protected final ArrayList<any_1> u = new ArrayList();
    private boolean x = true;
    private int y = -1;
    public static final String v = "binding";

    public void a(String string, boolean bl) {
        if (this.b(string)) {
            this.q.put(string, bl);
        }
    }

    public void a() {
        for (any_1 any_12 : this.s.values()) {
            any_12.e(true);
        }
    }

    public void b(String string, boolean bl) {
        any_1 any_12 = this.s.get(string);
        if (any_12 != null) {
            any_12.e(bl);
        }
    }

    public void c(String string, boolean bl) {
        atg_2 atg_22 = atg_2.a();
        Object d2 = atg_22.n();
        atg_22.a(string);
        atg_22.a(d2, new aqy_2[0]);
        atg_22.l();
        if (bl) {
            String string2 = gg_0.d(string).getFile();
            this.a((aqv_2)d2, string2);
        } else {
            this.a((aqv_2)d2);
        }
    }

    public void a(aqv_2 aqv_22) {
        ArrayList<aqx_2> arrayList = aqv_22.d("group");
        for (aqx_2 aqx_22 : arrayList) {
            ArrayList<aqx_2> arrayList2;
            String string;
            if (aqx_22.f("name") == null) {
                w.error((Object)"Nom de groupe invalide dans le chargement des raccourcis");
            }
            if (!this.b(string = aqx_22.f("name").c())) {
                this.q.put(string, false);
            }
            if ((arrayList2 = aqx_22.d("shortcut")) == null) continue;
            this.a(string, arrayList2, false, null);
        }
    }

    public void a(aqv_2 aqv_22, String string) {
        ArrayList<aqx_2> arrayList = aqv_22.d("shortcut");
        if (arrayList == null) {
            return;
        }
        this.a(null, arrayList, true, string);
    }

    private void a(String string, List<aqx_2> list, boolean bl, String string2) {
        HashSet<any_1> hashSet = new HashSet<any_1>();
        HashSet<Object> hashSet2 = new HashSet<Object>();
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            Object object;
            any_1 any_12;
            String string3;
            aqx_2 aqx_22 = list.get(k);
            aqx_2 aqx_23 = aqx_22.f("consoleCommand");
            aqx_2 aqx_24 = aqx_22.f("id");
            if (aqx_23 == null && aqx_24 == null) continue;
            String string4 = aqx_23 != null ? aqx_23.c() : null;
            boolean bl2 = aqx_22.f("ctrlKey") != null && aqx_22.f("ctrlKey").d();
            boolean bl3 = aqx_22.f("altKey") != null && aqx_22.f("altKey").d();
            boolean bl4 = aqx_22.f("shiftKey") != null && aqx_22.f("shiftKey").d();
            boolean bl5 = aqx_22.f("alwaysValid") != null && aqx_22.f("alwaysValid").d();
            String string5 = aqx_22.f("params") != null ? aqx_22.f("params").c() : null;
            boolean bl6 = aqx_22.f("onKeyReleased") != null && aqx_22.f("onKeyReleased").d();
            int n2 = aqx_22.f("keyCode") != null ? aqx_22.f("keyCode").g() : -1;
            String string6 = string3 = aqx_24 != null ? aqx_24.c() : null;
            if (bl) {
                any_12 = this.a(string3);
                if (any_12 == null) continue;
                hashSet.add(any_12);
                hashSet2.remove(any_12);
                object = (any_1)this.t.get(anx_1.a(n2, anx_1.a(bl4, bl3, bl2)));
                if (object != null && !hashSet.contains(object)) {
                    hashSet2.add(object);
                }
                this.a(any_12, n2, bl4, bl3, bl2, string5);
                continue;
            }
            any_12 = new any_1(string3, n2, string4, bl2, bl3, bl4, bl6, bl5, string5);
            object = aqx_22.f("category");
            String string7 = object != null ? object.c() : null;
            any_12.c(string7);
            this.c(any_12, string);
        }
        Iterator iterator = hashSet2.iterator();
        while (iterator.hasNext()) {
            this.a((any_1)iterator.next(), string2);
        }
    }

    private void a(any_1 any_12, int n, boolean bl, boolean bl2, boolean bl3, String string) {
        this.a(any_12, n, string, anx_1.a(bl, bl2, bl3));
    }

    private void a(any_1 any_12, int n, String string, int n2) {
        this.d(any_12);
        any_12.b(n);
        any_12.c(n2);
        if (string != null) {
            any_12.e(string);
        }
        this.c(any_12, any_12.j());
    }

    public boolean a(any_1 any_12) {
        return this.s.containsKey(any_12.g());
    }

    public any_1 a(String string) {
        return this.s.get(string);
    }

    public void a(any_1 any_12, String string) {
        try {
            this.a(any_12, -1, null, 0, string);
        }
        catch (Exception exception) {
            w.warn((Object)"Probl\u00e8me en d\u00e9sassignant le raccourci", (Throwable)exception);
        }
    }

    public void a(String string, int n, String string2, int n2, String string3) {
        this.a(this.a(string), n, string2, n2, string3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(any_1 any_12, int n, String string, int n2, String string2) {
        if (!this.a(any_12)) {
            return;
        }
        this.a(any_12, n, string, n2);
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        if (!gi_0.d(string2)) {
            atg_22.g(string2);
            ath_22.a(new ati_2(p, null));
            atg_22.a(ath_22, "");
            atg_22.l();
        }
        atg_22.a(string2);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ArrayList<aqx_2> arrayList = ath_22.d("shortcut");
        aqx_2 aqx_22 = null;
        if (arrayList != null) {
            for (aqx_2 aqx_23 : arrayList) {
                atj_2 atj_22;
                block20: {
                    if (aqx_23.f("id") == null || !aqx_23.f("id").c().equalsIgnoreCase(any_12.g())) continue;
                    aqx_22 = aqx_23;
                    int n3 = any_12.b();
                    if (aqx_23.f("keyCode") == null) {
                        if (n3 != -1) {
                            atj_22 = new atj_2("keyCode", String.valueOf(n3));
                            aqx_23.c(atj_22);
                            break block20;
                        } else {
                            w.warn((Object)"Le raccourci trouv\u00e9 ne poss\u00e8de pas de touche associ\u00e9e");
                            break;
                        }
                    }
                    aqx_23.f("keyCode").b(n);
                }
                if (any_12.e()) {
                    if (aqx_23.f("shiftKey") != null) {
                        aqx_23.f("shiftKey").a(true);
                    } else {
                        atj_22 = new atj_2("shiftKey", String.valueOf(true));
                        aqx_23.c(atj_22);
                    }
                } else if (aqx_23.f("shiftKey") != null) {
                    aqx_23.d(aqx_23.f("shiftKey"));
                }
                if (any_12.d()) {
                    if (aqx_23.f("altKey") != null) {
                        aqx_23.f("altKey").a(true);
                    } else {
                        atj_22 = new atj_2("altKey", String.valueOf(true));
                        aqx_23.c(atj_22);
                    }
                } else if (aqx_23.f("altKey") != null) {
                    aqx_23.d(aqx_23.f("altKey"));
                }
                if (any_12.c()) {
                    if (aqx_23.f("ctrlKey") != null) {
                        aqx_23.f("ctrlKey").a(true);
                        continue;
                    }
                    atj_22 = new atj_2("ctrlKey", String.valueOf(true));
                    aqx_23.c(atj_22);
                    continue;
                }
                if (aqx_23.f("ctrlKey") == null) continue;
                aqx_23.d(aqx_23.f("ctrlKey"));
            }
        }
        if (aqx_22 == null) {
            this.a(any_12, ath_22, false);
        }
        atg_22.g(string2);
        atg_22.a(ath_22);
        atg_22.l();
    }

    private void c(any_1 any_12, String string) {
        any_12.b(string);
        this.r.add(any_12);
        if (any_12.g() != null) {
            this.s.put(any_12.g(), any_12);
        }
        long l = anx_1.c(any_12);
        this.t.put(l, (Object)any_12);
    }

    private void d(any_1 any_12) {
        this.r.remove(any_12);
        this.s.remove(any_12.g());
        long l = anx_1.c(any_12);
        if (this.t.get(l) == any_12) {
            this.t.remove(l);
        }
    }

    public void a(any_1 any_12, String string, String string2) {
        if (this.a(any_12)) {
            return;
        }
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        if (!gi_0.d(string2)) {
            atg_22.g(string2);
            ath_22.a(new ati_2(p, null));
            atg_22.a(ath_22, "");
            atg_22.l();
        }
        atg_22.a(string2);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        this.c(any_12, string);
        this.a(any_12, ath_22, true);
        atg_22.g(string2);
        atg_22.a(ath_22);
        atg_22.l();
    }

    public void b(any_1 any_12, String string) {
        if (!this.a(any_12)) {
            return;
        }
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        if (!gi_0.d(string)) {
            atg_22.g(string);
            ath_22.a(new ati_2(p, null));
            atg_22.a(ath_22, "");
            atg_22.l();
        }
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ArrayList<aqx_2> arrayList = ath_22.d("shortcut");
        if (arrayList == null) {
            w.error((Object)("impossible de supprimer le raccourci du document " + string + "qui semble vide"));
            return;
        }
        for (aqx_2 aqx_22 : arrayList) {
            if (aqx_22.f("id") == null || !aqx_22.f("id").c().equalsIgnoreCase(any_12.g())) continue;
            ath_22.a().b(aqx_22);
        }
        this.d(any_12);
        atg_22.g(string);
        atg_22.a(ath_22);
        atg_22.l();
    }

    public void a(any_1 any_12, ath_2 ath_22, boolean bl) {
        ati_2 ati_22 = new ati_2("shortcut", null);
        if (any_12.g() != null && any_12.g().length() > 0) {
            ati_22.c(new atj_2("id", any_12.g()));
        }
        if (bl) {
            if (any_12.j() != null && any_12.j().length() > 0) {
                ati_22.c(new atj_2("name", any_12.j()));
            }
            if (any_12.a() != null && any_12.a().length() > 0) {
                ati_22.c(new atj_2("consoleCommand", any_12.a()));
            }
        }
        if (any_12.m() != null && any_12.m().length() > 0) {
            ati_22.c(new atj_2("params", any_12.m()));
        }
        if (any_12.d()) {
            ati_22.c(new atj_2("altKey", "true"));
        }
        if (any_12.c()) {
            ati_22.c(new atj_2("ctrlKey", "true"));
        }
        if (any_12.e()) {
            ati_22.c(new atj_2("shiftKey", "true"));
        }
        ati_22.c(new atj_2("keyCode", String.valueOf(any_12.b())));
        ath_22.a().a(ati_22);
    }

    private aqx_2 a(String string, aqx_2 aqx_22) {
        ati_2 ati_22 = new ati_2("group", null);
        if (string != null && string.length() > 0) {
            ati_22.c(new atj_2("name", string));
            aqx_22.a(ati_22);
        }
        aqx_22.a(ati_22);
        return ati_22;
    }

    public void b(any_1 any_12, String string, String string2) {
        if (!this.a(any_12)) {
            return;
        }
        any_12.e(string);
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        if (!gi_0.d(string2)) {
            atg_22.g(string2);
            ath_22.a(new ati_2(p, null));
            atg_22.a(ath_22, "");
            atg_22.l();
        }
        atg_22.a(string2);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ArrayList<aqx_2> arrayList = ath_22.a().d("shortcut");
        aqx_2 aqx_22 = null;
        if (arrayList != null) {
            for (aqx_2 aqx_23 : arrayList) {
                if (aqx_23.f("id") == null || !aqx_23.f("id").c().equalsIgnoreCase(any_12.g())) continue;
                aqx_22 = aqx_23;
                if (aqx_23.f("params") == null) {
                    aqx_23.c(new atj_2("params", string));
                    continue;
                }
                aqx_23.f("params").b(string);
            }
        }
        if (aqx_22 == null) {
            this.a(any_12, ath_22, false);
        }
        atg_22.g(string2);
        atg_22.a(ath_22);
    }

    public void a(boolean bl) {
        this.x = bl;
    }

    public boolean b() {
        return this.x;
    }

    public void a(String string, anz_1 anz_12) {
        any_1 any_12 = this.s.get(string);
        if (any_12 != null && this.c(any_12.j())) {
            any_12.a(anz_12);
        }
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18) {
            return false;
        }
        any_1 any_12 = (any_1)this.t.get(anx_1.e(keyEvent));
        if (any_12 != null && this.c(any_12.j())) {
            return any_12.f();
        }
        return false;
    }

    private boolean e(any_1 any_12) {
        if (any_12 == null) {
            return false;
        }
        if (!this.c(any_12.j()) || !any_12.h()) {
            return false;
        }
        return this.x || any_12.f();
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18) {
            return false;
        }
        this.y = -1;
        any_1 any_12 = (any_1)this.t.get(anx_1.a(keyEvent.getKeyCode(), 0));
        if (!this.e(any_12) || !any_12.n()) {
            return false;
        }
        if (!this.u.contains(any_12)) {
            return false;
        }
        this.u.remove(any_12);
        return this.b(any_12);
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18 || this.y == keyEvent.getKeyCode()) {
            return false;
        }
        this.y = -1;
        any_1 any_12 = (any_1)this.t.get(anx_1.e(keyEvent));
        if (!this.e(any_12) || any_12.n() && this.u.contains(any_12)) {
            return false;
        }
        if (any_12.n()) {
            this.u.add(any_12);
        }
        return this.b(any_12);
    }

    public abstract boolean b(any_1 var1);

    public any_1[] c() {
        return this.r.toArray(new any_1[this.r.size()]);
    }

    public boolean b(String string) {
        return this.q.containsKey(string);
    }

    public boolean c(String string) {
        Boolean bl = this.q.get(string);
        return bl != null && bl != false;
    }

    public void d() {
        for (any_1 any_12 : this.u) {
            this.b(any_12);
        }
        this.u.clear();
        this.a(-1);
    }

    public void a(int n) {
        this.y = n;
    }

    public static long e(KeyEvent keyEvent) {
        int n = keyEvent.getModifiersEx();
        boolean bl = (n & 0x40) == 64;
        boolean bl2 = (n & 0x200) == 512;
        boolean bl3 = (n & 0x80) == 128;
        return anx_1.a(keyEvent.getKeyCode(), anx_1.a(bl, bl2, bl3));
    }

    public static long c(any_1 any_12) {
        return anx_1.a(any_12.b(), any_12.l());
    }

    public static long a(int n, int n2) {
        return Hw.c(n, n2);
    }

    public static int a(boolean bl, boolean bl2, boolean bl3) {
        int n = 0;
        if (bl) {
            n |= 0x40;
        }
        if (bl2) {
            n |= 0x200;
        }
        if (bl3) {
            n |= 0x80;
        }
        return n;
    }
}

