/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from aCL
 */
public class acl_1 {
    private static final Logger a = Logger.getLogger(acl_1.class);
    private static boolean b = false;
    private static final HashMap<Class, HashMap<Object, StackTraceElement[]>> c = new HashMap();

    public static void a(boolean bl) {
        b = bl;
        if (bl) {
            c.clear();
        }
    }

    public static void a(Object object) {
        if (!b) {
            return;
        }
        HashMap<Object, Object> hashMap = c.get(object.getClass());
        if (hashMap == null) {
            hashMap = new HashMap();
            c.put(object.getClass(), hashMap);
        }
        hashMap.put(object, new Exception().getStackTrace());
    }

    public static void b(Object object) {
        if (c.isEmpty()) {
            return;
        }
        HashMap<Object, StackTraceElement[]> hashMap = c.get(object.getClass());
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        hashMap.remove(object);
    }

    public static HashMap<Class, HashMap<Object, StackTraceElement[]>> a() {
        HashMap<Class, HashMap<Object, StackTraceElement[]>> hashMap = new HashMap<Class, HashMap<Object, StackTraceElement[]>>();
        for (Map.Entry<Class, HashMap<Object, StackTraceElement[]>> entry : c.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}

