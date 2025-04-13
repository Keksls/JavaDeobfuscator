/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Field;
import org.apache.log4j.Logger;

public final class emp {
    private static final Logger a = Logger.getLogger(emp.class);

    private emp() {
    }

    public static void a(aNB aNB2) {
        for (Field field : aNB2.getClass().getDeclaredFields()) {
            String string;
            String string2;
            emo emo2 = field.getAnnotation(emo.class);
            if (emo2 == null || (string2 = System.getenv(string = emo2.a())) == null) continue;
            try {
                field.set(aNB2, string2);
            }
            catch (IllegalAccessException illegalAccessException) {
                field.setAccessible(true);
                try {
                    field.set(aNB2, string2);
                }
                catch (IllegalAccessException illegalAccessException2) {
                    a.error((Object)("Unable to set option value for option : " + string + ", value : " + string2), (Throwable)illegalAccessException);
                }
            }
        }
    }
}

