/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from aMS
 */
public final class ams_2
implements Iterable<amq_2> {
    private static final Logger a = Logger.getLogger(ams_2.class);
    private static final ams_2 b = new ams_2();
    private final HashMap<String, amq_2> c = new HashMap();

    public static ams_2 a() {
        return b;
    }

    private ams_2() {
    }

    public boolean a(String string) {
        File file = new File(string);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] fileArray = file.listFiles(new amt_2(this));
                boolean bl = true;
                for (File file2 : fileArray) {
                    if (!file2.isFile()) continue;
                    bl &= this.b(file2.getPath());
                }
                return bl;
            }
            a.error((Object)("[TASK MANAGER] Le chemin sp\u00e9cifi\u00e9 n'est pas un r\u00e9pertoire : " + file));
            return false;
        }
        a.error((Object)("[TASK MANAGER] Le chemin sp\u00e9cifi\u00e9 n'existe pas : " + file));
        return false;
    }

    public boolean b(String string) {
        File file = new File(string);
        if (file.exists() && file.isFile()) {
            atg_2 atg_22 = atg_2.a();
            ath_2 ath_22 = atg_22.b();
            try {
                atg_22.a(string);
                atg_22.a(ath_22, new aqy_2[]{amp_2.a});
                atg_22.l();
                a.info((Object)("[TASK MANAGER] Chargement de la configuration " + string + " ..."));
                amq_2 amq_22 = this.a(ath_22);
                if (amq_22 == null) {
                    return false;
                }
                this.b(amq_22);
            }
            catch (Exception exception) {
                a.error((Object)("[TASK MANAGER] Erreur durant la lecture du fichier (" + string + ") : "), (Throwable)exception);
                return false;
            }
        }
        return true;
    }

    private amq_2 a(aqv_2 aqv_22) {
        amq_2 amq_22 = null;
        aqx_2 aqx_22 = aqv_22.c("task");
        if (aqx_22 != null) {
            aqx_2 aqx_23 = aqx_22.f("name");
            if (aqx_23 == null) {
                throw new Exception("Attribut 'name' manquant");
            }
            aqx_2 aqx_24 = aqx_22.f("class");
            if (aqx_24 == null) {
                throw new Exception("Attribut 'class' manquant");
            }
            amq_22 = (amq_2)ams_2.d(aqx_24.c());
            amq_22.a(aqx_23.c());
            aqx_2 aqx_25 = aqx_22.c("dependencies");
            if (aqx_25 != null) {
                amr_2 amr_22 = new amr_2();
                ArrayList<aqx_2> arrayList = aqx_25.e("dependency");
                if (arrayList != null) {
                    for (aqx_2 aqx_26 : aqx_25.d("dependency")) {
                        aqx_2 aqx_27 = aqx_26.f("name");
                        if (aqx_27 == null) {
                            throw new Exception("dependences : Attribut 'name' manquant");
                        }
                        aqx_2 aqx_28 = aqx_26.f("state");
                        if (aqx_28 == null) {
                            throw new Exception("dependences : Attribute 'state' manquant");
                        }
                        amr_22.a(aqx_27.c(), aqx_28.c());
                    }
                    amq_22.a(amr_22);
                }
            }
            amq_22.a(aqv_22);
        }
        return amq_22;
    }

    private boolean b(amq_2 amq_22) {
        String string = amq_22.b();
        if (!this.c.containsValue(amq_22)) {
            if (!this.c.containsKey(string)) {
                this.c.put(string, amq_22);
                amq_22.a(this);
                return true;
            }
            a.error((Object)("[TASK MANAGER] T\u00e2che d\u00e9j\u00e0 enregistr\u00e9e : " + string));
        } else {
            a.error((Object)("[TASK MANAGER] T\u00e2che d\u00e9j\u00e0 enregistr\u00e9e : " + string));
        }
        return false;
    }

    public amq_2 c(String string) {
        return this.c.get(string);
    }

    public amq_2 a(Class clazz) {
        for (Map.Entry<String, amq_2> entry : this.c.entrySet()) {
            if (entry.getValue().getClass() != clazz) continue;
            return entry.getValue();
        }
        return null;
    }

    private boolean h() {
        Set<String> set = this.c.keySet();
        for (String string : set) {
            amq_2 amq_22 = this.c.get(string);
            if (amq_22 == null) {
                a.error((Object)("[TASK MANAGER] task null : " + string));
                continue;
            }
            a.info((Object)("[TASK MANAGER] Initialisation de la t\u00e2che " + amq_22.b() + " ... "));
            try {
                amq_22.d();
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)"[TASK MANAGER] Exception caught on initialization", (Throwable)runtimeException);
            }
            while (!amq_22.j()) {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    a.error((Object)"Exception during initializeTasks", (Throwable)interruptedException);
                }
                if (!amq_22.k()) continue;
                a.error((Object)("[TASK MANAGER] Erreur durant l'initialisation de la t\u00e2che " + amq_22.b()));
                return false;
            }
            a.info((Object)("[TASK MANAGER] t\u00e2che " + amq_22.b() + " initialis\u00e9e."));
        }
        return true;
    }

    public boolean b() {
        if (!this.h()) {
            return false;
        }
        add_2.b().c();
        ado_1.a().a(new amu_2(this), 1000L);
        return true;
    }

    public void c() {
        Set<String> set = this.c.keySet();
        for (String string : set) {
            amq_2 amq_22 = this.c.get(string);
            if (!amq_22.i()) continue;
            a.info((Object)("[TASK MANAGER] Arr\u00eat forc\u00e9 de la tache : " + string));
            amq_22.h();
        }
    }

    public void d() {
        String[] stringArray;
        Set<String> set = this.c.keySet();
        for (String string : stringArray = set.toArray(new String[set.size()])) {
            amq_2 amq_22 = this.c.get(string);
            if (!amq_22.m()) continue;
            this.c.remove(string);
        }
    }

    public boolean e() {
        Collection<amq_2> collection = this.c.values();
        for (amq_2 amq_22 : collection) {
            if (!amq_22.k()) continue;
            a.error((Object)("[TASK MANAGER] Erreur lors du d\u00e9marrage de la t\u00e2che " + amq_22.b()));
            return false;
        }
        for (amq_2 amq_22 : collection) {
            amq_2 amq_23;
            if (amq_22.i() || amq_22.m() || !amq_22.j()) continue;
            amr_2 amr_22 = amq_22.a();
            boolean bl = true;
            boolean bl2 = false;
            for (String string : amr_22.a()) {
                amq_23 = this.c.get(string);
                if (amq_23 != null) {
                    if (amq_23.j() || amq_23.i()) continue;
                    bl = false;
                    break;
                }
                a.error((Object)("[TASK MANAGER] Impossible de d\u00e9marrer la tache [" + amq_22.b() + "] : d\u00e9pendance manquante [" + string + "]"));
                bl = false;
                bl2 = true;
                break;
            }
            for (String string : amr_22.b()) {
                amq_23 = this.c.get(string);
                if (amq_23 != null) {
                    if (amq_23.i()) continue;
                    bl = false;
                    break;
                }
                a.error((Object)("[TASK MANAGER] Impossible de d\u00e9marrer la tache [" + amq_22.b() + "] : d\u00e9pendance manquante [" + string + "]"));
                bl = false;
                bl2 = true;
                break;
            }
            for (String string : amr_22.c()) {
                amq_23 = this.c.get(string);
                if (amq_23 != null) {
                    if (amq_23.m()) continue;
                    bl = false;
                    break;
                }
                a.error((Object)("[TASK MANAGER] Impossible de d\u00e9marrer la tache [" + amq_22.b() + "] : d\u00e9pendance manquante [" + string + "]"));
                bl = false;
                bl2 = true;
                break;
            }
            if (bl && !bl2) {
                try {
                    a.info((Object)("[TASK MANAGER] D\u00e9marrage de [" + amq_22.b() + "] ..."));
                    amq_22.f();
                    a.info((Object)("[TASK MANAGER] D\u00e9marrage de [" + amq_22.b() + "] termin\u00e9"));
                }
                catch (Throwable throwable) {
                    bl2 = true;
                    a.error((Object)"Une exception a ete levee dans le demarrage de la tache", throwable);
                }
            }
            if (!bl2) continue;
            switch (amq_22.c()) {
                case 1: {
                    a.error((Object)("[TASK MANAGER] Erreur de lancement de la t\u00e2che " + amq_22.b() + ", d\u00e9faut de d\u00e9pendence."));
                    return false;
                }
                case 2: {
                    a.info((Object)("[TASK MANAGER] La tache " + amq_22.b() + " n'a pas pu d\u00e9marrer, on rentente plus tard."));
                }
            }
        }
        return true;
    }

    public void a(amq_2 amq_22) {
        if (!amq_22.k()) {
            a.error((Object)("[TASK MANAGER] Annulation du d\u00e9marrage de la t\u00e2che " + amq_22.b() + "..."));
        }
    }

    public static Object a(String string, String string2, Class[] classArray, Object[] objectArray) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(string, true, ClassLoader.getSystemClassLoader());
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.error((Object)"Exception during invokeStaticMethod", (Throwable)classNotFoundException);
        }
        Object object = null;
        if (clazz != null) {
            try {
                Method method = clazz.getDeclaredMethod(string2, classArray);
                object = method.invoke(null, objectArray);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                a.error((Object)"NoSuchMethodException during invokeStaticMethod", (Throwable)noSuchMethodException);
            }
            catch (IllegalAccessException illegalAccessException) {
                a.error((Object)"IllegalAccessException during invokeStaticMethod", (Throwable)illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                a.error((Object)"InvocationTargetException during invokeStaticMethod", (Throwable)invocationTargetException);
            }
        }
        return object;
    }

    public static Object d(String string) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(string, true, ClassLoader.getSystemClassLoader());
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.error((Object)("Exception during instanceOfClass for class " + string), (Throwable)classNotFoundException);
        }
        Object object = null;
        if (clazz != null) {
            try {
                Method method = clazz.getDeclaredMethod("getInstance", new Class[0]);
                object = method.invoke(null, new Object[0]);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                try {
                    object = clazz.newInstance();
                }
                catch (InstantiationException instantiationException) {
                    a.error((Object)("InstantiationException during instanceOfClass for class " + string), (Throwable)instantiationException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    a.error((Object)("IllegalAccessException during instanceOfClass for class " + string), (Throwable)illegalAccessException);
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                a.error((Object)("IllegalAccessException during instanceOfClass for class " + string), (Throwable)illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                a.error((Object)("InvocationTargetException during instanceOfClass for class " + string), (Throwable)invocationTargetException);
            }
        }
        return object;
    }

    @Override
    public Iterator<amq_2> iterator() {
        return this.c.values().iterator();
    }

    public int f() {
        return this.c.size();
    }

    public Iterable<String> g() {
        return this.c.keySet();
    }
}

